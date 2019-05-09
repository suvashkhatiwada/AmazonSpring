package com.amazon.utils;

import java.util.HashMap;
import java.util.Map;

import com.amazon.dtos.CustomerDetailsDto;



public class CustomersUtils {

	public static Map<Integer, CustomerDetailsDto> customerList = new HashMap<Integer, CustomerDetailsDto>();
	
	static {
		CustomerDetailsDto cust1 = new CustomerDetailsDto();
		cust1.setCid(4);
		cust1.setCname("Suvash Khatiwada");
		cust1.setCemail("suvashkhatiwada@gmail.com");
		cust1.setCaddress("Fairfax");

		CustomerDetailsDto cust2 = new CustomerDetailsDto();
		cust2.setCid(4);
		cust2.setCname("Somebody");
		cust2.setCemail("somebody@gmail.com");
		cust2.setCaddress("Vienna");

		customerList.put(1, cust1);
		customerList.put(2, cust2);
	}
}
