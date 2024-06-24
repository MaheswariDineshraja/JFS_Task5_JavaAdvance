package com.javaadv;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program3_ListInterface {

	public static void main(String[] args) {
		
		// 10 List of students
		List<String> studentNames = Arrays.asList("Anushrutha","pavi","Priya","Kajal","Harshu","Maheswari", "Ammu","Yohetha","Geetha","Nivedha");
		List<String> studentsnamestartA = studentNames.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
		
		//Print the students whose name starts with "A"
		System.out.println("Students whose name starts with 'A':");
		studentsnamestartA.forEach(System.out::println);
	}

}
