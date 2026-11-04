package interface0.orderNotifier;

public interface INotifier {
void send(String message);
default void sendOrderPlaced(String orderId) {
	System.out.println("Your order " + orderId + " is placed");
	send("placed successfully");
}
}
