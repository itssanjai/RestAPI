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

import com.example.demo.model.Modelbike;
import com.example.demo.service.Servicebike;


@RestController
public class Controllerbike {

	@Autowired
	Servicebike y;
	@PostMapping("addbikeone")
	public Modelbike addayo(@RequestBody Modelbike ss)
	{
		return y.adday(ss);
	}
	@GetMapping("getbikeone")
	public List<Modelbike>getdayo()
	{
		return y.getday();
	}
	@GetMapping("getbikeone/{year}")
	public List<Modelbike> getownero(@PathVariable int year)
	{
		return y.getowner(year);
	}
	@GetMapping("getbiketwo/{address}")
	public List<Modelbike> getaddresso(@PathVariable int year,@PathVariable String bikename)
	{
		return y.getaddress(year,bikename);
	}
	@PutMapping("putbike")
	public Modelbike updayo(@RequestBody Modelbike ss)
	{
		return y.upday(ss);
	}
	@DeleteMapping("deletebike")
	public void deldayo(@RequestBody Modelbike ss)
	{
		y.delday(ss);
	}
}
