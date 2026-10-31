package paymentSystemWithoutPolymorphism;

public class DebitCardPayment implements IPayment {

	@Override
	public void pay() {
		System.out.println("DebitCardPayment.pay()");
		
	}

}
