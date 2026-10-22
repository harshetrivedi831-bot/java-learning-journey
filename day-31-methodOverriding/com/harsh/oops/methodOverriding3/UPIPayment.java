package com.harsh.oops.methodOverriding3;

public class UPIPayment extends Payment{
	/*
	 * own attributes to be initilised if any
	 */
	private String upiId;
	/*
	 * constructor in child + parent part 
	 */
	public UPIPayment(double amount, boolean paymentStatus, String transactionId,String upiId) {
		super(amount, paymentStatus, transactionId);
		this.upiId=upiId;
	}
	/*
	 * getter to read upiId
	 */
	public String getUpiId() {
		return upiId;
	}
	/*
	 * over-ridden method - own implementation
	 */
	@Override
	void processPayment(double amount) {
		System.out.println("own implementation");
		/*
		 * validation to be here
		 */
		if(amount>0 && this.upiId.contains("@")) {
			System.out.println("Amount : " + this.getAmount());
			System.out.println("upi id : " + this.upiId);
		}
		else
		{
			System.out.println("UPI Payment Failed");
		}
		
	}
	
	

}
