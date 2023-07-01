package com.nitesh.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	
	
	
	//Used with MethodSecurity...
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		return http.csrf((csrf) -> csrf.disable())
				.authorizeHttpRequests()requestMatchers("hello", "/contact").permitAll()
				.authorizeHttpRequests(requestMatchers("/balance").authenticated()
				.authorizeHttpRequests(requestMatchers("/account").authenticated()
				.formLogin(Customizer.withDefaults())
				.build();
	}
	
	
	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails user = User.builder()
	            .username("user")
	            .password(encoder().encode("123"))
	            .roles("USER")
	            .build();
		
		UserDetails admin = User.builder()
	            .username("admin")
	            .password(encoder().encode("456"))
	            .roles("ADMIN")
	            .build();
		
		return new InMemoryUserDetailsManager(user, admin);
		
	}
	
	
}
