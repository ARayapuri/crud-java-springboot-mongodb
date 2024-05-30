package com.customers.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customers.dao.CustomerDao;
import com.customers.models.Customer;
import com.customers.request.RequestModel;
import com.customers.service.CustomerService;

import çom.customers.response.ResponseModel;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerDao customerDao;
	
	@Override
	public ResponseModel addCustomers(RequestModel requestModelObj) {
		ResponseModel responseModelObj = new ResponseModel();
		try {
			Customer customerObj = new Customer();
			customerObj.setName(requestModelObj.getName());
			customerObj.setEmail(requestModelObj.getEmail());
			
			Long result = customerDao.addCustomer(customerObj);
			
			if(result == 0) {
				responseModelObj.setStatusCode(0); //success
				responseModelObj.setRespObject(customerObj);
			}else {
				responseModelObj.setStatusCode(2); //Failure
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			responseModelObj.setStatusCode(11); //Internal Server Error
		}
		return responseModelObj;
	}

}
