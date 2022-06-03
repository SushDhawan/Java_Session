package com.sush.streamprj;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StremBuilder2 {

	public static void main(String[] args) {


		List<Integer> list = new ArrayList<Integer>();
		
		for(int i= 1;i<10;i++)
			list.add(i*5);
			
		Stream<Integer> stream = list.stream();
		
		Integer[] evenNumbersArr =  stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
		
		for (Integer i : evenNumbersArr ) {
			System.out.print(i + " ");
		}
	}

}
