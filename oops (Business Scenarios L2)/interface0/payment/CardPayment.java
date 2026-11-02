package interface0.payment;

public class CardPayment implements IPayment {
	String holderName;

	public CardPayment(String holderName) {
		super();
		this.holderName = holderName;
	}

	@Override
	public void pay(double amount) {
		System.out.println(this.holderName + " rs." + amount + " card se diye");

	}

}
