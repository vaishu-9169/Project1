package com.natwest.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.natwest.Model.Accounts;
import com.natwest.Model.Customer;

import com.natwest.Service.ICustService;
import com.natwest.exception.CustomerAlreadyRegisteredException;
import com.natwest.exception.CustomerNotFoundException;

import com.natwest.bo.AccountDetails;

import jakarta.servlet.ServletException;



@RestController
@CrossOrigin("*")
@RequestMapping("/Auth")
public class AuthController {
	
	Map<String, String> map = new HashMap<>();
	
	@Autowired
	private ICustService custService;
	
	
	
	@PostMapping("/register")
	public ResponseEntity<?> AddUser(@RequestBody Customer custobj) throws CustomerAlreadyRegisteredException
	{
		
		Customer cust = this.custService.AddUser(custobj);
		
		return new ResponseEntity(cust, HttpStatus.CREATED);
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> DoLogin(@RequestBody Customer custObj) throws CustomerNotFoundException, ServletException{
		
		String token = custService.generateToken(custObj.getEmail(), custObj.getPassword());
		
		map.put("token", token);
		map.put("msg", "Logged in SuccessFully");
		
		
		return new ResponseEntity(map, HttpStatus.OK);
	}
	
		
		@GetMapping("/accounts")
		public ResponseEntity<?> AccountDetails()
		{
			
     List<Accounts> ad= custService.getAccountDetails();
     Random random = new Random();
     long number =(long) Math.floor(Math.random()*9_000_000_000L) + 1_000_000_000L;
     ad.get(0).setSavingsaccountno(String.valueOf(number));
      number =(long) Math.floor(Math.random()*9_000_000_000L) + 1_000_000_000L;

//     ad.get(0).setSavingsaccountno(String.valueOf(random.nextInt(8)));
     ad.get(0).setCurrentaccountno(String.valueOf(number));

			return new ResponseEntity(ad, HttpStatus.OK);
		}
		
		
		
		
		


}

