package interface0.refund;

public class Driver {
public static void main(String[] args) {
	IPayment iPayment=new UPIPayment();//click refund on upi
	iPayment.pay(2000);
	iPayment.refund(1000);
}
}
