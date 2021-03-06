package com.sush.myjpaprj2.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sush.myjpaprj2.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	
      List<Customer> findByLastName(String lname);
      

}
