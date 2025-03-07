package com.elephant.demoelephant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class DemoelephantApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoelephantApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return String.format("Hello");
	}

}
