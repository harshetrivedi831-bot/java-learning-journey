package interface0.payment;

public class UPIPayment implements IPayment {
	String upiID;

	public UPIPayment(String upiID) {
		super();
		this.upiID = upiID;
	}

	@Override
	public void pay(double amount) {
		System.out.println("Rs." + amount + " : UPI " + (this.upiID) + "  se bheje");

	}

}
