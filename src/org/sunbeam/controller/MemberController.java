package org.sunbeam.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.sunbeam.Tool.Tool;
import org.sunbeam.pojo.DietPlan;
import org.sunbeam.pojo.Health;
import org.sunbeam.pojo.Members;
import org.sunbeam.pojo.User;
import org.sunbeam.service.DietService;
import org.sunbeam.service.HealthService;
import org.sunbeam.service.MemberService;
import org.sunbeam.service.ProfileService;

@Controller
@RequestMapping("member")
public class MemberController {

	@Autowired
	private MemberService service;
	
	@Autowired
	private ProfileService profileservice;
	
	@Autowired
	private HealthService healthService;
	
	@Autowired
	private DietService dietService;
	
	@GetMapping("/register")
	public String showRegistrationForm( User user )
	{				
		return "/user/Registration";
	}
	
	@PostMapping("/register")	
	public String registerUser( User user, HttpSession session )
	{	
		String regStatus = service.InsertMember(user);
		User usr = service.validate(user.getEmail(), user.getName());
		System.out.println(usr);
		if( regStatus.equals("ok"))
			return "redirect:/member/login";
		return "/user/Registration";
	}
	
	
	@GetMapping("/login")	
	public String showLoginForm( User user )
	{
		return "/user/Login";
	}
	
	
	@PostMapping("/login")
	public String validateCustomer( User user, HttpSession session )
	{		
		User usr = service.validate(user.getEmail(), user.getPassword());
		System.out.println(usr);	
		if( usr != null )
		{
			Members mem = profileservice.GetMember(usr.getUid());
			session.setAttribute("membSession", usr);
			if(usr.getPerm().equals("member"))
			{
				return "redirect:/member/details/"+mem.getGender()+"/"+mem.getAge()+"/"+mem.getHeight()+"/"+mem.getWeight();
			}
			return "redirect:/admin/trainer";
		}		return "/user/Login";
	}

	//profile
	
	@GetMapping("/profile")
	public String showProfileForm( Members member )
	{		
		return "/user/Profile";
	}
	
	@PostMapping("/profile")	
	public String submitProfile( Members member,HttpSession session )
	{	
		System.out.println(member);
		User u =(User)session.getAttribute("membSession");
		System.out.println(u.getUid());
		String regStatus = profileservice.UpdateProfile(member,u.getUid());
		if( regStatus.equals("ok"))
			return "redirect:/member/details";
		return "/user/Profile";
	}
	
	//workout
	
	@GetMapping("/workout")
	public String showWorkout(  )
	{		
		return "/user/Workout";
	}
	
	
	//Diet
	
	@GetMapping("/details/{gender}/{age}/{height}/{weight}")
	public String showDetails( @PathVariable String gender, @PathVariable Integer age, @PathVariable Integer height, @PathVariable Integer weight, ModelMap map )
	{
		String bmi = Tool.bmiCalc(height, weight);
		Health h = new Health();
		h.setGender(gender);
		h.setAge(age);
		h.setBmi(bmi);
		List<Integer> dids = healthService.GetDpid(h);
		if(!dids.isEmpty()){
			List<DietPlan> dietplan = new ArrayList<>();
			for(Integer id : dids){
				dietplan.add(dietService.GetDpid(id));
			}
			map.addAttribute("dietplan", dietplan);
			return "/user/Details";
		}
		return "redirect:/member/details";		
	}
}
