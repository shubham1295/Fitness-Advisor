package org.sunbeam.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.sunbeam.pojo.Members;
import org.sunbeam.pojo.User;
import org.sunbeam.service.MemberService;
import org.sunbeam.service.ProfileService;

@Controller
@RequestMapping("member")
public class MemberController {

	@Autowired
	private MemberService service;
	
	@Autowired
	private ProfileService profileservice;
	
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
			session.setAttribute("membSession", usr);
			if(usr.getPerm().equals("member"))
			{
				return "redirect:/member/details";
			}
			return "redirect:/admin/trainer";
		}		return "/user/Login";
	}
	
	//Diet
	
	@GetMapping("/details")
	public String showDetails()
	{
		return "/user/Details";
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
}
