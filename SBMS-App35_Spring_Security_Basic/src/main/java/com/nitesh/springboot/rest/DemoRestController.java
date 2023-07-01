package com.nitesh.springboot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	
	
	@GetMapping("/hello")
	public String getGreet() {
		return "Hello, Welcome to Spring Security....";
	}

}
