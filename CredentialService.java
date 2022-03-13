package com.greatlearning.service;

import com.greatlearning.app.GenerateCredentials;

import java.security.SecureRandom;

public class CredentialService {	

	public static String generatePassword(int len)
    {
        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*abcdefghijklmnopqrstuvwxyz0123456789";
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
 
        for (int i = 0; i < len; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
 
        return sb.toString();
    }	
	public String generateEmailAddress() {
		if (GenerateCredentials.option == 1)
			System.out.println ("Mail ID : " + GenerateCredentials.firstName.toLowerCase() + GenerateCredentials.lastName.toLowerCase() + "@" + "tech" + ".volcano.com");
		else if (GenerateCredentials.option == 2)
			System.out.println ("Mail ID : " + GenerateCredentials.firstName.toLowerCase() + GenerateCredentials.lastName.toLowerCase() + "@" + "admin" + ".volcano.com");
		 else if (GenerateCredentials.option == 3)
			System.out.println ("Mail ID : " + GenerateCredentials.firstName.toLowerCase() + GenerateCredentials.lastName.toLowerCase() + "@" + "hr" + ".volcano.com");
		  else if (GenerateCredentials.option == 4)
			System.out.println ("Mail ID : " + GenerateCredentials.firstName.toLowerCase() + GenerateCredentials.lastName.toLowerCase() + "@" + "legal" + ".volcano.com");
	return "";		
	}
	public void showCredentials() {
		if (GenerateCredentials.option == 1)
			System.out.println (generateEmailAddress() + "Passowrd : " + generatePassword(8) + "\n");
		
		else if (GenerateCredentials.option == 2)
			System.out.println (generateEmailAddress() + "Passowrd : " + generatePassword(8) + "\n");
		else if (GenerateCredentials.option == 3)
			System.out.println (generateEmailAddress() + "Passowrd : " + generatePassword(8) + "\n");
		
		else if (GenerateCredentials.option == 4)
			System.out.println (generateEmailAddress() + "Passowrd : " + generatePassword(8) + "\n");		  	
	}
}