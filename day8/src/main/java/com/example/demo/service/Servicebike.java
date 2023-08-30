package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Modelbike;
import com.example.demo.repository.Repositorybike;


@Service
public class Servicebike {

	@Autowired
	Repositorybike r;
	public Modelbike adday(Modelbike ss)
	{
		return r.save(ss);
	}
	public List<Modelbike>getday()
	{
		return r.findAll();
	}
	public List<Modelbike> getowner(int year)
	{
		return r.info(year);
	}
	public List<Modelbike> getaddress(int year,String bikename)
	{
		return r.infoone(year,bikename);
	}
	public Modelbike upday(Modelbike ss)
	{
		return r.saveAndFlush(ss);
	}
	public void delday(Modelbike ss)
	{
		r.delete(ss);
	}
}
