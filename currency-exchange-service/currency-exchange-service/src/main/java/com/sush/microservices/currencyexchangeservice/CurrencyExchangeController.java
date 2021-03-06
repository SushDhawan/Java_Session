package com.sush.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchnageValue(@PathVariable("from") String from, @PathVariable("to") String to) {
		
	ExchangeValue ev = 	 new ExchangeValue(100L,from,to,(BigDecimal.valueOf(72)));
	
	ev.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
	return ev;
	}

}
