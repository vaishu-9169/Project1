package com.natwest.Service;


import java.util.Date;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.natwest.Model.Accounts;
import com.natwest.Model.Customer;
import com.natwest.Model.IcustomerRepository;
import com.natwest.Model.AccountDetailsRepository;

import com.natwest.exception.CustomerAlreadyRegisteredException;
import com.natwest.exception.CustomerNotFoundException;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import jakarta.servlet.ServletException;


@Service
public class CustomerServiceimpl implements ICustService {

	@Autowired
	private IcustomerRepository custRepo;
	
	@Autowired
	private AccountDetailsRepository accRepo;

	@Override
	public Customer AddUser(Customer custob) throws CustomerAlreadyRegisteredException {
		Optional<Customer> cust = this.custRepo.findByEmail(custob.getEmail());
		
//	List <Customer> cust =this.custRepo.findByEmail(custob.getEmail());
		Customer cust1 = null;
		
		if (cust.isPresent())
			throw new CustomerAlreadyRegisteredException();
		
			
		else
			cust1 = this.custRepo.save(custob);
		return cust1;
	}
	

	public boolean validateCustomer(String email, String password) throws CustomerNotFoundException{
		
		Customer cust = custRepo.validateCustomer(email, password);
	
		if(cust != null)
			return true;
		else
			return false;
	}


	@Override
	public String generateToken(String email, String password) throws ServletException, CustomerNotFoundException {
String jwttoken = null;
		
		if(email == null || password == null)
		{
			throw new ServletException("Please enter Email & Password");
			
			}
		
			boolean find = validateCustomer(email, password);
			
			if(!find) {
				
				throw new CustomerNotFoundException();
				
			}else {
				
				jwttoken = Jwts.builder()
						.setSubject(email)
						.setIssuedAt(new Date())
						.setExpiration(new Date(System.currentTimeMillis() + 600000))
						.signWith(SignatureAlgorithm.HS256, "secret key")
						.compact();
						
			}
			
		
		return jwttoken;
	}


	@Override
	public  List<Accounts> getAccountDetails() {
		
		return accRepo.findAll();
	}
		
	}


