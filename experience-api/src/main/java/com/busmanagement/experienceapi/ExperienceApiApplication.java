package com.busmanagement.experienceapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ExperienceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExperienceApiApplication.class, args);
	}

}
