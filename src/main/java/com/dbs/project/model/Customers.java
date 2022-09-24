package com.dbs.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customers {
	@Id
	String username;
	String custName;
	double balance;
	String overDraft;
	
	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getOverDraft() {
		return overDraft;
	}
	public void setOverDraft(String overDraft) {
		this.overDraft = overDraft;
	}
	public Customers(String username, String customerID, String custName, double balance, String overDraft,
			String role) {
		super();
		this.username = username;
		this.custName = custName;
		this.balance = balance;
		this.overDraft = overDraft;
		
	}
	
	

}
