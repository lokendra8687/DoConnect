package com.qanda.Emailq.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qanda.Emailq.Service.EmailSenderService;

@RestController
@RequestMapping("email")
@CrossOrigin

public class EmailqController {
	@Autowired
	private EmailSenderService senderService;
	
	@GetMapping("/map")
	public void sendMail() {
		//Admin 1
//		senderService.sendEmail("doconnectcapstone5@gmail.com", "New Question Has been added",
//				"A new question has been added to database, please check it out here : http://localhost:4200/admindashboard");
		//Admin 2
		senderService.sendEmail("lokedra87@gmail.com", "New Question Has been added",
				"A new question has been added to database, please check it out here : http://localhost:4200/admindashboard");
		
		
	}

	@GetMapping("/mapans")
	public void sendMailAns() {
		senderService.sendEmail("lokedra87@gmail.com", "New Answer Has been added",
				"Answer has been posted by the user, please check it out here : http://localhost:4200/admindashboard");
		}

}
