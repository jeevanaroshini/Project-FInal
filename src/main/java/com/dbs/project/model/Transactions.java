package com.dbs.project.model;


import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Transactions {


	@Id
	String cusId;
	String cusName;
	long amount;
	String recId;
	String recName;
	String timestamp;
	boolean status;
	
	public Transactions() {
		// TODO Auto-generated constructor stub
	}

	public Transactions(String cusId, String cusName, long amount, String recId, String recName,
			String timestamp,boolean status) {
		super();

		this.cusId = cusId;
		this.cusName = cusName;
		this.amount = amount;
		this.recId = recId;
		this.recName = recName;
		this.timestamp = timestamp;
		this.status =status;
	}

	

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getCusId() {
		return cusId;
	}

	public void setCusId(String cusId) {
		this.cusId = cusId;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getRecId() {
		return recId;
	}

	public void setRecId(String recId) {
		this.recId = recId;
	}

	public String getRecName() {
		return recName;
	}

	public void setRecName(String recName) {
		this.recName = recName;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	
	
	
}
