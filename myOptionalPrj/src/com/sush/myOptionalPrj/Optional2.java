package com.sush.myOptionalPrj;

import java.util.Optional;

public class Optional2 {

	public static void main(String[] args) {
		 
		Optional<String> gender = Optional.of("MALE");
		Optional<String> emptyGender = Optional.empty();

		gender.ifPresent(g-> System.out.println("In gender -  Value is available " +  gender));
		
		emptyGender.ifPresent(g-> System.out.println("In emptyGender -  Value is available "));
	}

}
