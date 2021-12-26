package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}

}
// Use either one:

// To run using Maven: './mvnw spring-boot:run'
// Build JAR file : './mvnw clean package', then run the JAR file: 'java -jar target/gs-rest-service-0.1.0.jar'