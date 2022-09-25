package com.dbs.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.project.model.Blacklist;
import com.dbs.project.model.Customers;
import com.dbs.project.repo.BlackListRepo;
import com.dbs.project.repo.CustomerRepo;
@Service
public class BlacklistService {

	@Autowired
	BlackListRepo br;
	public String checkMafia(String username) {
		// TODO Auto-generated method stub
		Blacklist b=br.findByUsername(username);
		if(b!=null)
			return "true";
		else return "false";
	}
	
	
	
	

}