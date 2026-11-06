package com.objectCreation;

class Order
{
	String orderId;

	public Order(String orderId) {
		super();
		this.orderId = orderId;
	}
	
}
public class Driver2 {
	
public static void main(String[] args) {
	String s1="new";//ob------
	String s2 ="few";//obj--------
	String s3 ="mew";//onj----------
	String s4 = "new";//s1 and s4 points same reference so save memory object object creation consumes memory
	System.out.println(s1==s4);//t
	
	/*
	 * == in Stirng and array used to comapre reference
	 * equals in array used to comapre reference cause equals method use behvaior of object class
	 * equals method used with Stiring means using Stirng object referecne to call equals now its override in String class and compare content not reference 
	 */
	//System.out.println(s1.equals(s4));//t
	Order order = new Order("new");//obj--orderId
	// here i am calling equals using userdefined class and these equals use default behaviour hence reference comaprison and false.
	//System.out.println(order.equals(s4));
	String firstObject="hii";
	firstObject="hello";
	System.out.println("firstObject : " + firstObject);
}
}
