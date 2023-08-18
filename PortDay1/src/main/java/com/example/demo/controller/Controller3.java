package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller3 {
	
	@Value("${color}")
	private String favcolour;
	@GetMapping("colour")
	public String display()
	{
		return "My favorite color is  "+favcolour +"!";
	}

}
