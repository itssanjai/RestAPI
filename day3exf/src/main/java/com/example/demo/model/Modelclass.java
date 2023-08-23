package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Modelclass {

	@Id
	private int id;
	private String employeeName;
	private int age;
	private long salary;
	public Modelclass(int id, String employeeName, int age, long salary) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.age = age;
		this.salary = salary;
	}
	public Modelclass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
}