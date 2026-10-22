package com.harsh.oops.methodOverloading1;

public class Payment
{
	/*
	 * i think data should be encapsulated such that other class will no longer 
	 * be able to change upiId or other data directly.
	 * 
	 */
	private long debitCardNumber;
	private String upiId;
	private String walletName;
	private double amount;
	/*
	 * I would not provide setters, i will initialize and validate within constructor
	 */
	 public Payment(long debitCardNumber, String upiId, String walletName, double amount) {
			super();
			this.debitCardNumber = debitCardNumber;
			this.upiId = upiId;
			this.walletName = walletName;
			/*
			 * validation for amount 
			 */
			if(amount<0) {
				return;
			}
			this.amount = amount;
		}
	/*
	 * I need to have getters to read objects data and required during method call.
	 */
	 public long getDebitCardNumber() {
			return debitCardNumber;
		}

		public String getUpiId() {
			return upiId;
		}

		public String getWalletName() {
			return walletName;
		}

		public double getAmount() {
			return amount;
		}
	 
	/*
	 * this is method Overloading wherein there are multiple versions of same method
	 * exist which increase readability and maintainability the difference will there
	 * in parameter list which will be checked by compiler like identical input 
	 * combination is not allowed.
	 */
    public void processPayment(long debitCardNumber)
    {
    	System.out.println("Payment.processPayment() using debitCardNumber");
    	System.out.println(this.debitCardNumber);
    }

	public void processPayment(String upiId)
    {
    	System.out.println("Payment.processPayment() using upiId" );
    	System.out.println(this.upiId);
    }

    public void processPayment(String walletName, double amount)
    {
    	System.out.println("Payment.processPayment() using walletName and amount");
    	System.out.println(this.walletName + " " + this.amount);
    }
}
