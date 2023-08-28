package com.busmanagement.processapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ProcessApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcessApiApplication.class, args);
	}

}
