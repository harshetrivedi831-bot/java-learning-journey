package com.harsh.loops.whileLoop;
/*
 * here number of iteration is not fixed depends on users ,
 * program dont know number of iteration so while loop
 */
import java.util.*;

// guess a lucky name 
// input depends on user which is not fixed -- use while
// if user input is fixed then for loop
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
