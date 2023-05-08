package com.eduloan.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.eduloan.demo.Model.LoanApplicationModel;

import com.eduloan.demo.Service.AdminService;



@RestController
@RequestMapping("/admin")
public class AdminController {
	
    @Autowired
    AdminService aser;
    
    @PostMapping("/addLoanDetails")
	public LoanApplicationModel addDetails1(@RequestBody LoanApplicationModel t)
	{
		return aser.saveDetails1(t);
	}

	@GetMapping("/getAllLoans")
	public List<LoanApplicationModel> fetchAllCustomers() {
		List<LoanApplicationModel> pList=aser.fetchAllLoan();
		return pList;
}
	@PutMapping("/putLoan/{loanId}")
	public LoanApplicationModel update(@RequestBody LoanApplicationModel s,@PathVariable("loanId") int loanId)
	{
		return aser.updateinfo(s,loanId);
	}
	@DeleteMapping("/del/{loanId}")
	public  String delete(@PathVariable("loanId") int s)
	{
		aser.deleteDetails(s);
		return "Deleted";
	}
}
