package com.welcome.demo.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiController {

	@RequestMapping(value="/Welcome",method=RequestMethod.GET)
	public String welcome()
	{
		return "Welcome String Boot!";
	}
	 
	@GetMapping("/hi/{username}")
	public String getName(@PathVariable ("username") String username)
	{
		return "Welcome " + username;
	}
	@GetMapping("/hello/{color}")
	public String getMyFav(@PathVariable ("color") String color)
	{
		return "My Fav color is " + color;
	}
	

}
