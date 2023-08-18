package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {
	
	@Value("${name}")
	private String studentName;
	@GetMapping("getname")
	public String display()
	{
		return "Welcome "+studentName +"!";
	}

}
