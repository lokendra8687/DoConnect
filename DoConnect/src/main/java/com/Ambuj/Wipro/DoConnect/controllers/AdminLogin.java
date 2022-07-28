package com.Ambuj.Wipro.DoConnect.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Ambuj.Wipro.DoConnect.data.AdminDetails;
import com.Ambuj.Wipro.DoConnect.repo.AdminRepo;






@Controller
public class AdminLogin 
{
	@Autowired
	private AdminRepo repo;
	
	@GetMapping("/adminlogin")
	public String login() {
		return "adminlogin";
	}
	
	@PostMapping("/welcomeadmin")
	public String login(@RequestParam(name="email") String email,@RequestParam(name="password") String password,ModelMap model) {
		AdminDetails admin=repo.findByEmail(email);
		if(admin==null) {
			model.put("error","<h2 style='color:red;'> Your email Address is incorrect please login Again");
			return "adminlogin";
		}
		else if(admin.getPassword().equals(password)) {
			model.put("name", admin.getFirstname());
			model.put("last",admin.getLastname());
		return "welcomeadmin";
	}
		else {
			model.put("error","<h2 style='color:red;' >Your password is incorrect");
			return "adminlogin";
		}
	}
}



