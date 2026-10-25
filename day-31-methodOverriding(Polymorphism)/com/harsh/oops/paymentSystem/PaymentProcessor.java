package com.harsh.oops.paymentSystem;
/*
 * purpose of this class : to receive any kind of object and bind it to right 
 * implementation method at runtime.
 */
public class PaymentProcessor {
 void paymentProcessor(Payment payment) {
	 /*
	  * abstraction: at run time object type based method will invoke.
	  */
	payment.processPayment(payment.getAmount());
	
}
}
