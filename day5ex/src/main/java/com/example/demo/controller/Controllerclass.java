package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Modelclass;
import com.example.demo.service.Serviceclass;

@RestController
public class Controllerclass {

	@Autowired
	Serviceclass s;
	@PostMapping("addstudent")
	public Modelclass addto(@RequestBody Modelclass ss)
	{
		return s.saveinfo(ss);
	}
	@GetMapping("getstudent")
	public List<Modelclass> show(Modelclass ss)
	{
		return s.showinfo(ss);
	}
	@PutMapping("updatestudent")
	public Modelclass update(@RequestBody Modelclass ss)
	{
		return s.updateinfo(ss);
	}
	@DeleteMapping("deletestudent")
	public String delete(@RequestBody Modelclass ss)
	{
		 s.deleteinfo(ss);
		 return "Deleted successfully";
	}
}
