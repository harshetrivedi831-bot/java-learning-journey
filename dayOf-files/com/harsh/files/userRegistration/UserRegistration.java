package com.harsh.files.userRegistration;

import java.util.Scanner;

/*
 * purpose of UserRegistration class : allowing user to sign up 
 */
public class UserRegistration {
	
	void userRegistration(String name, String email, String mobileNo, String password) {
		

		boolean isTrue = false;
		int count = 0;
		while (!isTrue) {

			if (name != null && email.contains("@g") && mobileNo.length() >= 10) {
				System.out.println("UserRegistration." + "userRegistration()");
				break;
			} else {

				System.out.println("try again");
				count++;

			}
			// only 5 attempts allowed
			if (count == 5) {
				break;
			}
			isTrue = false;
		}

	}
	
}
