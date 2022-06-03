package com.sush.SpringBootRest;

public class Customer {

	private Long id;
	private String firstName;
	private String lastName;
	
	Customer() {}

	public Customer(Long id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Customer [" + id + ", " + firstName + ", " + lastName + "]";
	}

}
