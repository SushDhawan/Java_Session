package org.sush.valid;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class UserData implements Serializable{
	private static final long serialVersionUID = 1L ;
	
	public String name;
	
	public UserData() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
