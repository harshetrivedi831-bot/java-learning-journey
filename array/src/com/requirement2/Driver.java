package com.requirement2;

public class Driver {
	public static void main(String[] args) {
		Order order = new Order();// to access instance methods.
		CustomerTypeDiscount discount = new CustomerTypeDiscount();
		
		// create multiple order + initlise -- store in array
		Order order1 = 
new Order("ID1", "Harsh", "Laptop", 1, 60000, "Premium Customer");
		Order order2 = 
new Order("ID1", "Harsh", "Laptop", 1, 60000, "Regular Customer");
		
		Order arr[] = new Order[2];
		arr[0]=order1;
		arr[1]=order2;
		
		// Iterate through array to print order specific details
		
		for(int index=0;index<arr.length;index++) {
			// for every current object calculation is happening-
			// order specific details
			System.out.println("=====order Details=====");
			String customerType= arr[index].customerType;
			System.out.println("customerName : " + arr[index].customerName);
			System.out.println("orderID : " + arr[index].orderID);
			// current object orderAmount
			int originalOrderAmount = arr[index].calculateOrderAmount();
			System.out.println("originalOrderAmount : " + originalOrderAmount);
			// current object disocunted amount
			float discountedAmount = 
	discount.calulateDiscount(arr[index].customerType, originalOrderAmount);
			System.out.println("discountedAmount : " + discountedAmount);
			float finalAmount = originalOrderAmount-discountedAmount;
			System.out.println("finalAmount : " + finalAmount);
			// Whether the customer received a discount
			if(discountedAmount>0)
			{
				System.out.println("customer received the discount");
			}
			
			
		}
		
		

	}
}
