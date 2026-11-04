package interface0.orderNotifier;

public class EmailNotification implements INotifier {

	@Override
	public void send(String message) {
		System.out.println("Email: " + message);
		
	}

}
