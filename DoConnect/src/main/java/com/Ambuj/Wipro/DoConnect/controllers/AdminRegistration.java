package com.Ambuj.Wipro.DoConnect.controllers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Ambuj.Wipro.DoConnect.data.AdminDetails;

import com.Ambuj.Wipro.DoConnect.repo.AdminRepo;


	



	@Controller
	public class AdminRegistration { 
		@Autowired
		private AdminRepo repo;
		
		@GetMapping("/adminregistration")
		public String home(Model model)
		{
			AdminDetails adminDetails=new AdminDetails();
			model.addAttribute("adminDetails",adminDetails);
			return "adminregistration";
		}
		
		
		@PostMapping("/adminregistration")
		public String register(@ModelAttribute("adminDetails")AdminDetails adminDetails,ModelMap model)
		{
			if((adminDetails.getFirstname()).length()<3 || adminDetails.getFirstname().length()>15) {
				model.put("errormessage","<h2 Style='color:red;'>Firstname must be between 3 to 15 characters in length ");
			return "adminregistration";
			}
			else if((adminDetails.getLastname()).length()<3 || adminDetails.getLastname().length()>15) {
				model.put("errormessage","<h2 Style='color:red;'>Lastname must be between 3 to 15 characters in length ");
			return "adminregistration";
			}
			else if((adminDetails.getLastname()).length()<3 || adminDetails.getLastname().length()>15) {
				model.put("errormessage","<h2 Style='color:red;'>Lastname must be between 3 to 15 characters in length ");
			return "adminregistration";
			}
			else if((adminDetails.getPassword()).length()<8) {
				model.put("errormessage","<h2 Style='color:red;'>Password must be greater than 8 characters in length ");
			return "adminregistration";
			}
			String email=adminDetails.getEmail();
			String regex = "^(.+)@(.+)$"; 
			Pattern pattern = Pattern.compile(regex);  
			Matcher matcher = pattern.matcher(email); 
			 if(!matcher.matches()) {
				 model.put("errormessage","<h2 Style='color:red;'>Email must contain @ in it ");
					return "adminregistration";
			}
			 else {
				 AdminDetails admin=repo.findByEmail(adminDetails.getEmail());
				 if(admin==null) {
			System.out.println(adminDetails);
			repo.save(adminDetails);
			model.put("message","Admin Registered Successfully");
			return "adminregistration";
			}
				 else {
					 model.put("errormessage","<h2 Style='color:red;'>Email already exist ");
						return "adminregistration";
				 }
		}
	  }
	}


