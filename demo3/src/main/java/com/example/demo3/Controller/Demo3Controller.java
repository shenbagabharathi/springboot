package com.example.demo3.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo3Controller {
	
	@GetMapping("/login/{username}")
	public String demo(@PathVariable("username") String username) {
		return "hi girl " +username;
	}

}
