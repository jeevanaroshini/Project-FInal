package com.dbs.project.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.project.model.Customers;
import com.dbs.project.model.Transactions;
import com.dbs.project.repo.CustomerRepo;
import com.dbs.project.repo.TransactionRepo;
import com.dbs.project.service.TransactionService;
@RestController
@CrossOrigin(value="*")
public class TransactionController {

	@Autowired
	TransactionRepo tr;

	@Autowired
	TransactionService ts;


	

	@GetMapping("/receiver")

	public String savingRecord(@RequestParam("cusId") String cusId, @RequestParam("amount") long amount,@RequestParam("cusName") String cusName,@RequestParam("recId") String recId,@RequestParam("recName") String recName,@RequestParam("status") boolean status) {


		LocalDate currentDate = LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		String timestamp1= currentDate + "  " + currentTime;


		ts.addRecord(new Transactions(cusId,amount,cusName,recId,recName,status,timestamp1));
		return "Success";
	}
	@Autowired
	CustomerRepo cr;

	
	

	@RequestMapping("/updateBalance")


	public String updateBalance(@RequestParam("cust") String cust,@RequestParam("amount") long amount,@RequestParam("rec") String rec) {
		//new Customers(uname,custname,bal,overdraft);
//		,@RequestParam String custname,@RequestParam double bal,
//		@RequestParam String overdraft,
		
		Customers c=cr.findByUsername(cust);
		Customers c1=cr.findByUsername(rec);
		double custBal=c.getBalance()-amount;
		double recBal=c1.getBalance()+amount;
		
		c.setBalance(custBal);
		c1.setBalance(recBal);
		cr.save(c);
		cr.save(c1);
		return "success";
	}
	
	@RequestMapping ("/log")
	public List<Transactions> fetchAll() {
	return tr.findAll();
	}
}
