package com.array;

public class Driver {
	public static void main(String[] args) {
		// create an array which will hold 5 intgeres
		// container which hold similar type(int,Employee) of data
		// declare size during compilation time.
		int productId[] = new int[5];// array of 5 seize created with defalt values
		// we have to initlasie it during compile time 
		// why ? we creae array for fast accessibility
		// constant time for random reading using index it goes to memory and fetch.
		//no travers or scaaning on elelenet from top required
		// fixed size and contionous memeory
		productId[0]=100;
		productId[1]=200;
		System.out.println(productId[0]);
		// earlier we store data in variable or object now same thing but in groups
		//we can do in array.
		System.out.println("Array is contigous ");
		System.out.println("Array is fixed size");
		System.out.println("size to be declared during compilation only");
		System.out.println("Array is not dynamic");
		System.out.println("Array is object");
		
		
	}
}
