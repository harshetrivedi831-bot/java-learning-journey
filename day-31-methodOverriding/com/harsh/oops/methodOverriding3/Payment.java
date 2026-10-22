package com.harsh.oops.methodOverriding3;

public class Payment {
/*
 * why this class : it will contain common attributes and behavior i.e.transaction related which child classes can re use so code becomes re usable and avoiding duplicacy.
 */
	private double amount;
	private boolean paymentStatus;
	private String transactionId;
	/*
	 * constructor needed to inject values
	 */
	public Payment(double amount, boolean paymentStatus, String transactionId) {
		super();
		this.amount = amount;
		this.paymentStatus = paymentStatus;
		this.transactionId = transactionId;
	}
	/*
	 * getters to read from outside the class
	 */
	public double getAmount() {
		return amount;
	}
	public boolean isPaymentStatus() {
		return paymentStatus;
	}
	public String getTransactionId() {
		return transactionId;
	}
	/*
	 * Implement method which will have fxnality.
	 */
	void processPayment(double amount) {
		// 100 lines of code is there 
		/*
		 * validating amount with available balance etc....
		 * -----------------------
		 * core functionality is within 
		 */
		System.out.println("Payment.processPayment()");
	}
	
}
