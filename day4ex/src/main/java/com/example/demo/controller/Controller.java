package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ModelClass;
import com.example.demo.service.Serviceclass;

@RestController
public class Controller {

	@Autowired
	Serviceclass s;
	@PostMapping("addstun")
	public ModelClass add(@RequestBody ModelClass ss)
	{
		return s.saveinfo(ss);
	}
	@GetMapping("showdetail")
	public List<ModelClass> show()
	{
		return s.showinfo();
	}
}
