package com.Ambuj.Wipro.DoConnect.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Ambuj.Wipro.DoConnect.data.UserDetails;
import com.Ambuj.Wipro.DoConnect.repo.UserRegistrationRepo;






@Controller
public class UserLogin 
{
	@Autowired
	private UserRegistrationRepo repo;
	
	@GetMapping("/userlogin")
	public String login() {
		return "userlogin";
	}
	
	@PostMapping("/welcome")
	public String login(@RequestParam(name="email") String email,@RequestParam(name="password") String password,ModelMap model) {
		UserDetails user=repo.findByEmail(email);
		if(user==null) {
			model.put("error","<h2 style='color:red;'> Your email Address is incorrect please login Again");
			return "userlogin";
		}
		else if(user.getPassword().equals(password)) {
			model.put("name", user.getFirstname());
			model.put("last",user.getLastname());
		return "welcome";
	}
		else {
			model.put("error","<h2 style='color:red;' >Your password is incorrect");
			return "userlogin";
		}
	}
}


