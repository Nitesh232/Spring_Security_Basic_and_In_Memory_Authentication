package com.nitesh.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SbmsApp35SpringSecurityBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbmsApp35SpringSecurityBasicApplication.class, args);
	}

}
