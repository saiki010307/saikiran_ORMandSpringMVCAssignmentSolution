package com.greatlearning.service;

import java.util.List;
import java.util.Optional;

import com.greatlearning.entity.Customer;

public interface CustomerService {
	public List<Customer> findAllCustomers();

	public Optional<Customer> findById(int id);

	public void saveCustomer(Customer customer);

	public void deleteCustomerById(int id);
}
