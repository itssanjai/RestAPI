package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ModelClass;

public interface Repositoryclass extends JpaRepository<ModelClass, Integer> {

}
