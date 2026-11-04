package functionalInterface.classWork;

public class Driver {
public static void main(String[] args) {
	//lets give impl to f.i
	IAccount account=(name,address,balance)->{//specify paramter
		System.out.println("account openeing......." + balance);
		return "";
	};//how ->{}; functionality implemented let st call
	account.openAccount("hash","kabrsitan",2000);
	
	IAccountManagement iAccountManagement=(name)->{
		System.out.println("dear friends!! " + name);
	};
	iAccountManagement.accountDetails("jai hind");

	
}
}
