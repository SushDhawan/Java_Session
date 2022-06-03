package com.sush.annotiocprj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyMessageConfig {
	
	@Bean(initMethod="init")
	public MyMessage createBean(AnotherBean a) {
		
		return new MyMessage();
	}
	
	@Bean 
	public AnotherBean AnotherBean() {
		
		return new AnotherBean();
	}
}
