package com.dbs.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.project.model.Transactions;
import com.dbs.project.repo.TransactionRepo;
@Service
public class TransactionService {
	@Autowired
	TransactionRepo tr;
	public void addRecord(Transactions transaction) {
        tr.save(transaction);
    }
	public List<Transactions> getTransactions() {
		// TODO Auto-generated method stub
		return tr.findAll();
	}

}
