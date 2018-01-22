package org.sunbeam.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.sunbeam.pojo.Admin;
import org.sunbeam.service.AdminService;

@Controller
@RequestMapping("admin")
public class AdminController {

	@Autowired
	private AdminService service;
	
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
	public String showAddTrainer()
	{
		return "/user/AddTrainer";
	}
	
}
