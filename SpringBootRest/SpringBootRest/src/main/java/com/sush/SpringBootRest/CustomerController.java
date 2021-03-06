package com.sush.SpringBootRest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@Autowired(required=true)
	private ICustomerService customerService1;

	@GetMapping(value="/customers")
	public List<Customer> getCustomer() {
		
		List<Customer> customers = customerService1.findAll();
		return customers;
	}
	
	@GetMapping("/customers/{id}")
	public Customer getCustomerById(@PathVariable("id") Long id){
		
		Customer c = customerService1.findByID(100L); 
		return c ;
			
	}
	
	@GetMapping(value="/welcome/{name}")
	public String welcomeCustomer(@PathVariable("name") String name) {
		
		return "Welcome " + name;
	}
	
	@PostMapping("/addcustomer")
	public void  addCustomer() {
		
	}
	
	
	
	
	
}