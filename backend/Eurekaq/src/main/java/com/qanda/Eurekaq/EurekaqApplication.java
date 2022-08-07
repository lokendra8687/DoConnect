package com.qanda.Eurekaq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class EurekaqApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaqApplication.class, args);
	}

}
