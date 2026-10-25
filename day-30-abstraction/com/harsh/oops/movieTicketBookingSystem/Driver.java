package com.harsh.oops.movieTicketBookingSystem;

public class Driver {
	public static void main(String[] args) {
		MovieTicket movieTicket = new MovieTicket("Apne", 600, 3, "harsh@gmail.com");
		movieTicket.bookTicket(movieTicket.getMovieName(), movieTicket.getPrice(), movieTicket.getNoOfSeats(),
				movieTicket.getEmail());
	}
}
