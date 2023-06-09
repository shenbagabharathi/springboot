package com.project.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.model.ActorsTable;
import com.project.demo.service.Actorservice;

@RestController
public class Actorcontroller {
	@Autowired
	public Actorservice bser;
	@PostMapping("/hi")
	public ActorsTable addDetails(@RequestBody ActorsTable f)
	{
		return bser.saveDetails(f);
	}
	@GetMapping("/hello")
    public List<ActorsTable> getDetails()
    {
		return bser.getinfo();
    }
	@PutMapping("/welcome")
	public ActorsTable update(@RequestBody ActorsTable firstname)
	{
		return bser.updateinfo(firstname);
	}
	@DeleteMapping("/del") 
	public  String delete(@PathVariable("id") int s)
	{
		bser.deleteDetails(s);
		return "Deleted";
	}
	@DeleteMapping("/delete")
	public String deleteByRequestPara(@RequestParam ("id") int h)
	{
	    bser.deleteDetails(h);
	    return h+" id deleted";
	}

}
