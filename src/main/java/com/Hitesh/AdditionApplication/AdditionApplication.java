package com.Hitesh.AdditionApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdditionApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdditionApplication.class, args);
	Addition addition= new Addition();
	int sum= addition.sum(20, 60);
	System.out.println("The addition of a and b is " +sum);
	
	}

}
