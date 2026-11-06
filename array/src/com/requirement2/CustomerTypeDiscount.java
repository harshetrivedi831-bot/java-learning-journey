package com.requirement2;

public class CustomerTypeDiscount {
	// business logic to calculate discount based on accountType
	// design to calculate discount based on orderAmount and type

	float calulateDiscount(String customerType, int orderAmount) {

		float discount = 0;
		if (customerType.equalsIgnoreCase("Premium Customer")) {
			// receive discount based on order amount
			if (orderAmount < 1000) {
				discount = 0;
			} else if (orderAmount >= 1000 && orderAmount <= 4999) {
				discount = (orderAmount * 10 / 100);

			} else {
				discount = (orderAmount * 20 / 100);

			}
		}
		return discount;
	}
}
