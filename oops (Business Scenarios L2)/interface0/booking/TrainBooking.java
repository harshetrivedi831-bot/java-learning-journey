package interface0.booking;

public class TrainBooking implements IBooking{

	@Override
	public Booking book() {
		Booking booking=new Booking();
		booking.setBookingId("1334");
		booking.setBookingStatus(false);
		return booking;
	}

	@Override
	public void cancelBooking() {
		System.out.println("TrainBooking.cancelBooking()");
		
	}

	@Override
	public Booking checkStatus() {
		Booking booking=new Booking();
		booking.setBookingStatus(false);
		return booking;
	}
//	// needs autoUpgrade feature
//	public void autoUpgrade() {// this feature is for trainBooking
//		//this.autoUpgrade();// calling its implementation from interface
//		// as it is concrete so it belongs to class
//		System.out.println("autoupgrade fucntionality");
//		
//	}
	
	
	// here i need to print ticket
	public void printTicket(String path,String content) {
		IBooking.printTicket("", "");
		
	}//35--I am calling static method directly without writing any lines of code
	

}
