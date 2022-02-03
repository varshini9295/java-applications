package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleProjectApplication.class, args);
		System.out.print("varshini ");
		int a = 5;
		int b = 5;
		int sum = a+b;
		System.out.println("sum is :" + sum);

	}

}
