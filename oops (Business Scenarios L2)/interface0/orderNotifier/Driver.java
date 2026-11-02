package interface0.orderNotifier;

public class Driver {
public static void main(String[] args) {
	/*
	 * SMSNotifier smsNotifier=new SMSNotifier();
	EmailNotification emailNotification=new EmailNotification();
	smsNotifier.sendOrderPlaced("121A");
	emailNotification.sendOrderPlaced("123B");
	 */
	// run time polymorphism through interface 
	// compiler and interpreter play role here!!
	INotifier iNotifier=new SMSNotifier();
	INotifier iNotifier2=new EmailNotification();
	iNotifier.sendOrderPlaced("121C");
	iNotifier2.sendOrderPlaced("123D");
}
}
