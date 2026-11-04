package polymorphism.payment;

public class DebitCardPayment implements IPayment {

	@Override
	public void pay() {
		System.out.println("DebitCardPayment.pay()");
		
	}

}
