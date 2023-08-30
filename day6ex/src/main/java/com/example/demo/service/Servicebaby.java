package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Modelbaby;
import com.example.demo.repository.Repositorybaby;

@Service
public class Servicebaby {

	@Autowired
	Repositorybaby r;
	public Modelbaby addinfo(Modelbaby ss)
	{
		return r.save(ss);
	}
	public List<Modelbaby> showinfo()
	{
		return r.findAll();
	}
	public Modelbaby updateinfo(Modelbaby ss)
	{
		return r.saveAndFlush(ss);
	}
	public void deleteinfo(Modelbaby ss)
	{
		r.delete(ss);
	}
	//Sorting
	public List<Modelbaby> showinfosort(String d)
	{
		return r.findAll(Sort.by(Sort.DEFAULT_DIRECTION,d));
	}
	//Pagination
	 public List<Modelbaby> getbypage(int pgno,int pgsize)

		{
	        //sr.findAll(Sort.by(Sort.Direction.DESC,s));
	        Page<Modelbaby>p=r.findAll(PageRequest.of(pgno,pgsize));
	        return p.getContent();
		}
}
