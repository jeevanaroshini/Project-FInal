package com.dbs.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.project.model.Blacklist;
import com.dbs.project.model.Customers;
import com.dbs.project.model.Transactions;
import com.dbs.project.repo.BlackListRepo;
import com.dbs.project.repo.TransactionRepo;
import com.dbs.project.service.BlacklistService;
import com.dbs.project.service.CustomerService;
//import com.dbs.project.service.CustomerService;
import com.dbs.project.service.LoginService;
import com.dbs.project.service.TransactionService;

@RestController
@CrossOrigin(value="*")
public class Controller {
		
	@Autowired 
	LoginService ls;
	@RequestMapping ("/login")
	public String login(@RequestParam( "username" )String username,@RequestParam( "password" )String password) {
	return ls.validateUser(username,password);
	}
	
	@Autowired
	CustomerService cs;
	
	@RequestMapping ("/sender")
	public List<Customers> sendDetails(@RequestParam( "username" )String username) {
	return cs.senderDetails(username);
	}
	
	
	@Autowired
	BlacklistService bs;
	@RequestMapping ("/blacklist")
	public String checkUser (@RequestParam( "username" )String username) {
		
		String result=bs.checkMafia(username);
		
		return result;
	}
	@Autowired
	TransactionService ts;
	@RequestMapping("/log")
	public List<Transactions> fetchAll(){
		return ts.getTransactions();
		
	}
	
	
}