package com.harsh.oops.abstraction1;

public class FoodOrder {

	public void placeOrder(double orderAmount, int quantity, String email) {
		/*
		 * below functionality are not exposed to user.
		 * only placeOrder() can use it.
		 */
		this.restaurantAvailability();
		this.itemAvaialbility();
		this.calculateBill(orderAmount, quantity);
		this.applyDisocunt(orderAmount);
		this.processPayment(quantity);
		this.sendEmail(email);
	}

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

	/*
	 * I did not applied discount here its just a design which tells discount to be
	 * applied on orderAmount
	 */
	private void applyDisocunt(double orderAmount) {
		if (orderAmount > 1000) {
			System.out.println("Apply disocunt...");
		} else {
			{
				System.out.println("No discount");
			}
		}
	}

	/*
	 * here also finalPaymnet to be applied on disocuntedAmount just a design
	 */
	private void processPayment(double disountedAmount) {
		System.out.println("FoodOrder.processPayment()");
	}

	private void sendEmail(String email) {
		System.out.println("FoodOrder.sendEmail()");
	}
}
