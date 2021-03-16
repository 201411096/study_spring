package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	// mvnw spring-boot:run

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value="name", defaultValue = "World") String name){
		return String.format("Hello %s!", name);
	}

	/*
	Build an executable JAR

	1. build the JAR file
	mvnw clean package
	2. run the JAR file
	java -jar target/demo-0.0.1-SNAPSHOT.jar

	 */
}
