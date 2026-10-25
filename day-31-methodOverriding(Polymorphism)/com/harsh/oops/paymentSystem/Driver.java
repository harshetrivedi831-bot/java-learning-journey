package com.harsh.oops.paymentSystem;

public class Driver {
public static void main(String[] args) {
	
	PaymentProcessor paymentProcessor=new PaymentProcessor();
	
	Payment harsh = new UPIPayment(20000, true, "12344ABC33434", "harsha@123");	
	Payment asif = new CreditCardPayment(30000.00, true, "Abc232435", 123456789098l, (short)123);
	
	Payment[] payment = {harsh,asif};
	
	for (int index = 0; index < payment.length; index++) {
		
		paymentProcessor.paymentProcessor(payment[index]);
		System.out.println("----------------------------");
		
	}
	
}


}
