package interface0.bookingService;

public class Driver {
public static void main(String[] args) {
	IBookingService iBookingService=new TrainBookingService();
	System.out.println("-----trainBookingService----");
	Booking result = iBookingService.book();
	System.out.println(result.getBookingId()+" " + result.getBookingStatus());
	iBookingService.seatUpgradation();
	iBookingService.manageWaitingList();
	IBookingService.printTicket();
	System.out.println("GST:" + IBookingService.GST);
}
}
