package com.sush.userjsf;


import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class User{
	
	private String firstName;
	private String lastName ;
	
	public User() {
		super();
		}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = "Akash";
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = "Mohan";
	} 

}
