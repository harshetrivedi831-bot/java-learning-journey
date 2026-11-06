package com.array;

public class BookDriver {
	public static void main(String[] args) {

		Book frenchRevolution = new Book("French Revolution");// object to store book titles
		Book holybook = new Book("holy book");
		Book tona = new Book("tona");

		Book priceOfrenchRevolution = new Book(1000);
		Book priceOfholybook = new Book(2000);
		Book priceOftona = new Book(3000);
		// ✓ Declare two arrays:
		Book title[] = new Book[3];// one for storing the book titles
		// Initialize the arrays with some sample book titles and prices
		title[0] = frenchRevolution;
		title[1] = holybook;
		title[2] = tona;
		Book price[] = new Book[3];// the other for storing their prices
		// Initialize the arrays with some sample book titles and prices
		price[0] = priceOfrenchRevolution;
		price[1] = priceOfholybook;
		price[2] = priceOftona;
		// Print the list of books with their titles and prices in a formatted manner.
		// AS books and prices input are fixed i will use FOR loop
		// title--first array
		System.out.println("--------book titles---------");
		for (int index = 0; index < title.length; index++) {
			System.out.println("Book titles : " + title[index].title);
		}
		System.out.println("---------book prices---------");
		// loop for another price --> array
		for (int index = 0; index < price.length; index++) {
			System.out.println("Book prices : " + price[index].price);
		}
	}
}
