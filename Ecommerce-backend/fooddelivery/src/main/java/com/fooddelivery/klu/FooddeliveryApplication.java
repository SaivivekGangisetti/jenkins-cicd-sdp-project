package com.fooddelivery.klu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class FooddeliveryApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(FooddeliveryApplication.class, args);
		System.out.println("cicd project is running");
	}

}
