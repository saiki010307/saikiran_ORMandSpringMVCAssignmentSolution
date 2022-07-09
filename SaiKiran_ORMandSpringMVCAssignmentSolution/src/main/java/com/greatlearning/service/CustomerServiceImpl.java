package com.greatlearning.service;

import java.util.List;
import java.util.Optional;

import com.greatlearning.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.dao.Customerdao;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private Customerdao customerDao;
	@Override
	public List<Customer> findAllCustomers() {
		// TODO Auto-generated method stub
		return customerDao.findAll();
	}

	@Override
	public Optional<Customer> findById(int id) {
		// TODO Auto-generated method stub
		return customerDao.findById(id);
	}

	@Override
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.save(customer);
	}

	@Override
	public void deleteCustomerById(int id) {
		// TODO Auto-generated method stub
		customerDao.deleteById(id);
		
	}

}
