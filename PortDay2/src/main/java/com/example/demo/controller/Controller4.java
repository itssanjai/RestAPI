package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller4 {
	@Value("${nam}")
	private String name;
	@GetMapping("con")
	public String display()
	{
		return name;
	}

}
