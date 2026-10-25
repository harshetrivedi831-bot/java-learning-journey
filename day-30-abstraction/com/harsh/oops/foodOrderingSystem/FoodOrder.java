package com.harsh.oops.foodOrderingSystem;

public class FoodOrder {
	/*
	 * placeOrder() method exposed to user which what is happening not how order is getting placed.
	 * how order is getting placed: core implementations are not exposed to user, just to bring
	 * simplicity and remove complexity other wise user needs to know about those operations as well.
	 */
	/*
	 * user has to provide basic details --- to place order.
	 */
	public void placeOrder(double orderAmount, int quantity, String email) {
		
		this.restaurantAvailability();
		this.itemAvaialbility();
		this.calculateBill(orderAmount, quantity);
		this.applyDisocunt(orderAmount);
		this.processPayment(quantity);
		this.sendEmail(email);
	}
/*
 * below are the core implementations!!
 */
	private boolean restaurantAvailability() {
		System.out.println("FoodOrder.restaurantAvailability()");
		return true;
	}

	private boolean itemAvaialbility() {
		System.out.println("FoodOrder.itemAvaialbility()");
		return true;
	}

	private double calculateBill(double orderAmount, int quantity) {
		System.out.println("FoodOrder.calculateBill()");
		orderAmount = orderAmount * quantity;
		return orderAmount;
	}

	private void applyDisocunt(double orderAmount) {
		if (orderAmount > 1000) {
			System.out.println("Apply disocunt...");
		} else {
			{
				System.out.println("No discount");
			}
		}
	}
	private void processPayment(double disountedAmount) {
		System.out.println("FoodOrder.processPayment()");
	}

	private void sendEmail(String email) {
		System.out.println("FoodOrder.sendEmail()");
	}
}
