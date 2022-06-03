package com.sush.myspringmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/hello")
	public void sayHello() {
		System.out.println("Hello from myController");
	}

}
