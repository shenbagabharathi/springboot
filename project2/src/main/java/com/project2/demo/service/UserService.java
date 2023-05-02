package com.project2.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project2.demo.model.UserModel;
import com.project2.demo.repository.UserRepository;



@Service
public class UserService {
	@Autowired
     public UserRepository irepo;
	
	public UserModel saveuser(UserModel u)
	{
	       return irepo.save(u);
	}
	public String validateUser(String username,String password)
	{
		String result="";
		UserModel u=irepo.findByUsername(username);
		if(u==null)
		{
			result="Invalid user";
		}
			else
			{
				if(u.getPassword().equals(password))
				{
					result="Login success";
				}
				else
				{
					result="Login failed";
				}
			}
		

		return result;
		}
		
		
}


