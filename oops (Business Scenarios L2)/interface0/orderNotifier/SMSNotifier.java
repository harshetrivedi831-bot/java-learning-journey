package interface0.orderNotifier;

public class SMSNotifier implements INotifier {

	@Override
	public void send(String message) {
		// to user says its SMS notification
		System.out.println("SMS:" + message);
		
	}

}
