package com.wipro.wipromart.service;

import java.util.List;

import com.wipro.wipromart.entity.Customer;

public interface CustomerService {
	 
	Customer saveCustomer(Customer product);
	
	Customer getCustomerById(long productId);
	
	List<Customer> getAllCustomers();
	
}