package com.harsh.oops.loginSystem;

/*
 * method overloading : multiple method with same name and different parameter list.
 * binding will happen at compile time: JVM directly executes that implementation method.
 */
public class Login {

	public void doLogin(String gmail) {
		System.out.println("Login.doLogin()");
	}

	void doLogin(String mobileNumber, String gmail) {
		System.out.println("Login.doLogin()-2");

	}

	public void doLogin(long mobileNumber, String name) {
		System.out.println("Login.doLogin()-3");

	}

}
