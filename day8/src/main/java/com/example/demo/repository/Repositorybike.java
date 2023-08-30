package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Modelbike;

public interface Repositorybike extends JpaRepository<Modelbike, Integer>{

	@Query(value="select *from Bike where year=:d",nativeQuery=true)
	public List<Modelbike> info(@Param("d") int year);
	@Query(value="select *from Bike where year=:e and bikename=:f",nativeQuery=true)
	public List<Modelbike> infoone(@Param("e") int year,@Param("f") String bikename);
}
