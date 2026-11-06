package com.practice.switchCase;

public class EcomDiscount {
public static void main(String[] args) {
	EcomDiscount ecomDiscount=new EcomDiscount();
	System.out.println("user-1");
	ecomDiscount.calculateDiscount("Gold", 10000);
	System.out.println("user-2");
	ecomDiscount.calculateDiscount("Regular", 500);
	
}
// method
 void calculateDiscount(String customertype,int orderAmount){
	int discount=0;
	if(customertype.equalsIgnoreCase("Gold")) {
		
		discount = orderAmount*20/100;
		
	}
	else if(customertype.equalsIgnoreCase("Silver")) {
		
		discount = orderAmount*10/100;
		
	}
	else
	{ 
		discount = orderAmount*5/100;
	}
	// discount + calculate final amount 
	
	if(discount>=2500) {
		discount=2500;
	}
	orderAmount= orderAmount-discount;
	if(orderAmount<1000) {
		discount=0;
	}
	System.out.println("OrderAmount : " + orderAmount);
	System.out.println("Disocunt : " + discount);
	
}
}
