package com.harsh.oops.onlineBankingSystem;

public class BankAccount {

	private String holderName;
	private double balance;
	private String accountNumber;
	
	public BankAccount(String holderName, double balance, String accountNumber) {
		super();
		
		if(holderName.isEmpty()) {
			return;
		}
		this.holderName = holderName;
		/*
		 * validation: if balance set negative return;
		 */
		if(balance<=0) {
			return;
		}
		this.balance = balance;
		if(accountNumber!=null) {
			// block executes - condition true
		}
		this.accountNumber = accountNumber;
	}
	/*
	 * getters: to read data outside the method not getters cause i don't want to set balance and other fields.
	 */
	public String getHolderName() {
		return holderName;
	}
	public double getBalance() {
		return balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	/*
	 * common behavior like deposit(), withdraw and viewDetails() method 
	 * user should be able to withdrawn, deposit and should be able to openAccount rest of core functionality he will not be able to access to implement abstraction.
	 */
	
	public void deposit(double amount) {
		/*
		 * user will enter amount that is to be added in current object balance
		 */
		this.balance = amount + this.balance;
		
		System.out.println("BankAccount.deposit() : "+this.balance);
	}
	public void withdraw(double amount) {
		System.out.println("BankAccount.withdraw()");
		/*
		 * check if amount is less than balance then withdraw
		 * After that update current balance
		 */
		if(amount<=this.balance) {
			System.out.println("BankAccount.withdraw() "+amount);
		}
		this.balance=this.balance-amount;
		System.out.println("Left-over balance :" + this.balance);
	}
	/*
	 * display parent details (current object)
	 */
	public void displayBankAccountInfo() {
		System.out.println("Account No : " + this.accountNumber);
		System.out.println("Balance : " + this.balance);
		System.out.println("Account holder name :" + this.holderName);
	}
	/*
	 * openAccount functionality exposed to user
	 */
	public void openAccount() {
		this.verifyCustomerDetails();
		this.validatePan();
		this.generateAccountNumber();
		this.activateAccount();
		this.welcomeEmail();
	}
	/*
	 * core functionalities to open a new Account
	 *
	 */
	private void verifyCustomerDetails() {
		System.out.println("BankAccount.verifyCustomerDetails()");
	}
	private void validatePan() {
		System.out.println("BankAccount.validatePan()");
	}
	private void generateAccountNumber() {
		System.out.println("BankAccount.generateAccountNumber()");
		System.out.println("Account Number : " + Math.random());
	}
	private void activateAccount() {
		System.out.println("BankAccount.activateAccount()");
	}
	private void welcomeEmail() {
		System.out.println("BankAccount.welcomeEmail()");
	}
	
	
}
