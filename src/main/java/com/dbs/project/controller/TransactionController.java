package com.dbs.project.controller;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;

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
public class TransactionController {

	@Autowired
	TransactionRepo tr;

	@Autowired
	TransactionService ts;


	//	@RequestMapping("/add")
	//    public String addNewBook(){
	//        return "BookForm.jsp";
	//        
	//    }

	@GetMapping("/receiver")

	public String savingRecord(@RequestParam String cusId, @RequestParam long amount,@RequestParam String cusName,@RequestParam String recId,@RequestParam String recName,@RequestParam boolean status) {


		LocalDate currentDate = LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		String timestamp1= currentDate + "  " + currentTime;


		ts.addRecord(new Transactions(cusId,amount,cusName,recId,recName,status,timestamp1));
		return "Success";
	}
	@Autowired
	CustomerRepo cr;

	
	Customers c=new Customers();

	@GetMapping("/updateBalance")


	public String updateBalance(@RequestParam String uname,@RequestParam String custname,@RequestParam double bal,
			@RequestParam String overdraft,@RequestParam long amount) {
		//new Customers(uname,custname,bal,overdraft);
		double newBal=bal-amount;
		c.setUsername(uname);
		c.setCustName(custname);
		c.setOverDraft(overdraft);
		c.setBalance(newBal);
		cr.save(c);
		return "success";
	}
}
