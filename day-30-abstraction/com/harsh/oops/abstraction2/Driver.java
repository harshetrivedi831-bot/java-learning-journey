package com.harsh.oops.abstraction2;

public class Driver {
	public static void main(String[] args) {
		System.out.println("Driver.main()");
		/*
		 * As data is encapsulated validation should happen in constructor only else it can initialize with garbage data.
		 * 
		 */
		
		MovieTicket movieTicket = new MovieTicket("Apne", 600, 3, "harsh@gmail.com");
		/*
		 * Id data is validated, read it using getters cause only option to access - don't provide setters
		 */
		movieTicket.bookTicket(movieTicket.getMovieName(), movieTicket.getPrice(), movieTicket.getNoOfSeats(),
				movieTicket.getEmail());
	}
}
