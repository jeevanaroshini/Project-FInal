package com.dbs.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {
	@Id
	String username;
	String password;
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(String userName, String password) {
		super();
		this.username = userName;
		this.password = password;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String userName) {
		this.username = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
