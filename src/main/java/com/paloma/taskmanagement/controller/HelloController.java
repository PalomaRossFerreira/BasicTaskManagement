package com.paloma.taskmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HelloController {
	@GetMapping(path = "/")
	public String hello() {
		System.out.println("Oi");
		return "opostman";
	}
	
	@GetMapping(path = "/m")
	public String bye() {
		return "bye";
	}
}
