package interface0.refund;

public interface IPayment {
void pay(double amount);
// business says refund bhi chahiye such that refund can be processed
default void refund(double amount) {
	System.out.println("Refund of rs."+amount+" sent to original source");
}
}
