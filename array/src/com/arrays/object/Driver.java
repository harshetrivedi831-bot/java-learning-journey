package com.arrays.object;

public class Driver {
public static void main(String[] args) {
	
	Order harsh = new Order("121A","Harsh",2300);
	Order kartik = new Order("121A","Kartik",2300);
	Order sahil = new Order("121A","Sahil",2300);
	// create an array which will hold 3-product object
	// product is userdefined object , so firstly develop then use it by creating object
	// and then store its refercne in an array
	Order order[] = new Order[3];
	order[0]=harsh;
	order[1]=kartik;
	order[2]=sahil;
	System.out.println(order[0]);
	System.out.println(order[2]);
}
}
