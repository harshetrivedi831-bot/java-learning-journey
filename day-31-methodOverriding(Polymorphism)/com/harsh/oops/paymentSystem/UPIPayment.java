package com.harsh.oops.paymentSystem;

public class UPIPayment extends Payment{
	
	private String upiId;
	
	public UPIPayment(double amount, boolean paymentStatus, String transactionId,String upiId) {
		super(amount, paymentStatus, transactionId);
		this.upiId=upiId;
	}
	
	public String getUpiId() {
		return upiId;
	}
	/*
	 * over-ridden method - own implementation
	 */
	@Override
	void processPayment(double amount) {
		int successfulTransactions=0;
		int failedTransactions=0;
		int totalTransactions=0;
		double totalAmountProcessed=0;
		System.out.println("UPI Payment successful");
		
		if(amount>0 && this.upiId.contains("@")) {
			totalAmountProcessed=totalAmountProcessed+this.getAmount();
			System.out.println("Amount : " + this.getAmount());
			System.out.println("upi id : " + this.upiId);
			successfulTransactions++;
		}
		else
		{
			System.out.println("UPI Payment Failed");
			failedTransactions++;
		}
		totalTransactions++;
		System.out.println("successfulTransactions: " + successfulTransactions);
		System.out.println("failedTransactions: " + failedTransactions);
		System.out.println("totalTransactions : " + totalTransactions);
		System.out.println("totalAmountProcessed : " + totalAmountProcessed);
	}
	
	

}
