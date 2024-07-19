package com.spring.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.spring.user"})
public class UserAccessManagmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserAccessManagmentApplication.class, args);
	}

}
