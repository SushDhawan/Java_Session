package com.sush;


import javax.ejb.Remote;

@Remote
public interface OpSessionBeanRemote {
	
	public float add(float x, float y) ;
	
	public float subtract(float x, float y) ;
	
	public float multiply(float x, float y) ;
	
	public float divide(float x, float y) ;
	
}
