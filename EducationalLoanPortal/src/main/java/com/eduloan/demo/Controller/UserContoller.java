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

import com.eduloan.demo.Model.UserModel;
import com.eduloan.demo.Service.UserService;




@RestController
@RequestMapping("/user")
public class UserContoller {

	@Autowired
	UserService userv;
	
	@PostMapping("/addProfile")
	public UserModel addDetails1(@RequestBody UserModel t)
	{
		return userv.saveDetails1(t);
	}
	
	@GetMapping("/getProfile")
	public List<UserModel> fetchAllCustomers() {
		List<UserModel> pList=userv.fetchAllProfile();
		return pList;
	}
		
		@PostMapping("/login")
		public String validateUser(@RequestBody UserModel u)
		{
		System.out.println(u.getEmail());
			return userv.validateUser(u.getEmail(),u.getPassword());
		}
//		@PostMapping("/addUser")
//		public LoginModel add(@RequestBody UserModel u)
//		{
//		  return userv.saveuser(u);
//		}
		@PostMapping("/signup")
		public UserModel addDetails(@RequestBody UserModel t)
		{
			return userv.saveDetails(t);
		}
		@GetMapping(value="/viewLoan/{user}")
		public LoanApplicationModel getById(@PathVariable int user)
		{
			LoanApplicationModel gbi=userv.getById(user);
			return gbi;
			
		}
		@PutMapping("/putProfile/{id}")
		public UserModel update(@RequestBody UserModel s,@PathVariable("id") int id)
		{
			return userv.updateinfo(s,id);
		}
		
		@DeleteMapping("/del/{id}")
		public  String delete(@PathVariable("id") int s)
		{
			userv.deleteDetails(s);
			return "Deleted";
		}
		
}
