package com.amazon.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.dtos.CustomerDetailsDto;
import com.amazon.services.CustomerService;
import com.amazon.utils.CustomersUtils;


@RestController
public class CustomerController {
	
	private CustomerService customerService;
	
	
	public CustomerService getCustomerService() {
		return customerService;
	}


	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}


	@RequestMapping(value = "/getcustomer/{id}", method = RequestMethod.GET)
	public CustomerDetailsDto getCustomerById(@PathVariable Integer id) {
		return CustomersUtils.customerList.get(id);
	}
	
	@RequestMapping(value = "/setcustomer", method = RequestMethod.POST)
	public void saveCustomer(@RequestBody CustomerDetailsDto customerDto) {
		customerService.saveEmployee(customerDto);
	}



}
