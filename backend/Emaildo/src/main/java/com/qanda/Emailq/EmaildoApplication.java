package com.qanda.Emailq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class EmaildoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmaildoApplication.class, args);
	}

}
