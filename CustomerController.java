package com.boa.upload.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boa.upload.models.Customer;
import com.boa.upload.services.CustomerService;

@RestController
@RequestMapping("customers")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	//post
	@PostMapping({"/v1.0", "/v1.1"})
	public ResponseEntity<?> addCustomer(@RequestBody Customer customer){
		
		Customer customerObject=this.customerService.addCustomer(customer);
		if(customerObject!=null) {
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(customerObject);
		}
		else
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Verify the customer input");
	}
	
	//getall customers
	@GetMapping({"/v1.0", "/v1.1"})
	public List<Customer> getAllCustomers(){
		return this.customerService.getAllCustomers();
	}
	
	

}
