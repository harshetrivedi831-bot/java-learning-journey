package com.practice.switchCase;
// based on number entered , output the day 
// like if 1 entered o/p shold be monday (input tied to output)
// if else if takes a condition which returns boolean and then block 
// execute that why switch
public class Driver {
public static void main(String[] args) {
	Driver driver = new Driver();
	driver.guessTheDay(5);  
}
void guessTheDay(int number) {
	switch (number) {
	case 1:
		System.out.println("Monday");
		break;
	case 2:
		System.out.println("Monday-2");
		break;
		
	default:
		System.out.println("defaulter user");
		break;
	}
}
}
