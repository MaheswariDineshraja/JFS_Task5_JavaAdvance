package com.javaadv;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program1_map {

	public static void main(String[] args) {
		//List of Strings
		Stream<String> names = Stream.of("aBc","d","ef");
		
		//convert a list of strings into upper case using map() method
		List<String> uppercaseNAMES = names.map(String::toUpperCase).collect(Collectors.toList());
		
		//List of strings in upper case
		System.out.println(uppercaseNAMES);

	}

}
