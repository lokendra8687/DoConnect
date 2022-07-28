package com.Ambuj.Wipro.DoConnect.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePage 
{
	@RequestMapping
	public String homePage()
	{
		return "homePage";
	}
}
