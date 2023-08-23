 package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Modelclass;
import com.example.demo.repository.Repository;

@Service
public class Serviceclass {

	@Autowired
	Repository r;
	public Modelclass saveinfo(Modelclass ss)
	{
		return r.save(ss);
	}
	public List<Modelclass> showinfo()
	{
		return r.findAll();	
	}
}