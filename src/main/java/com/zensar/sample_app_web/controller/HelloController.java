package com.zensar.sample_app_web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "<h1>Welcome to Jenkins <h1>";
		
		
	}

}
