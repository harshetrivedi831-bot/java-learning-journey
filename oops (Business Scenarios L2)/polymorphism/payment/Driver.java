package polymorphism.payment;

public class Driver {
public static void main(String[] args) {
	PaymentProcessor paymentProcessor=new PaymentProcessor();
	/*
	 * without polymorpism -- ui send request 
	 * paymentProcessor.paymentHandler("debitcard");
	 */
	// with polymorphism
	paymentProcessor.paymentProcessor(new DebitCardPayment());
	
}
}
