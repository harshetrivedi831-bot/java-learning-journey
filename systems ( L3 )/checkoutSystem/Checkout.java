package checkoutSystem;

public class Checkout {
	// user will supply from main.
void applyCoupon(String couponCode,double finalAmount) {
	float discount=0;
	final short MAX_DISCOUNT=200;
	// return finalAmount after coupon code
	if(couponCode.equalsIgnoreCase("SAVE10")) {
		//System.out.println("10 % off" + "//max disocunt 200");
		if(couponCode!=null && finalAmount>0) {
			System.out.println("invalid amount");
			return;
		}
		discount=(float)finalAmount*10/100;
		if(discount>MAX_DISCOUNT) {
			discount=MAX_DISCOUNT;
		}
		finalAmount=finalAmount-discount;
		
		
		
		
	}else if(couponCode.equalsIgnoreCase("FIRST20")) {
		if(couponCode!=null &&finalAmount>0) {
			System.out.println("invalid amount");
			return;
		}
		//System.out.println("20% Off" + "//max disocunt 200");
		discount=(float)finalAmount*20/100;
		if(discount>MAX_DISCOUNT) {
			discount=MAX_DISCOUNT;
		}
		finalAmount=finalAmount-discount;
		
	}else
	{
		System.out.println(finalAmount);
	}
	System.out.println("finalAmount : " + finalAmount);
}
}
