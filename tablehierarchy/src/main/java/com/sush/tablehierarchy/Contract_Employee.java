package com.sush.tablehierarchy;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("contractemployee")
public class Contract_Employee extends MyEmployee {
	
	private float pay_per_hr ;
	private String contract_duration ;
	public float getPay_per_hr() {
		return pay_per_hr;
	}
	public void setPay_per_hr(float pay_per_hr) {
		this.pay_per_hr = pay_per_hr;
	}
	public String getContract_duration() {
		return contract_duration;
	}
	public void setContract_duration(String contract_duration) {
		this.contract_duration = contract_duration;
	}
	
	

}
