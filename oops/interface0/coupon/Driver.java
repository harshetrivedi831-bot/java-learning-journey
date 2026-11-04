package interface0.coupon;

public class Driver {
public static void main(String[] args) {
	ICouponCode iCouponCode=new RideBooking();
	iCouponCode.applyCoupon(20000, "xaa-12");
}
}
