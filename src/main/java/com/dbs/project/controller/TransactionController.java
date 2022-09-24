package com.dbs.project.controller;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.project.model.Transactions;
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
	
@GetMapping("/saveRecord")
@ResponseBody
public String savingRecord(@RequestParam long amount,@RequestParam String cusId,@RequestParam String cusName,@RequestParam String recId,@RequestParam String recName, @RequestParam boolean status ) {
	LocalDate currentDate = LocalDate.now();
	LocalTime currentTime = LocalTime.now();
	String timestamp = currentDate + "  " + currentTime;
	
	
	ts.addRecord(new Transactions(cusName,cusId,amount,recId,recName,timestamp,status));
     return "Success";
}

}
