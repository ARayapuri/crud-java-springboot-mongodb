package com.customers.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.customers.dao.CustomerDao;
import com.customers.models.Customer;


@Repository
public class CustomerDaoImpl implements CustomerDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public Long addCustomer(Customer customerObj) {
		Session session = sessionFactory.getCurrentSession();
		
		Long customerId = (Long) session.save(customerObj);
		
		return customerId;
	}

	

}
