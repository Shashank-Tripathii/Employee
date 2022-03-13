package com.greatlearning.model;
//import java.util.Scanner;


public class Employee {

	  public static String firstName, lastName;
		
//public static int option=0;
	

	public Employee(String firstName, String lastName) {
		super();
	//	this.firstName = firstName;
		// this.lastName = lastName;
		
		
		
	}

	public static String getFirstName() {
		return firstName;
	}

	public static void setFirstName(String firstName) {
		Employee.firstName = firstName;
	}

	public static String getLastName() {
		return lastName;
	}

	public static void setLastName(String lastName) {
		Employee.lastName = lastName;
	}

	
}