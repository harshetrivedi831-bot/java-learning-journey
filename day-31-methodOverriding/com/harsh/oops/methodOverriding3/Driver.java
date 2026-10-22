package com.harsh.oops.methodOverriding3;

public class Driver {
public static void main(String[] args) {
	/*
	 * parent can hold child reference, as 
	 * jvm check object type and it will call 
	 * overridden method where as for compiler reference type matters
	 */
	Payment harsh = new UPIPayment(20000, true, "12344ABC33434", "harsha@123");
	/*
	 * java thinks 123 is int but constructor param its short to explicit casting
	 */
	Payment asif = new CreditCardPayment(30000.00, true, "Abc232435", 123456789098l, (short)123);
	/*
	 * child reference parent can hold why ? benefit u will see in method param.
	 */
	/*
	 * must execute the correct overridden method at runtime. when u hover its compile time. actually jvm does the magic at runtime it check object type and its overridden method executes.
	 */
	//harsh.processPayment(2000);
	/*
	 * Store all payment objects inside an array.

	 */
	Payment[] payment = {harsh,asif};
	/*
	 * loop to traverse objects
	 */
	for (int index = 0; index < payment.length; index++) {
		/*
		 * The program must iterate through every payment object and invoke: overridden method
		 */
		// this is method call
		payment[index].processPayment(2000);
		/*
		 * need to maintain counters
		 */
		
	}
	
}


}
