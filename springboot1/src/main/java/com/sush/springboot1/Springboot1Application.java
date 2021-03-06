package com.sush.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sush.springboot1.entity.Customer;
import com.sush.springboot1.repository.CustomerRepository;

@SpringBootApplication
public class Springboot1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot1Application.class, args);
	}
	
	@Bean
	public void CommandLineRunner(CustomerRepository repository) {
		
		repository.save(new Customer("Amit","Kumar"));
		repository.save(new Customer("Rama","Mohan"));
		repository.save(new Customer("Aradhya","G"));
		
		
		for (Customer c : repository.findAll() ) {
			System.out.println(c);
		}
		
		repository.findByLastName("Kumar").forEach(
				c-> {
					System.out.println(c);
				});
	}
				
		
	}
}
