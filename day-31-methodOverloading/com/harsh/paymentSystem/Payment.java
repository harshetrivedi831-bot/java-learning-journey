package com.harsh.paymentSystem;

public class Payment {
	/*
	 * will have overloaded method operation is same --> process payment only
	 * payment type is different.
	 */
	void processPayment(String creditCard, double amount) {
		System.out.println("credit card payment");
	}

	void processPayment(double amount, String upiId) {
		System.out.println("UPI Payment");
	}

	void processPayment(double amount) {
		System.out.println("wallet");
	}
}
