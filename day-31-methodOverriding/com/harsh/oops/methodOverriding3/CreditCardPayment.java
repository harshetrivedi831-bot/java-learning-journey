package com.harsh.oops.methodOverriding3;

public class CreditCardPayment extends Payment {
	/*
	 * own attributes like cardNumber or cvv
	 */
	private long creditCardNumber;
	private short cvv;
	/*
	 * constructor
	 */
	public CreditCardPayment(double amount, boolean paymentStatus, String transactionId,long creditCardNumber,short cvv) {
		super(amount, paymentStatus, transactionId);
		this.creditCardNumber=creditCardNumber;
		this.cvv=cvv;
	}
	/*
	 * getters
	 */
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
		/*
		 * validate amount and cardNumber
		 */
		long cardNumber = this.getCreditCardNumber();
		/*
		 * primitive to String conversion using valueOf() for cardNumber validation
		 */
		int ch = String.valueOf(cardNumber).length();
		if(amount>0&&ch>=12)
		{
			System.out.println("Credit Card Payment Successful");
			System.out.println("creditCardNumber : " + this.creditCardNumber);
			System.out.println("amount : " + this.getAmount());
		}
		else
		{
			System.out.println("Credit Card Payment Failed");
		}
	}

}
