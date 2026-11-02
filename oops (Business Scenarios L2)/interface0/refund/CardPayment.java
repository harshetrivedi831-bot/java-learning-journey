package interface0.refund;

public class CardPayment implements IPayment{

	@Override
	public void pay(double amount) {
		System.out.println("Card paid Rs."+ amount);
		
	}

}
