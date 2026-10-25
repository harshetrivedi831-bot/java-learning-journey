package com.harsh.loop.whileLoop;

import java.util.*;


public class GuessNumber {
	public static void main(String[] args) {
		int luckyNumber = 15;
		Scanner scn = new Scanner(System.in);
		int userNumber = 0;// local to method
		// now as long as entered number is not equal to lucky number
		// keep running while loop
		while (userNumber != luckyNumber) {
			// and ask enter lucky number
			System.out.println("Enter the lucky number : ");
			userNumber = scn.nextInt();
			if (userNumber == luckyNumber) {
				System.out.println("you won");
				break;
			} else {
				System.out.println("try again");
			}

		}
		scn.close();
	}

}
