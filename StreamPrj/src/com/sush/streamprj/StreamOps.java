package com.sush.streamprj;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamOps {

	public static void main(String[] args) {
		
		List<String> members = new ArrayList<>();
		
	
		members.add("Ashutosh");
		members.add("Shekhar");
		members.add("Aman");
		members.add("Sharda");
		members.add("Saloni");
		members.add("Yana");
		members.add("Lokesh");
		members.add("Rahul");
		
		members.stream()
	//				.filter( (s) -> s.startsWith("A"))
					.sorted()
					.map(String::toUpperCase)
					.forEach(System.out::println);
		
		
		members.add("Sumit"); 
		members.add("Aditi");

		List<String> membersSortedUpperCase = members.stream()
		//			.filter( (s) -> s.startsWith("A"))
					.sorted()
					.map(String::toUpperCase)
					.collect(Collectors.toList());
		
		System.out.println(membersSortedUpperCase);
		
		System.out.println("If any names start with  L " );
		boolean matchRes =  members.stream()
					.anyMatch( (s) -> s.startsWith("L"));
		
		System.out.println(matchRes);
		
		// count -
		long totalMatch = members.stream()
						.filter( (s) -> s.startsWith("A"))
						.count();
		
		System.out.println("names starting with A " +  totalMatch); 
		
		
		Optional<String> reduced = members.stream()
					.reduce((s1,s2) -> s1 + "#" + s2);
		
		reduced.ifPresent(System.out::println);
	}

}
