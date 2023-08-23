package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Modelclass;

public interface Repository extends JpaRepository<Modelclass, Integer> {

}
