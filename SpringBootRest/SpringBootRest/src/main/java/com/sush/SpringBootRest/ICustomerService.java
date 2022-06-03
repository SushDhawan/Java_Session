package com.sush.SpringBootRest;

import java.util.List;

public interface ICustomerService {

	List<Customer> findAll();
	
	Customer findByID(Long id);

}
