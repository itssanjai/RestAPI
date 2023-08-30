package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.model.Modelday;
import com.example.demo.repository.Repositoryday;

@Service
public class Serviceday {

	@Autowired
	Repositoryday r;
	public Modelday adday(Modelday ss)
	{
		return r.save(ss);
	}
	public List<Modelday>getday()
	{
		return r.findAll();
	}
	public List<Modelday> getowner(int owners)
	{
		return r.info(owners);
	}
	public List<Modelday> getaddress(String address)
	{
		return r.infoone(address);
	}
	public List<Modelday> getcarname(String carname)
	{
		return r.infotwo(carname);
	}
	public List<Modelday> getcarnameown(int owners,String carname)
	{
		return r.infothree(owners,carname);
	}
	public Modelday upday(Modelday ss)
	{
		return r.saveAndFlush(ss);
	}
	public void delday(Modelday ss)
	{
		r.delete(ss);
	}
}
