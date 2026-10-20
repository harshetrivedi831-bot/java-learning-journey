package com.harsh.oops.abstraction3;

public class SavingAccount extends BankAccount {
	/*
	 * own attributes 
	 * 
	 */
	private double rateOfInterest;
	/*
	 * getter to read getRateOfInterest()
	 */
	public double getRateOfInterest() {
		return rateOfInterest;
	}

	/*
	 * constructor : parent & child initialization
	 */
	public SavingAccount(String holderName, double balance, String accountNumber,double rateOfInterest) {
		super(holderName, balance, accountNumber);
		this.rateOfInterest=rateOfInterest;
	}
	/*
	 * a method to calculate rate of Interest quarterly basis
	 */
	public void calculateQuarterlyInterest() {
		// current balance -- getBalance

       double annualInterest = this.getBalance()*(this.rateOfInterest/100);
       double quaterlyInterest = annualInterest/4;
        System.out.println("Quarterly Interest: " + quaterlyInterest);
    }
	/*
	 * display saving account info
	 */
	void displaySavingAccountInfo() {
		/*
		 * No repetition re use parent class method
		 * 
		 */
		this.displayBankAccountInfo();
		System.out.println("RateOfInterest : " + this.rateOfInterest);
	}

	
	

}
