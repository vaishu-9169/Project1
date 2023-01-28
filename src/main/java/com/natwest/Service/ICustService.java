package com.natwest.Service;

import java.util.List;

import com.natwest.Model.Accounts;
import com.natwest.Model.Customer;
import com.natwest.bo.AccountDetails;
import com.natwest.exception.CustomerAlreadyRegisteredException;
import com.natwest.exception.CustomerNotFoundException;

import jakarta.servlet.ServletException;

public interface ICustService {
	
	public Customer AddUser(Customer custob) throws CustomerAlreadyRegisteredException;

	public boolean validateCustomer(String email, String password) throws CustomerNotFoundException;
	
	public String generateToken(String email, String password) throws ServletException, CustomerNotFoundException;

	public List<Accounts> getAccountDetails();
	

}
