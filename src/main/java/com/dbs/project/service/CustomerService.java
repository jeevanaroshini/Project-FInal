package com.dbs.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.project.model.Customers;
import com.dbs.project.repo.CustomerRepo;
@Service
public class CustomerService {
	
	@Autowired
	CustomerRepo cr;
	
	public List<Customers> senderDetails(String username) {
		
		Customers cust=cr.findByUsername(username);
		
		List<Customers> localList = new ArrayList<Customers>();
		localList.add(cust);
		
		return  localList;
	}
	
	

}