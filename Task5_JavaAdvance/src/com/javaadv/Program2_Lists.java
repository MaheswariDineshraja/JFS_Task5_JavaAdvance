package com.javaadv;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program2_Lists {

	public static void main(String[] args) {
		//List String
		List<String> strings = Arrays.asList("abc","","bcd","efg","abcd","","jkl");
		List<String> nonEmptyStrings = strings.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList());
		
		//Print the list have non empty strings
		System.out.println("List having Non-empty strings: ");
		System.out.println(nonEmptyStrings);

	}

}
