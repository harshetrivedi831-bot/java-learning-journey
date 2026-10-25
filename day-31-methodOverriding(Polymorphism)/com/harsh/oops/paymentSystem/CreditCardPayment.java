package com.harsh.oops.paymentSystem;

public class CreditCardPayment extends Payment {
	private long creditCardNumber;
	private short cvv;
	public CreditCardPayment(double amount, boolean paymentStatus, String transactionId,long creditCardNumber,short cvv) {
		super(amount, paymentStatus, transactionId);
		this.creditCardNumber=creditCardNumber;
		this.cvv=cvv;
	}
	public long getCreditCardNumber() {
		return creditCardNumber;
	}
	public short getCvv() {
		return cvv;
	}
	/*
	 * methods : own implementation and hide core functionalities to achieve abstraction
	 */
	@Override
	void processPayment(double amount) {
		int successfulTransactions=0;
		int failedTransactions=0;
		int totalTransactions=0;
		double totalAmountProcessed=0;
		
		long cardNumber = this.getCreditCardNumber();
		/*
		 * primitive to String conversion using valueOf() for cardNumber validation
		 */
		int ch = String.valueOf(cardNumber).length();
		if(amount>0&&ch>=12)
		{
			totalAmountProcessed=totalAmountProcessed+this.getAmount();
			System.out.println("Credit Card Payment Successful");
			System.out.println("creditCardNumber : " + this.creditCardNumber);
			System.out.println("amount : " + this.getAmount());
			successfulTransactions++;
		}
		else
		{
			System.out.println("Credit Card Payment Failed");
			failedTransactions++;
		}
		totalTransactions++;
		System.out.println("successfulTransactions: " + successfulTransactions);
		System.out.println("failedTransactions: " + failedTransactions);
		System.out.println("totalTransactions : " + totalTransactions);
		System.out.println("totalAmountProcessed : " + totalAmountProcessed);
	}

}
