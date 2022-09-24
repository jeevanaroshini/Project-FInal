package com.dbs.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.project.model.Customers;
import com.dbs.project.service.CustomerService;
//import com.dbs.project.service.CustomerService;
import com.dbs.project.service.LoginService;

@RestController
@CrossOrigin(value="*")
public class Controller {
	
	/*
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/all")
	public String display(){
		return customerService.run().toString();
	}
	*/
	@GetMapping("/test")
	public String display1(){
		return "Working!!!";
	}/*
	@RequestMapping("/home")
	public String home() {
		return "Welcome to home page";
	}
	@RequestMapping("/user")
	public String user() {
		return "Welcome to user page";
	}*/
	@RequestMapping("/employee")
	public String admin() {
		return "Welcome to employee page";
	}
	
	
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
	
}