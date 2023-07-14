package com.zimttech.diabeticscreening;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class DiabeticScreeningApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiabeticScreeningApplication.class, args);
	}

}
