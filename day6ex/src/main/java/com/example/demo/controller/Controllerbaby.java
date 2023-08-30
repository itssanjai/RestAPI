package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Modelbaby;
import com.example.demo.service.Servicebaby;


@RestController
public class Controllerbaby {

	@Autowired
	Servicebaby s;
	@PostMapping("addbaby")
	public Modelbaby dispalyinfo(@RequestBody Modelbaby ss)
	{
		return s.addinfo(ss);
	}
	@GetMapping("getbaby")
	public List<Modelbaby> shoeinfo()
	{
		return s.showinfo();
	}
	@PutMapping("putbaby")
	public Modelbaby upinfo(@RequestBody Modelbaby ss)
	{
		return s.updateinfo(ss);
	}
	@DeleteMapping("deletebaby")
	public String del(@RequestBody Modelbaby ss)
	{
		s.deleteinfo(ss);
		return "Deleted Successfully";
	}
	//Sorting
	@GetMapping("sorti/{name}")
	public List<Modelbaby> showsort(@PathVariable String name) 
	{
		return s.showinfosort(name);
	}
	@GetMapping("paging/{pageno}/{pagesize}")
	public List<Modelbaby> showpageinfo(@PathVariable int pageno,@PathVariable int pagesize)
	{
         //sser.sortinfo(name);
         return s.getbypage(pageno, pagesize);
		}
}
