package com.project2.demo.service;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.project2.demo.model.Tickets;
import com.project2.demo.repository.TicketsRepo;

@Service
public class TicketSer {

	@Autowired
	public TicketsRepo srepo;
	
	//posting the info
	public Tickets saveDetails(Tickets t)
	{
		return srepo.save(t);
	}

	public List<Tickets> getInfo() {
		// TODO Auto-generated method stub
		return srepo.findAll();
	}

	public Tickets updateinfo(Tickets tu) {
		// TODO Auto-generated method stub
		return srepo.saveAndFlush(tu);
	}

	public void deleteDetails(int age) {
		// TODO Auto-generated method stub
		srepo.deleteById(age);
		
	}
	
	//sorting
		public List<Tickets> sortAll(String field)
		{
			return srepo.findAll(Sort.by(Direction.DESC, field)) ;
		}
		
		//pagination
		public List<Tickets>pagingBillboard(int offset,int  pageSize)
		{
			Page<Tickets>   obj= srepo.findAll(PageRequest.of(offset, pageSize));
			return obj.getContent();
		}
		
		//pagination and sorting
		public List<Tickets> paginate(int offset, int pageSize, String username) 
		{
			Page<Tickets> obj=srepo.findAll(PageRequest.of(offset, pageSize,Sort.by(username).descending()));
			return obj.getContent();
		}
	
}
