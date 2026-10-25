package com.harsh.paymentSystem;

public class Driver {
public static void main(String[] args) {
	Payment payment=new Payment();
	payment.processPayment(20000);
	payment.processPayment(10000, "triv@121oksbi");
}
}
/*
 * wallet
 * upi wallet
 * binding method call to implementation method, compile
 * time.
 */
