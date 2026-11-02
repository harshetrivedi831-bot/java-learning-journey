package interface0.payment;

public class CashPayment implements IPayment {

	@Override
	public void  pay(double amount) {
		System.out.println("Rs." + amount+" cash mein diye");
	}

}
