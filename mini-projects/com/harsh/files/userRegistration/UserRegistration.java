package com.harsh.files.userRegistration;

import java.util.Scanner;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;
/*
 * User class is responsible to initialize object states from console input.
 */
class User {
	private String name;
	private String email;
	private String address;
	private String mobile;
	/*
	 * getters and setters to read and set the data from outside the class 
	 * to give controlled accesss to user such that invalid data before going to 
	 * customer object should be validated first.
	 */
	
	/*
	 * default constructor cause input to be injected from console.
	 */
	User(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}	
}
/*
 * Counter: class responsible to count no of registration.
 */
class Counter{
	private static int count;
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Counter.count = count;
	}
	/*
	 * member function if called then it will increament the count
	 */
	void countUser(Counter count) {
		Counter.count++;
		System.out.println();
		System.out.println("Total user registration: " + Counter.count);
	}
}
/*
 * UserDetails to display user registration details
 */
class UserDetails{
	//int count=0;
	//User user =new User();//new create new object with fields and null
	Counter counter = new Counter();
	void displayUserDetials(User user) {//User user--> refer same object who got values
		System.out.println("Name: " +user.getName());
		System.out.println("Email: " + user.getEmail());
		System.out.println("Address: " + user.getAddress());
		System.out.println("Password: " + user.getMobile());
		System.out.println(user.getName()+" is regsitered succesfully");
		/*
		 * after printing call -- counterUser to add counter upon successful registration
		 */
		counter.countUser(counter);
	}
}
/*
 * UserRegistration does console based interactive user registration.
 */
public class UserRegistration {
	
	Scanner scn = new Scanner(System.in);
	
	User user = new User();
	
	UserDetails userDetails=new UserDetails();
	
	void userRegistration() {
		boolean isTrue=false;
		/*
		 * Loop to allow multiple registrations using while.
		 */
		while(!isTrue) {
			//User decision-based registration flow using if-else
			System.err.println("Wanna register user(Yes/No)?");
			// added control flow decision of registration 
			String userInput = scn.next();
			scn.nextLine();
			
			if(userInput.equalsIgnoreCase("Yes")) {
				
				System.out.println("Enter the name: ");
				
				String name= scn.nextLine();//read and match with each regex!!
				if(name.matches("[a-zA-Z]+")) {
					/*
					 * if name has all the character as per regex so just set that
					 * in user object
					 */
					user.setName(name);
					
				}
				else
				{
					System.out.println("invalid name");
					continue;
				}
				
				
				System.out.println("Enter the email: ");
				/*
				 * implemented email validation before reading.
				 */
				
				String email= scn.next();//read if true then inject in object state
				if(email.contains("@")) {
					user.setEmail(email);
				}
				else
				{System.out.println("invalid email");
					/*
					 * skipping current iteration using continue so this employee will not register
					 */
					continue;
				}
				
				scn.nextLine();
				System.out.println("Enter the address: ");
				String address= scn.nextLine();
				if(address.matches("[a-zA-z0-9 ,-/]+")) {
					user.setAddress(address);
				}
				else
				{
					System.out.println("invalid address");
					continue;
				}

				System.out.println("Enter the mobileNo: ");
				String mobile= scn.nextLine();
				if(mobile.matches("[0-9]+")) {
					user.setMobile(mobile);
				}
				else
				{
					System.out.println("invalid mobile");
					continue;
				}
				
				userDetails.displayUserDetials(user);
				
			}
			else
			{
				System.out.println("Thanks for coming!!");
				break;
			}
			/*
			 * to confirm used wants to proceed with?
			 */
			System.out.println("Do you want to continue(Yes/No)?");
			String confirm = scn.next();
			if(confirm.equalsIgnoreCase("yes")) {
				isTrue=false;
			}
			else
			{
				isTrue=true;
			}
			
		}
		
		
	}
}



