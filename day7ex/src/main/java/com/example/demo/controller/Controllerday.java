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

import com.example.demo.model.Modelday;
import com.example.demo.service.Serviceday;

@RestController
public class Controllerday {

	@Autowired
	Serviceday y;
	@PostMapping("addbike")
	public Modelday addayo(@RequestBody Modelday ss)
	{
		return y.adday(ss);
	}
	@GetMapping("getbike")
	public List<Modelday>getdayo()
	{
		return y.getday();
	}
	@GetMapping("getbikeone/{owners}")
	public List<Modelday> getownero(@PathVariable int owners)
	{
		return y.getowner(owners);
	}
	@GetMapping("getbiketwo/{address}")
	public List<Modelday> getaddresso(@PathVariable String address)
	{
		return y.getaddress(address);
	}
	@GetMapping("getbikethree/{carname}")
	public List<Modelday> getcarnameo(@PathVariable String carname)
	{
		return y.getcarname(carname);
	}
	@GetMapping("getbikefour/{owners}/{carname}")
	public List<Modelday> getcarnameowno(@PathVariable int owners,@PathVariable String carname)
	{
		return y.getcarnameown(owners,carname);
	}
	@PutMapping("putbike")
	public Modelday updayo(@RequestBody Modelday ss)
	{
		return y.upday(ss);
	}
	@DeleteMapping("deletebike")
	public void deldayo(@RequestBody Modelday ss)
	{
		y.delday(ss);
	}
	
}
