package interface0.payment;

public class PaymentProcessor {
	
// method which can take any object and calls implementation method
	void paymentProcessor(IPayment iPayment) {
		iPayment.pay(1000);
	}
}
