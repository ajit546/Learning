package com.stack.springbootblock;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@GetMapping("/helloWorld")
	
	public String helloDetails()
	{
		return "hello world programme";
	}
	


}
