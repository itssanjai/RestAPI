package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Modelclass;
import com.example.demo.service.Serviceclass;

@RestController
public class Controllerclass {

	@Autowired
	Serviceclass a;
	@PostMapping("addstu")
	public Modelclass add(@RequestBody Modelclass ss)
	{
		return a.saveinfo(ss);
	}
	@GetMapping("showdet")
	public List<Modelclass> show()
	{
		return a.showinfo();
	}
}