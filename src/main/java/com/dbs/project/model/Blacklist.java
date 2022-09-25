package com.dbs.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Blacklist {
	@Id
	String username;
	
	public Blacklist() {
		// TODO Auto-generated constructor stub
	}

	public Blacklist(String username) {
		super();
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	

}
