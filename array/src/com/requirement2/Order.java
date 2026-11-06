package com.requirement2;
// Order class : to represent users order functionality
public class Order {
	String orderID;
	String customerName;
	String productName;
	int productQuantity;
	int pricePerItem;
	String customerType;
	
	public Order(String orderID, String customerName, String productName, int productQuantity, int pricePerItem,String customerType) {
		super();
		this.orderID = orderID;
		this.customerName = customerName;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.pricePerItem = pricePerItem;
		this.customerType=customerType;
	}
	Order()
	{
		
	}
	
	int calculateOrderAmount()
	{
		return pricePerItem*productQuantity;
	}
	void displayOrderDetails()
	{
		System.out.println("Order ID        : " + orderID);
		System.out.println("Customer Name   : " + customerName);
		System.out.println("Product Name    : " + productName);
		System.out.println("Product Quantity: " + productQuantity);
		System.out.println("Price Per Item  : ₹" + pricePerItem);
		System.out.println("Customer Type   : " + customerType);
	}
}
