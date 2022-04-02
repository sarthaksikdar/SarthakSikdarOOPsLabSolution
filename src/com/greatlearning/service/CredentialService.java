package com.greatlearning.service;
import com.greatlearning.model.*;
import com.greatlearning.main.*;
import java.util.Random;
public class CredentialService {
	public String generateEmailAddress(Employee emp) {
	// generate email address
	
		return emp.getfirstname().toLowerCase() + emp.getLastName().toLowerCase() + "@" + emp.getDepartment().toLowerCase() + ".abc.com";
	}
	
	public String generatePassword() {
		
		Random random = new Random();
		
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz"; 
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*+-/.<>?_";
		String allowedChars = capitalLetters + smallLetters + numbers + specialCharacters;
		
		char[] password = new char[8];
		for (int i=0; i<8; i++) {
			int idx = random.nextInt(allowedChars.length());
			password[i] = allowedChars.charAt(idx);
			
		}	
		//GENERATE 8 DIGIT RANDOM PASSWORD
		return new String(password);
	}
	
	public void showCredentials(Employee emp, String email, String password) {
		System.out.println("Dear " + emp.getfirstname() + " your generated credentials are as follows: ");
		System.out.println("Email Address --> " + email);
		System.out.println("Password --> " + password);
	}
}


