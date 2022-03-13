
/**
 *  this program contains employee class as well which is required if we pass the value before executing the program
 *  but i have commented that part because the program i wrote, in that program i am taking the input from the user at the time of running 
 *  the program
 *  
 */

package com.greatlearning.app;
//import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

import java.util.Scanner;

public class GenerateCredentials {
//	static Employee employee = new Employee ("Harshit", "Choudhary");
	public static int option=0;
    public static String firstName;
	public static String lastName;
	
	
	//static Employee employee = new Employee(fname, lname);


	public static void main(String[] args) {
		
		System.out.println(" ***** Welcome to the Volcano Server *****"); // taken Volcano as the company name
		
		System.out.println("Please enter the option to select the Department to create credentials : ");

		// Creating an console interface
		
		Scanner scanner = new Scanner(System.in);
		CredentialService credentialService = new CredentialService();
	//	Employee employee = new Employee(firstName, lastName);

		do {
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			System.out.println("Enter 0 to exit");
			option = scanner.nextInt();
			switch(option) {
			case 1:
				// For technical department
				System.out.println("Welcome to Technical department, Please enter credentials below - ");
				System.out.println("Enter first name : ");
				firstName = scanner.next();
				System.out.println("Enter last name : ");
				lastName = scanner.next();
				System.out.println("\nDear " + firstName + " your generated credentials are as follows : ");
				credentialService.showCredentials();
				break;
			case 2:
				// for admin department
				System.out.println("Welcome to Admin department, Please enter credentials below - ");
				System.out.println("Enter first name : ");
				firstName = scanner.next();
				System.out.println("Enter last name");
				lastName = scanner.next();
				System.out.println("\nDear " + firstName + " your generated credentials are as follows : ");
				credentialService.showCredentials();
				break;
			case 3:
			// for human resource (HR) department
				System.out.println("Welcome to Human Resource department, Please enter credentials below - ");
				System.out.println("Enter first name : ");
				firstName = scanner.next();
				System.out.println("Enter last name");
				lastName = scanner.next();
				System.out.println("\nDear " + firstName + " your generated credentials are as follows : ");
				credentialService.showCredentials();
				break;
			case 4:
				
				// for legal department
				System.out.println("Welcome to Legal department, Please enter credentials below - ");
				System.out.println("Enter first name : ");
				firstName = scanner.next();
				System.out.println("Enter last name");
				lastName = scanner.next();
				System.out.println("\nDear " + firstName + " your generated credentials are as follows : ");
				credentialService.showCredentials();
				break;
			default:
				System.out.println("You choose to exit");
			}
			
		} while(option != 0);
		scanner.close();
	}



}