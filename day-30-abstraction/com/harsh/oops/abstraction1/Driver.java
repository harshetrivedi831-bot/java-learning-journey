package com.harsh.oops.abstraction1;

public class Driver {
public static void main(String[] args) {
	FoodOrder user=new FoodOrder();
	System.out.println("Driver.main()");
	user.placeOrder(2000, 2, "harsh@gmail.com");
	System.out.println("Driver.main()");

}
}
