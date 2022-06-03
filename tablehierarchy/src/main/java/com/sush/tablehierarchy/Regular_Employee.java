package com.sush.tablehierarchy;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("regularemployee")
public class Regular_Employee extends MyEmployee {
	
	private float salary;
	private float incentive;
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public float getIncentive() {
		return incentive;
	}
	public void setIncentive(float incentive) {
		this.incentive = incentive;
	}
	
	

}
