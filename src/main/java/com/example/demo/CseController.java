package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseController {
	@GetMapping("/home")
	public String disk() {
		return "Welcome to Cse Jenkins!";
	}
	@GetMapping("/cse")
	public String disk2() {
		return "Welcome to Aditya University!";
	}
}
