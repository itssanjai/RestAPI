package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Modelday;

public interface Repositoryday extends JpaRepository<Modelday, Integer>{
    @Query(value="select*from Querytable where owners=:d",nativeQuery=true)
	public List<Modelday> info(@Param("d") int owners);
    @Query(value="select*from Querytable where address=a",nativeQuery=true)
   	public List<Modelday> infoone(@Param("a") String address);
    @Query(value="select*from Querytable where carname=:c",nativeQuery=true)
   	public List<Modelday> infotwo(@Param("c") String carname);
    @Query(value="select*from Querytable where owners=:e and cartype=:f",nativeQuery=true)
   	public List<Modelday> infothree(@Param("e") int owners,@Param("f") String cartype);
}
