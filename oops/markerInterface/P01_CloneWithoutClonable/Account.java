package markerInterface.P01_CloneWithoutClonable;

public class Account implements Cloneable {
	String name;
	String accountNumber;
	double balance;

	public Account(String name, String accountNumber, double balance) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		System.out.println();
		// TODO Auto-generated method stub
		return "Account[name="+name+",accountNumber="+accountNumber+",balance="+balance+"]";
		/*
		 * first string with class name -- "Account[name="
		 * second string with append value -- ",accountNumber="
		 * ",balance="
		 * fourth string : Fourth String: + "]"
		 */
	}
	

}
