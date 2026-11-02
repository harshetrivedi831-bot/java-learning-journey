package checkoutSystem;

public class CheckoutDriver {
public static void main(String[] args) {
	Checkout checkout=new Checkout();
	checkout.applyCoupon("SAVE10", 2000);
	checkout.applyCoupon("null", -3000);//finalAmount should not be negative
}
}
