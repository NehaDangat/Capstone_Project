package com.hdfc.employeeManagement;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication

public class EmployeeManagementSystemApplication {

	private static final Logger LOGGER = Logger.getLogger(EmployeeManagementSystemApplication.class.getName());
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
		
		LOGGER.info("Received request");
        // process request
       LOGGER.info("Completed request");

	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		
		return new RestTemplate();
	}

}
