package com.stack.springbootblock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class SpringbootBlockApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBlockApplication.class, args);
		
		
		
	}
	@GetMapping("/Beancalling")
	public Details group()
	{
		return new Details("Dabbu","xyz",780000);
	}

}
