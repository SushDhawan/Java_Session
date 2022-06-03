package com.sush.springboot1.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.sush.springboot1.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	
	List<Customer>  findByLastName(String LastName);
	
	Optional<Customer> findById(Long id);

}
