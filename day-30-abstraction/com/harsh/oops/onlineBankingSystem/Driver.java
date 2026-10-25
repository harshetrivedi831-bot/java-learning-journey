package com.harsh.oops.onlineBankingSystem;

public class Driver {
public static void main(String[] args) {
	System.out.println("Account opening..........");
	
	SavingAccount user=new SavingAccount("Harsh", 40000, "836474564758434",8);
	
	/*
	 * As part of inheritance:
	 * Account class has got accountOpening,deposit,withdraw implementation which can be reused in child 
	 * in case saving account user wants to perform same behavior
	 */
	user.openAccount();
	user.deposit(20000);
	user.withdraw(20000);
	user.displaySavingAccountInfo();
	
	
}
}
