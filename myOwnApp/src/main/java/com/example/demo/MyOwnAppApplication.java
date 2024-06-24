package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyOwnAppApplication {

	public static void main(String[] args) {
		System.out.println("Hii ");
		SpringApplication.run(MyOwnAppApplication.class, args);
	}

}
