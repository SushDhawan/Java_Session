package com.sush.myjpaprj2;

import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sush.myjpaprj2.entity.Customer;
import com.sush.myjpaprj2.repository.CustomerRepository;

@SpringBootApplication
public class Myjpaprj2Application {

	public static void main(String[] args) {
		SpringApplication.run(Myjpaprj2Application.class, args);
	}

	@Bean
	public CommandLineRunner customerDemo(CustomerRepository customerRepository) {
		
		return (args) -> {
			
			//  create some customer records 
			
			customerRepository.save(new Customer("Amit","Kumar"));
			customerRepository.save(new Customer("Rohit","Gupta"));
			customerRepository.save(new Customer("Kavita","Singh"));
			customerRepository.save(new Customer("Monika","Kumar"));
			customerRepository.save(new Customer("Rajesh","Mohan"));
			customerRepository.save(new Customer("Amit","Gupta"));
			customerRepository.save(new Customer("Deepak","Kumar"));
			
			
			System.out.println("Customer list --- using findAll() -----");
			
			for ( Customer c : customerRepository.findAll() )
				System.out.println(c);
			
			
			System.out.println("Customer list --- using findbyID() -----");
			
			Optional<Customer> c1 = customerRepository.findById(6L);
				
			System.out.println(c1);
			
			System.out.println("Customer list --- using findbyLastName() -----");
			
			for ( Customer c : customerRepository.findByLastName("Gupta") )
				System.out.println(c);
			
			// Update the records
			
			Optional<Customer> cUpdate = customerRepository.findById(2L) ;
			
			if (cUpdate.isPresent() )
			{
			    cUpdate.get().setLastName("Yadav");
			    customerRepository.save(cUpdate.get());
			}
			
			System.out.println("Customer after updation  --- using findbyID() -----");
			
			Optional<Customer> c = customerRepository.findById(2L);
				
			System.out.println(c);
			
			Optional<Customer> c2 = customerRepository.findById(3L);
			customerRepository.deleteById(c2.get().getId());
			
			System.out.println("Customer list --- using findAll() -----");
			
			for ( Customer c3 : customerRepository.findAll() )
				System.out.println(c3);
			
			
		};
		
		
		
	}
}
