package paymentSystem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Driver {
public static void main(String[] args) throws IOException {
	// payment object serialise to payment.ser
	// once seriaised done :Assume object is gone from memory.(heap)
	Payment payment=new Payment("p12", "harsh", 89000.89, "1234");
	FileOutputStream fileOutputStream=new FileOutputStream("payment.ser");
	ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
	objectOutputStream.writeObject(payment);//serialised
	fileOutputStream.close();
}
}
