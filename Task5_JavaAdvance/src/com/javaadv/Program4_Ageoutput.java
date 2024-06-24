package com.javaadv;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Program4_Ageoutput {

	public static void main(String[] args) {
		
		//Users birth date as input
		Scanner d = new Scanner(System.in);
		System.out.println("Enter your birthdate (yyyy-mm-dd): ");
		
		String birthdateString = d.nextLine();
		LocalDate birthdate = LocalDate.parse(birthdateString);
		LocalDate currentDate = LocalDate.now();
		
		//calculate age 
		Period age = Period.between(birthdate, currentDate);
		
		// print age 
		System.out.println("Your age is: " + age.getYears() + " years, " + age.getMonths() + " months, and  " + age.getDays() + " days.");
		d.close();

	}

}
