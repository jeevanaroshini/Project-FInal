package com.dbs.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employee {
	@Id
	String username;
	String name;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String username, String name) {
		super();
		this.username = username;
		this.name = name;
	}
	
	
	

}
