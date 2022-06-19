package com.vartikasingh;

import java.util.Random;

import com.vartikasingh.main.Employee;



	public class CredentialService {




	public String generateEmail(String FirstName, String LastName, String department)
	{
		return FirstName+LastName+"@"+ department+"."+"vartika.com"; 
	}
	
	public void showCredential(Employee employee, String generateEmail, String generatedPassword) {
		System.out.println("Dear "+employee.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email --> "+ generateEmail);
		System.out.println("Password --> "     +generatedPassword);
	}



	public String generatedPassword() {
		int len = 10;
		String chars= "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder(len);
		for(int i = 0; i< len; i++) {
			sb.append(chars.charAt(rnd.nextInt(chars.length())));

		}
		return sb.toString();
		
		}


}
