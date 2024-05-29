package com.zensar.sample_app_web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "<h1>Welcome to Jenkins <h1>";	
	}
	
	@RequestMapping("/bye")
	public String sayBye() {
		return "<h1>Bye Bye <h1>";	
	}
	
	@RequestMapping("/greet")
	public String sayGreet() {
		return "<h1>Good Morning !! <h1>";	
	}

}
