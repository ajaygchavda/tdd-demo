package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TddDemoApplication {

	public static void main(String[] args) {
		new StringAddition().add("10,23,34");
		//SpringApplication.run(TddDemoApplication.class, args);
	}

}
