package com.array.newStyleInit;

import java.util.Iterator;

// Req : list of +ve and -ve number
// multiply +ve numbers by 10
public class Driver {
public static void main(String[] args) {
	// Array of primitve or Object type
	int[] numbers = {12,-12,56,-34,12};
	for (int index = 0; index < numbers.length; index++) {
		// current object
		if(numbers[index]<0) {
			// which means number is negative so skip that number/iteration
			// using continue;
			continue;
		}
		// next will be +ve so multiply
		System.out.println("Positive numbers : " + numbers[index]*10);
		System.out.println("Positive numbers : " + numbers[index]*20);
		System.out.println("Positive numbers: " + numbers[index]*20);
		System.out.println("Staged chnages: " + numbers[index]*20);
	}
}
}
