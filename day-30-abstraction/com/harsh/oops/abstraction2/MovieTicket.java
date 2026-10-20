package com.harsh.oops.abstraction2;

public class MovieTicket {
	/*
	 * Movie Ticket for a customer so customer name,email,seats registration and
	 * moviePrice details to be collected.
	 */
	private String movieName;
	private float price;
	private int noOfSeats;
	private String email;

	/*
	 * data validation during constructor initialization
	 */
	public MovieTicket(String movieName, float price, int noOfSeats, String email) {
		super();
		this.movieName = movieName;
		if (price <= 0 ) {
			return;
		}
		this.price = price;
		if (noOfSeats <= 0) {
			return;
		}
		this.noOfSeats = noOfSeats;
		this.email = email;
	}

	/*
	 * getters to read data from an object
	 */
	public String getMovieName() {
		return movieName;
	}

	public float getPrice() {
		return price;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public String getEmail() {
		return email;
	}

	/*
	 * functionality exposed to user to book ticket where as hiding how ticket is
	 * being booked.
	 */
	public void bookTicket(String movieName, float price, int noOfSeats, String email) {
		this.seatsAvailability(noOfSeats);
		double totalAmount = this.totalAmount(noOfSeats, price);
		double totalAmountAfterDiscount = this.applyDiscount(noOfSeats, totalAmount);
		System.out.println(totalAmountAfterDiscount);
		double ticketNumber = this.generateTicketNumber();
		System.out.println(ticketNumber);
		this.processPayment(totalAmountAfterDiscount);
		this.confirmationEmail(email);
		this.confirmBooking(movieName);
	}

	/*
	 * business requirement :---------------
	 */
	public boolean seatsAvailability(int noOfSeats) {
		System.out.println("MovieTicket.bookTicket() " + noOfSeats);
		return true;
	}

	public double totalAmount(int noOfSeats, float price) {
		return noOfSeats * price;
	}

	/*
	 * 
	 */
	public double applyDiscount(int noOfSeats, double totalAmount) {
		double discount = 0;
		double totalAmountAfterDiscount = totalAmount;
		if (noOfSeats > 5) {
			System.out.println("Discount applied per seat 100 rs.......");
			discount = noOfSeats * 100;
			totalAmountAfterDiscount = totalAmount - discount;

		} else {
			System.out.println("No discount........");
			discount = noOfSeats * 0;
			totalAmountAfterDiscount = totalAmount - discount;
		}
		return totalAmountAfterDiscount;
	}

	public double generateTicketNumber() {
		System.out.println("MovieTicket.generateTicketNumber()");
		return Math.random() * 100;
	}

	/*
	 * processPayment - payment after discount amount
	 */
	public void processPayment(double totalAmountAfterDiscount) {
		System.out.println("MovieTicket.processPayment()" + totalAmountAfterDiscount);
	}

	public void confirmationEmail(String email) {
		System.out.println("MovieTicket.confirmationEmail()");
	}

	public void confirmBooking(String movieName) {
		System.out.println("MovieTicket.confirmBooking()" + movieName);
	}
}
