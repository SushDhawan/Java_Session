package com.sush.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyNewController {
	
	@RequestMapping("/hello")
	public String myHello() {
		System.out.println("Hello from myHello ");
	}

}
