package com.example.demo5.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidationController {
	@GetMapping("/login")
	public String validate(@RequestParam String username,@RequestParam String password)
	{
		if(username.equals("shenba")&&password.equals("291003"))
		{
			return "Login Successful";
		}
		else
		{
			return "Login Failed please check your usename and password";
		}
	}

}
