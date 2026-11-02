package interface0.bookingService;

public class TrainBookingService implements IBookingService{

	@Override
	public Booking book() {
		Booking booking=new Booking();
		booking.setBookingId("121A");
		booking.setBookingStatus("waiting");
		return booking;
	}
	
	// new functionlity is avilable for the user to use
	@Override
	public void seatUpgradation() {
		// private method : remove code duplicay automcatically called during call
		System.out.println("TrainBookingService.seatUpgradation()");
	}
	@Override
	public void manageWaitingList() {
		System.out.println("TrainBookingService.manageWaitingList()");
	}
	// static method utlitiy method belongs to interface not in implemeting class.
	// print ticket 
	

}
