package com.amazon.services;

import org.springframework.stereotype.Service;

import com.amazon.dtos.CustomerDetailsDto;
import com.amazon.utils.CustomersUtils;

@Service
public class CustomerService {
	
public void saveEmployee(CustomerDetailsDto customerDto) {
		
		CustomersUtils.customerList.put(customerDto.getCid(), customerDto);
		
	}

}
