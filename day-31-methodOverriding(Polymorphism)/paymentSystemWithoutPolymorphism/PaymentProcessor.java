package paymentSystemWithoutPolymorphism;

import com.sun.jdi.Method;

public class PaymentProcessor {
	// user clicks on debit card -- "debit" comes and accept as param.
			public void paymentHandler(String paymentType) {
				if(paymentType.equalsIgnoreCase("debitCard"))
				{
					DebitCardPayment debitCardPayment=new DebitCardPayment();
					debitCardPayment.pay();
				}
			}
			//...etc...
	

}

