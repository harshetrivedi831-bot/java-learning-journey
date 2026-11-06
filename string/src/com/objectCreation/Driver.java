package com.objectCreation;

class User{
	String userName;

	public User(String userName) {
		super();
		this.userName = userName;
	}
	
}
public class Driver {
public static void main(String[] args) {
	
	
	String firstName = "Harsh";
	String middleName ="Harsh";
	String lastName="Trivedi";
	String lastOfLastName ="Trivedi";
	String str =new String("Kumar");
//	System.out.println(firstName==lastName);
//	System.out.println(firstName==middleName);
//	System.out.println(middleName==lastOfLastName);
	User user = new User("harsh");
	User user1 = new User("harsh");
	// here "harsh" are different in both not same 
	// b/s every object has its own copy of instance var.
	System.out.println(user==user1);
	// equals() is overridden in String class
	System.out.println(user.equals(user1));
	System.out.println(firstName.equals(middleName));
	System.out.println(firstName.equals(user));
	System.out.println(firstName==middleName.intern());
	
	
}
}
