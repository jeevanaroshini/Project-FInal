package com.dbs.project.model;

import java.sql.Timestamp;

public class Transactions {

	int id;
	long amount;
	int cusId;
	String cusName;
	int recId;
	String recName;
	int recBankId;
	String recBankName;
	String msgCode;
	String transferType;
	Timestamp timestamp;
	public Transactions() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transactions(int id, long amount, int cusId, String cusName, int recId, String recName, int recBankId,
			String recBankName, String msgCode, String transferType, Timestamp timestamp) {
		super();
		this.id = id;
		this.amount = amount;
		this.cusId = cusId;
		this.cusName = cusName;
		this.recId = recId;
		this.recName = recName;
		this.recBankId = recBankId;
		this.recBankName = recBankName;
		this.msgCode = msgCode;
		this.transferType = transferType;
		this.timestamp = timestamp;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public int getRecId() {
		return recId;
	}
	public void setRecId(int recId) {
		this.recId = recId;
	}
	public String getRecName() {
		return recName;
	}
	public void setRecName(String recName) {
		this.recName = recName;
	}
	public int getRecBankId() {
		return recBankId;
	}
	public void setRecBankId(int recBankId) {
		this.recBankId = recBankId;
	}
	public String getRecBankName() {
		return recBankName;
	}
	public void setRecBankName(String recBankName) {
		this.recBankName = recBankName;
	}
	public String getMsgCode() {
		return msgCode;
	}
	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}
	public String getTransferType() {
		return transferType;
	}
	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}
	public Timestamp getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "Transactions [id=" + id + ", amount=" + amount + ", cusId=" + cusId + ", cusName=" + cusName
				+ ", recId=" + recId + ", recName=" + recName + ", recBankId=" + recBankId + ", recBankName="
				+ recBankName + ", msgCode=" + msgCode + ", transferType=" + transferType + ", timestamp=" + timestamp
				+ "]";
	}
	
	
}
