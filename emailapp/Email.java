package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	private int DefaultPasswordLength = 10;
	
	// Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created: " + this.firstName + " " + this.lastName);
		
		// Call a method asking for the department - return the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		// Call a method that returns a random password
		this.password = randomPassword(DefaultPasswordLength);
		System.out.println("Your password is: " + this.password);
	}
	
	// Ask for the department
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n Enter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) { return "sales"; }
		else if ( depChoice == 2) { return "dev";}
		else if ( depChoice == 3) { return "acct";}
		else { return "";}
	}
	
	// Generate a random password within the array passwordSet and using an loop to take out a character from the random number and pass it into the array one at a time.
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!0123456789!@#$%";
		char[] password = new char[length];
		for (int i =0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	// Set the mailbox capacity
	
	// set the alternate email
	
	// Change the password

}
