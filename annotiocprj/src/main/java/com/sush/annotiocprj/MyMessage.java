package com.sush.annotiocprj;

public class MyMessage {
	
	private String message ;
	private AnotherBean ab;

	public void init() {
		// Lifecycle callback for initializing 
	}
	
	public AnotherBean getAb() {
		return ab;
	}

	public void setAb(AnotherBean ab) {
		this.ab = ab;
	}

	public void  getMessage() {
		System.out.println("Your message : " +  message) ;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
