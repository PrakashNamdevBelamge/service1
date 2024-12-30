package com.gcp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NitorApplication {

	@GetMapping(value = "/service-1")
	public String getMessage(){
		return "Hello iam service1";
	}

	public static void main(String[] args) {
		SpringApplication.run(NitorApplication.class, args);
	}

}
