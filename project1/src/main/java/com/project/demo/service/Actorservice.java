package com.project.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.model.ActorsTable;
import com.project.demo.repository.Actorsrepo;

@Service
public class Actorservice {
	@Autowired
	public Actorsrepo srepo;
	
	
	public ActorsTable saveDetails(ActorsTable r)
	{
		return srepo.save(r);
	}


	public List<ActorsTable> getinfo() {
		// TODO Auto-generated method stub
		return srepo.findAll();
	}


	public ActorsTable updateinfo(ActorsTable au) {
		// TODO Auto-generated method stub
		return srepo.saveAndFlush(au);
	}
	public void deleteDetails(int id)
	{
		srepo.deleteById(id);
	}


}
