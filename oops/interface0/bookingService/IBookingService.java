package interface0.bookingService;

public interface IBookingService {
public abstract Booking book();
public final static float GST=.18f;
/*
 * In booking service : for some class new feature introduced seatUpgradation and 
 * 
 */
public default void seatUpgradation() {
	dbConnection();
	System.out.println("IBookingService.seatUpgradation()");//default implementation
}
public default void manageWaitingList() {
	dbConnection();
	System.out.println("IBookingService.manageWaitingList()");
}
/*seatUpgradation and manageWaitingList , some piece of code or core functionlaity seems
 * to be common like db connection so we keep inside private method
 * 
 */
private void dbConnection() {
	System.out.println("IBookingService.dbConnection()");
}
/*
 * static method which holds those fucntionlaity which can be common for all, so
 * instead of implemting separately which is like duplicate method cant it be shared or
 * kindaa utlity method 
 * they are utlity method belongs to interface
 */
public static void printTicket() {
	System.out.println("IBookingService.printTicket()");
}

}
