package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ModelClass;
import com.example.demo.repository.Repositoryclass;

@Service
public class Serviceclass {

	@Autowired
	Repositoryclass r;
	public ModelClass saveinfo(ModelClass ss)
	{
		return r.save(ss);
	}
	public List<ModelClass> showinfo()
	{
		return r.findAll();
	}
}
