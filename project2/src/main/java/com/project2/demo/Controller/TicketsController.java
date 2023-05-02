package com.project2.demo.Controller;

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

import com.project2.demo.model.Tickets;
import com.project2.demo.service.TicketSer;

@RestController
public class TicketsController {
 
	@Autowired
	public TicketSer tser;
	@PostMapping("/hi")
	public Tickets addDetails(@RequestBody Tickets t)
	{
		return tser.saveDetails(t);
	}
	@GetMapping("/hello")
	public List<Tickets> getDetails()
	{
		return tser.getInfo();
	}
	@PutMapping("/welcome")
	public Tickets update(@RequestBody Tickets name)
	{
		return tser.updateinfo(name);
	}
	@DeleteMapping("/del{age}")
	public  String delete(@PathVariable("age") int s)
	{
		tser.deleteDetails(s);
		return "Deleted";
	}
	@DeleteMapping("/delete")
	public String deleteByRequestPara(@RequestParam ("age") int h)
	{
	    tser.deleteDetails(h);
	    return h+" id deleted";
	}
	
	@GetMapping("/sortTickets/{field}")
	public List<Tickets> sortBillboard(@PathVariable String field)
	{
		return tser.sortAll(field);
	}
	
	@GetMapping(value="/pageTickets/{field}/{size}")
	public List<Tickets> pagingTickets(@PathVariable("field") int offset,@PathVariable("size") int  pageSize)
	
	{
	 return tser.pagingBillboard(offset, pageSize);	
	}
	@GetMapping("pagination/{nm}/{sp}/{inr}")
	public List<Tickets> paginate(@PathVariable("nm") int num,@PathVariable("sp") int size,@PathVariable("inr") String name)
	{
		return tser.paginate(num,size,name);
	}
}
