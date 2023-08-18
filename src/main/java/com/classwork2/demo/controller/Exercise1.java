package com.classwork2.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise1 {
	@Value("${va}")
	private String name;
	@GetMapping("/")
	public String disp() {
		return "HELLO "+name+"!";																																																	
	}
}
