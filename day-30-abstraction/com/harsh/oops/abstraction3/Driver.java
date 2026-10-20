package com.harsh.oops.abstraction3;
/*
 * Who is the owner of Driver class : User only
 */
public class Driver {
public static void main(String[] args) {
	System.out.println("Driver.main()");
	System.out.println();
	System.out.println("Account opening..........");
	/*
	 * parent and child part initialized in saving account refer.
	 */
	// real object of saving type can also withdraw deposit and can see balance 
	SavingAccount user=new SavingAccount("Harsh", 40000, "836474564758434",8);
	
	/*
	 * below 20k is the amount - user have and want to deposit
	 * above 40k is the real balance which user got when an object is created.
	 */
	user.openAccount();
	System.out.println();
	user.deposit(20000);
	System.out.println();
	user.withdraw(20000);
	System.out.println();
	user.displaySavingAccountInfo();
	System.out.println();
	System.out.println("Driver.main()");
	
	
}
}
