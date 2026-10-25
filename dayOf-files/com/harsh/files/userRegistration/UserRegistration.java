package com.harsh.files.userRegistration;

import java.util.Scanner;
/*
 * User class is responsible to initialize object states from console input.
 */
class User {
	String name;
	String email;
	String address;
	String password;
	/*
	 * default constructor cause input to be injected from console.
	 */
	User(){
		
	}	
}
/*
 * Counter: class responsible to count no of registration.
 */
class Counter{
	static int count;
	void countUser(Counter count) {
		Counter.count++;
		System.out.println("Total user registration: " + Counter.count);
	}
}
/*
 * UserDetails to display user registration details
 */
class UserDetails{
	int count=0;
	//User user =new User();//new create new object with fields and null
	Counter counter = new Counter();
	void displayUserDetials(User user) {//User user--> refer same object who got values
		System.out.println("Name: " +user.name);
		System.out.println("Email: " + user.email);
		System.out.println("Address: " + user.address);
		System.out.println("Password: " + user.password);
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
		
		System.out.println("Enter the name: ");
		user.name= scn.nextLine();

		System.out.println("Enter the email: ");
		user.email= scn.nextLine();

		System.out.println("Enter the address: ");
		user.address= scn.nextLine();

		System.out.println("Enter the mobileNo: ");
		user.password = scn.nextLine();
		
		userDetails.displayUserDetials(user);

	}

}
