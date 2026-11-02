Design a coupon system where a user can apply a coupon and get a discount.
----------------------
applyCoupon(amount,couponCode)
this coupon behaviour can be
there in different classe
so better to keep in interface
package com.harsh3;

public interface ICouponCode {
	void applyCoupon(double amount, String couponCode);
}
package com.harsh3;

public class RideBooking implements ICouponCode{

	@Override
	public void applyCoupon(double amount, String couponCode) {
		System.out.println("RideBooking.applyCoupon()");
		if(couponCode.equals("xaa-12")) {
			System.out.println("coupon applied");
		}
		
	}

}

