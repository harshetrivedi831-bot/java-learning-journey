package paymentSystem;

import java.io.Serializable;

/*
 * represent real entity 
 * rule no 1 : payment object must be serilaised
 * rule no 2 : pin should be skipped
 * rule no 3 : Use explicit versioning else jvm automatically adds.
 */
public class Payment implements Serializable{
	private static final long serialVersionUID = 2L;
	String paymentId;
	String customerName;
	double amount;
	transient String creditCardPin;

	public Payment(String paymentId, String customerName, double amount, String creditCardPin) {
		super();
		this.paymentId = paymentId;
		this.customerName = customerName;
		this.amount = amount;
		this.creditCardPin = creditCardPin;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCreditCardPin() {
		return creditCardPin;
	}

	public void setCreditCardPin(String creditCardPin) {
		this.creditCardPin = creditCardPin;
	}

}
