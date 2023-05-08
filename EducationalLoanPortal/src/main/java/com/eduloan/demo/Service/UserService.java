package com.eduloan.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eduloan.demo.Model.LoanApplicationModel;
//import com.eduloan.demo.Model.LoginModel;
import com.eduloan.demo.Model.UserModel;
import com.eduloan.demo.Repository.LoanApplicationRepo;
import com.eduloan.demo.Repository.UserRepo;




@Service
public class UserService {

	@Autowired
	UserRepo urepos;
	
	@Autowired
	LoanApplicationRepo irep;

	//posting the info
		public UserModel saveDetails1(UserModel t)
		{
			return urepos.save(t);
		}


	public List<UserModel> fetchAllProfile(){
		List<UserModel> c=urepos.findAll();
		return c;
	}


//	public LoginModel saveuser(LoginModel u)
//	{
//	       return urepos.save(u);
//	}
	public String validateUser(String email,String password)
	{
		String result="";
		UserModel u=urepos.findByEmail(email);
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
	public UserModel saveDetails(UserModel t)
	{;
		return urepos.save(t);
	}
	
	public LoanApplicationModel getById(int id)
	{
		LoanApplicationModel gbi=irep.findById(id).get();
		return gbi;
		
	}
	public  UserModel updateinfo(UserModel s,int id) {
		Optional<UserModel> optional=urepos.findById(id);
		UserModel obj=null;
		if(optional.isPresent())
		{
		obj=optional.get();

		urepos.save(s);
		}
		return obj;


		}
//	public UserModel updateinfo(UserModel tu) {
//		// TODO Auto-generated method stub
//		return urepos.saveAndFlush(tu);
//	}

	public void deleteDetails(int id) {
		urepos.deleteById(id);
}
}

