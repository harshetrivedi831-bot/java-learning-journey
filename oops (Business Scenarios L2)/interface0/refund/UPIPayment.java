package interface0.refund;

public class UPIPayment implements IPayment{

	@Override
	public void pay(double amount) {
		System.out.println("UPI paid " + amount);
		
	}
/*
 * here default method already is there so user refund will process based 
 * on current object which is upi
 */
}
