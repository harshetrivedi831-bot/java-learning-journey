package com.array;

public class Book {
	String title;
	int price;
	// can initlaize same object with different attributes
	public Book(String title) {
		super();
		this.title = title;
	}

	public Book(int price) {
		super();
		this.price = price;
	}
	
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	Book(){
		super();
	}
	

}
