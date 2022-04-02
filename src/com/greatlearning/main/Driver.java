package com.greatlearning.main;

import java.util.Scanner;
import com.greatlearning.model.*;
import com.greatlearning.service.*;

public class Driver {
private static Scanner sc = new Scanner(System.in);

	//Take inputs from the user for first name , last name, choice (id=1,2,3,4)
	
	public static void main(String[] args) {
		
		System.out.println ("Enter your first name");
		String firstName = sc.next();
		
		System.out.println ("Enter your last name");
		String lastName = sc.next();
		
		System.out.println ("Choose your department");
		System.out.println ("1. Technical");
		System.out.println ("2. Admin");
		System.out.println ("3. HR");
		System.out.println ("4. Legal");
		
		int choice=sc.nextInt();
		
		Employee emp;
		
		switch(choice) {
			case 1:
				emp = new Employee(firstName,lastName,"technical");
				break;
			case 2:
				emp = new Employee(firstName,lastName,"admin");
				break;
			case 3:
				emp = new Employee(firstName,lastName,"hr");
				break;
			case 4:
				emp = new Employee(firstName,lastName,"legal");
				break;
			default:
				System.out.println("Wrong choice");
				return;
		
		}
			CredentialService cs = new CredentialService();
			String email = cs.generateEmailAddress(emp);
			//System.out.println("Email address " + email);
			String password = cs.generatePassword();
			//System.out.println("Password " + password);
			cs.showCredentials(emp,email,password);
	}
	
	}
