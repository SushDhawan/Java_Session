package com.sush.microservices.currencyconversionservice;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {

	
	@GetMapping("currency-converter/from/{from}/to/{to}/ quntity/{quantity}")
	public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {
		
		
		Map<String, String> uVariables = new HashMap<>();
		uVariables.put("from", from);
		uVariables.put("to", to);
		
		ResponseEntity<CurrencyConversionBean> responseEntity =
			  new RestTemplate().getForEntity("http://localhost:8100/currency-exchange/from/{from}/to/{to}",CurrencyConversionBean.class,uVariables);
			
		CurrencyConversionBean response = responseEntity.getBody();
		
		return new CurrencyConversionBean(response.getId(),from, to,response.getConversionMultiple(), quantity, quantity.multiply(response.getConversionMultiple()),response.getPort()) ;
	}
	
	
	@Autowired 
	private CurrencyExchangeServiceProxy proxy;
	
	//mapping for feign service
	@GetMapping("currency-converter-feign/from/{from}/to/{to}/ quantity/{quantity}")
	public CurrencyConversionBean convertCurrencyFeign(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {
		
		CurrencyConversionBean response = proxy.retrieveExchangeValue(from, to);
	
		return new CurrencyConversionBean(response.getId(),from,to,response.getConversionMultiple(),quantity,
				 quantity.multiply(response.getConversionMultiple()),response.getPort());
	}
	
}