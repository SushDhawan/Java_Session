package com.sush.myOptionalPrj;

import java.util.Optional;

public class Optional1 {

	public static void main(String[] args) {
		 
		String[] names = {"Agra","Mumbai","Delhi","Shillong","Darjeeling" };
		
		Optional<String> checkNull = Optional.ofNullable(names[3]);
		
		if (checkNull.isPresent())
		{
			System.out.println(names[3]);
		}
		else
		{
			System.out.println("String is null");
		}
	
	for (String s : names) {
		System.out.println(s);
	}
	}
}
