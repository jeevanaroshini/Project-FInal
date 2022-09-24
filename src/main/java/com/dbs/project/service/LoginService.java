package com.dbs.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.project.model.Customers;
import com.dbs.project.model.Employee;
import com.dbs.project.model.Login;
import com.dbs.project.repo.CustomerRepo;
import com.dbs.project.repo.EmpRepo;
//import com.dbs.project.repo.CustomerRepo;
import com.dbs.project.repo.LoginRepo;

@Service
public class LoginService {

	@Autowired
	LoginRepo lr;
	
	@Autowired
	CustomerRepo cr;
	
	@Autowired
	EmpRepo er;
	
	//@Autowired
	//EmployeeService es;
	/*
	public List<Customers> run() {
		return lr.findAll();
	}
	 */
	public String validateUser(String username, String password) {
		// TODO Auto-generated method stub
		String status="";
		String role="";
		Login login=lr.findByUsername(username);
		if(login.getUserName()!=null && login.getPassword().equals(password)) {
			status="Success";
		}


		if(status=="Success")
		{	
			Customers cust=cr.findByUsername(username);
			Employee emp=er.findByUsername(username);
			if((emp != null) && emp.getUsername().equals(username)) {
				return "employee";
			}
			if((cust != null) && cust.getUsername().equals(username)) {
				return "customer";
			}

		}
		return "Fail";
	}

	

}