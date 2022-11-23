package emailapp;

import java.util.Scanner;

public class Email {
	

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String email;
	private String companySuffix = "mhacompany.com";
	
	// Constructors for first and last name
	
	public Email(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		
		
		 
		 // call a method asking for dept and returning dept
		 
		 
		 this.department = setDepartment();
		
		 
		 // method that returns random password
		 
		 this.password = randomPassword(defaultPasswordLength);
		 
		 System.out.println("Your password is: " + this.password);
		 
		// Combine elements to generate email
		 email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		

	}
	
	
	// ask for department
	
	private String setDepartment() {
		System.out.print("New Worker: " + firstName + ". Department Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n Enter Department Code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		
		if(depChoice == 1) {
			return "sales";
			
		}else if (depChoice == 2) { 
			return "dev";	
			
		}else if (depChoice == 3) {
			return "accounting";
		
		}else { 
			return "";		
		}
			
		}
		
	
	
	
	// generate random password
		
		private String randomPassword(int length) {
			
			String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%&";
			
			char [] password = new char[length];
			
			for(int i = 0;i < length;i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
			}
			return new String(password);
		}
	
		
		
	
		
		
	
	//set mailbox cap
		
		public void setMailboxCapacity(int capacity) {
			this.mailboxCapacity = capacity;
		}
		
		
	
	//set alternate email
		
		public void setAlternateEmail(String altEmail) {
			this.alternateEmail = altEmail;
		}
		
		
		
	
	//change password
	
		public void changePassword(String pasword) {
			this.password = password;
		}
		
		public int getMailboxCapacity() { return mailboxCapacity; }
		public String getAlternateEmail() { return alternateEmail; }
	
	public String getPassword() {
		return password;
	}
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName +
				"\nCOMPANY EMAIL: " + email + 
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
		
	}
	
	
}
	
	
	


