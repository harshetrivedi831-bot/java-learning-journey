package polymorphism.payment;


public class PaymentProcessor {
	/*
	 * -----without polymophism----------------
	 *  * user clicks on debit card -- "debit" comes and accept as param.
	 * public void paymentHandler(String paymentType) {
				if(paymentType.equalsIgnoreCase("debitCard"))
				{
					DebitCardPayment debitCardPayment=new DebitCardPayment();
					debitCardPayment.pay();
				}
			}
	 * ----------with polymorphism --------
	 * where parent (class/interface) can hold child reference
	 * means with one reference many class objects can be handled and invoked
	 * at runtime.
	 * 	
	 */
	void paymentProcessor(IPayment iPayment) {
		iPayment.pay();//polymorphism at run time desired class fxnality runs
	}

	

}

