package com.requirement1;

public class BookDriver {
	public static void main(String[] args) {
		// can mention 200 or 300f cause java thinks they are int which can convert to
		// float.
		Book book1 = new Book("good habits", 129.50f);
		Book book2 = new Book("atomic habits", 300f);
		Book book3 = new Book("atoms", 200f);
		Book book4 = new Book("gyaan", 400f);
		Book book5 = new Book("avtaar", 500f);

		// array of type Book(object)
		Book book[] = new Book[5];
		// store books on indexes -- create 5 book object to represent 5 books
		book[0] = book1;
		book[1] = book2;
		book[2] = book3;
		book[3] = book4;
		book[4] = book5;
		// now an array with 5 books got created.
		// Use a for loop to traverse the array AS total books/input are fixed - for
		System.out.println("--------books + prices -------");
		float assumedExpensiveBook = 0.0f;
		float sum = 0.0f;
		float average = 0.0f;
		for (int index = 0; index < book.length; index++) {
			// Print each book's title and price in a formatted manner.
			// (book[index].price firstly (book[0].price gives price of first book obj.
			System.out.println(book[index].price + ", " + book[index].title);
			// Find and print the most expensive book.
			// line no 23 : I assumed float assumedExpensiveBook =0.0f;
			// then compare with current book price and swap
			if (book[index].price > assumedExpensiveBook) {
				assumedExpensiveBook = book[index].price;
			}
			// Calculate and print the total price of all books.
			// create sum and everytime i traverse current object price i add sum
			sum = sum + book[index].price;
			// Calculate and print the average price of the books.
			// average price = totalprice / no of books
			// calculate no of books
			// System.out.println(book.length);
			average = (sum / book.length);

		}

		System.out.println("the most expensive book is this : " + assumedExpensiveBook);
		System.out.println("total price of all books : " + sum);
		System.out.println("average price of the books : " + average);
	}
}
