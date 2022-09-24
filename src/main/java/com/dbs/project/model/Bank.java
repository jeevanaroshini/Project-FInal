package com.dbs.project.model;

public class Bank {
	int bankID;
	String bankName;
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(int bankID, String bankName) {
		super();
		this.bankID = bankID;
		this.bankName = bankName;
	}
	public int getBankID() {
		return bankID;
	}
	public void setBankID(int bankID) {
		this.bankID = bankID;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	

}
