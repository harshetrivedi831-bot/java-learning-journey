package paymentSystemWithoutPolymorphism;

public class Driver {
public static void main(String[] args) {
	PaymentProcessor paymentProcessor=new PaymentProcessor();
	paymentProcessor.paymentHandler("debitcard");
}
}
