package com.customers.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.customers.request.RequestModel;
import com.customers.service.CustomerService;

import çom.customers.response.ResponseModel;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	//@RequestMapping(value ="/createcustomers", method = RequestMethod.POST)
	@PostMapping
	public ResponseModel createCustomers(@RequestBody	 RequestModel requestModelObj) {
		return customerService.addCustomers(requestModelObj);
	}

}
