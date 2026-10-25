package com.harsh.oops.foodOrderingSystem;

public class Driver {
public static void main(String[] args) {
	/*
	 * As we have no UI, so tester application is what test the class we designed.
	 */
	FoodOrder user=new FoodOrder();//created order object and placed Order
	
	user.placeOrder(2000, 2, "harsh@gmail.com");
	

}
}
