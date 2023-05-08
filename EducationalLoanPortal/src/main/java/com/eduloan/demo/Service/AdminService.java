package com.eduloan.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.eduloan.demo.Model.LoanApplicationModel;

import com.eduloan.demo.Repository.LoanApplicationRepo;

@Service
public class AdminService {

	@Autowired
	LoanApplicationRepo lrepo;
	
	//posting the info
			public LoanApplicationModel saveDetails1(LoanApplicationModel t)
			{
				return lrepo.save(t);
			}
	
	
	public List<LoanApplicationModel> fetchAllLoan(){
		List<LoanApplicationModel> c=lrepo.findAll();
		return c;
}
	public  LoanApplicationModel updateinfo(LoanApplicationModel s,int id) {
		Optional<LoanApplicationModel> optional=lrepo.findById(id);
		LoanApplicationModel obj=null;
		if(optional.isPresent())
		{
		obj=optional.get();

		lrepo.save(s);
		}
		return obj;


		}

	public void deleteDetails(int id) {
		lrepo.deleteById(id);

}
}
