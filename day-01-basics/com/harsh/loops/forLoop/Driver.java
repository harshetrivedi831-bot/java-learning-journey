package com.harsh.loops.forLoop;

public class Driver {
	public static void main(String[] args) {
		Customer user1 = new Customer("harsh", 10000, "23847239847");
		Customer user2 = new Customer("kartik", 100, "23847239847");
		Customer user3 = new Customer("sahil", 20, "23847239847");
		// create an array of fixed size
		Customer user[] = new Customer[3];
		// insert element at the index for fast access
		user[0] = user1;
		user[1] = user2;
		user[2] = user3;
		// input is fixed use for loop 
		for (int index = 0; index < user.length; index++) {
			// decision to print only those employee whose balance is below 2000
			if (user[index].balance < 2000) {
				System.out.println(user[index].name + " " + user[index].balance);
			}
		}

	}
}
