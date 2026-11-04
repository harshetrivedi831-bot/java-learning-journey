package functionalInterface.classWork;
@FunctionalInterface
public interface IAccount {//extends IAccountManagement{ //compile error
	//void openAccount();//single abstrat method or sam
	String openAccount(String name,String address,int balance);//single abstrat method or sam
	default void assBeneficiary() {
		
	}
	static void calculateInterest(double amount,double rateOfInterest) {
		
	}
	private void dbConnection() {//set jre version 9 
		
	}
	
	 
	

}
