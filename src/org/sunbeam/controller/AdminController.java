package org.sunbeam.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.sunbeam.pojo.Admin;
import org.sunbeam.pojo.Members;
import org.sunbeam.pojo.Trainers;
import org.sunbeam.pojo.User;
import org.sunbeam.service.AdminService;
import org.sunbeam.service.MemberService;
import org.sunbeam.service.TrainerService;

@Controller
@RequestMapping("admin")
public class AdminController {

	@Autowired
	private AdminService service;
	@Autowired
	private TrainerService trainerService;
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/login")	
	public String showLoginForm( Admin admin )
	{
		return "/user/AdminLogin";
	}
	
	
	@PostMapping("/login")
	public String validateCustomer( Admin admin, HttpSession session )
	{		
		Admin adm = service.validate(admin.getEmail(), admin.getPassword());
		System.out.println(adm);	
		if( adm != null )
		{
			session.setAttribute("membSession", adm);
			return "redirect:/admin/page";
		}		return "/user/AdminLogin";
	}
	
	//Admin Page
	
	@GetMapping("/page")
	public String showDetails()
	{
		return "/user/AdminPage";
	}
	
	//Add Trainer
	
	@GetMapping("/add-trainer")
	public String showAddTrainer( User user )
	{
		return "/user/AddTrainer";
	}
	
	@PostMapping("/add-trainer")	
	public String registerTrainer( User user )
	{	
		String regStatus = memberService.InsertMember(user);
		if( regStatus.equals("ok"))
			return "redirect:/admin/page";
		return "/user/AddTrainer";
	}
	
	//trainer
	@GetMapping("/trainer")
	public String showTrainer( User user )
	{
		return "/user/TrainerPage";
	}
	
	//Trainer profile
	
	@GetMapping("/profile")
	public String showProfileForm( Members member )
	{		
		return "/user/TrainerProfile";
	}
	
	@PostMapping("/profile")	
	public String submitProfile( Trainers trainer ,HttpSession session )
	{	
		System.out.println(trainer);
		User u =(User)session.getAttribute("membSession");
		System.out.println(u.getUid());
		String regStatus = trainerService.UpdateProfile(trainer,u.getUid());
		if( regStatus.equals("ok"))
			return "redirect:/member/details";
		return "/user/Profile";
	}
}
