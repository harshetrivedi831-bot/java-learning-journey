package interface0.booking;

public interface IBooking {
	public abstract Booking book();//Booking class -- fields and set retun.
	public abstract void cancelBooking();
	public abstract Booking checkStatus();
	//SearchResult search();
	
	// java 8 introduced optional method : default method 
	// interface will not force to implement
	// default method only allowed in interface when using in class remove default
	public default void autoUpgrade() {// this feature is for trainBooking
		// db connection
		connectToDb();
		System.out.println("IBooking.autoUpgrade()");
	}// not for all
	public static void printTicket(String path,String content) {
		System.out.println("IBooking.printTicket()");
	}// print ticket can be common for some implementing classes so instead of writing
	// 100 of lines of code when not utlise from interface cause it belong to interface.
	/*
	 * default method brings code duplicacy line db connenction in autoUpgrade() and
	 * sendNotification() so private method introduced in java9
	 */
	private void connectToDb() {
		System.out.println("IBooking.connectToDb()");
	}
}
