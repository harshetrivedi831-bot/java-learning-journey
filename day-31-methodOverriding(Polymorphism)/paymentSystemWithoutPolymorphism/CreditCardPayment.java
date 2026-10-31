package paymentSystemWithoutPolymorphism;

public class CreditCardPayment implements IPayment{

	@Override
	public void pay() {// user use to pay and return repsone from db
		System.out.println("CreditCardPayment.pay()");
		
	}

}
