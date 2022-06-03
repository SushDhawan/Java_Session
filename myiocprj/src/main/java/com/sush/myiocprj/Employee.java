package com.sush.myiocprj;

import java.util.Iterator;
import java.util.List;

public class Employee {
	
	private int id;
	private String name;
	private Address address;
	private List<Skill> skills;
	
	public Employee() { }
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	} 

	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Employee(int id, String name, Address address, List<Skill> skills) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.skills = skills;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public void show( ) {
		
		System.out.println("Hello " + this.id + " " + this.name + " " + this.address);
		
		
		Iterator<Skill> iter = skills.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next()) ;
		}
		
		
	}

}
