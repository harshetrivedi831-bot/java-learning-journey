package interface0.coupon;

public class RideBooking implements ICouponCode{

	@Override
	public void applyCoupon(double amount, String couponCode) {
		System.out.println("RideBooking.applyCoupon()");
		if(couponCode.equals("xaa-12")) {
			System.out.println("coupon applied");
		}
		
	}

}
