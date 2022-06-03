package com.sush;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	
	@Id
	private int id;
	private String ename;
	private String deptt;
	@OneToOne
	private Laptop laptop;
	
	
	@OneToMany
	private List<Skill> skills;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDeptt() {
		return deptt;
	}
	public void setDeptt(String deptt) {
		this.deptt = deptt;
	}
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	public List<Skill> getSkills() {
		return skills;
	}
	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Employee [" + id + ", " + ename + ", " + deptt + ", " + laptop + ", "
				+ skills + "]";
	}
	
	
}
