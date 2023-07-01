package com.nitesh.springboot.rest;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableMethodSecurity
public class DemoRestController {
	
	
	
	@GetMapping("/hello")
	public String getGreet() {
		return "Hello, Welcome to Spring Security....";
	}
	
	@GetMapping("/balance")
	@PreAuthorize("hasRole('ADMIN')")
	public String getBalance() {
		return "Remained Balance is -95Rs.";
	}
	
	
	@GetMapping("/account")
	@PreAuthorize("hasRole('USER')")
	public String getDetails() {
		return "xyz Bank at 123 Branch.";
	}
	
	@GetMapping("/contact")
	public String getContact() {
		return "Thankyou for contacting Us.";
	}
	
	

}
