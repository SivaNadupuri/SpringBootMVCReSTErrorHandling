package com.error.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
	
	@GetMapping("/showA")
	public String showA() {
		
		if(new Random().nextInt(10)<=10)
			throw new RuntimeException("Sample");
		return "Welcome";
	}
	
	@GetMapping("/showB")
	public String showB() {
		
		if(new Random().nextInt(10)<=10)
			throw new EmployeeNotFoundExeception("Sample");
		return "Welcome";
	}

}
