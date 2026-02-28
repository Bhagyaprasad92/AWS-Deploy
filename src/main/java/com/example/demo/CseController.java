package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseController {
	@GetMapping("/home")
	public String disk() {
		return "By 23mh1a05f7!";
	}
	@GetMapping("/prasad")
	public String disk2() {
		return "Hello! I'm Bhagya Prasad(23MH1A05F7)!";
	}
}
