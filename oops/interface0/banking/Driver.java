package interface0.banking;

public class Driver {
public static void main(String[] args) {
	// saving account user came and want to perform some actions
	IBankAccount iBankAccount=new SavingAccount(5000,3.5);//5k this user has
	System.out.println("======ACCOUNT SUMMARY=====");
	iBankAccount.checkBalance();
	System.out.println("-------deposit------");
	Deposit deposit = iBankAccount.deposit(3000);
	System.out.println("depositAmount :"  +deposit.getDepositAmount());
	System.out.println("----withdraw----");
	iBankAccount.withdraw(6000);
	System.out.println("-----interest calcualtion");
	/*
	 * User can enter current balance and rate of interest manually,
	 *  therefore the calculation can be a common utility operation similar to Integer.parseInt().
	 */
	// interest calcualtion
	double inerestCal= IBankAccount.interestCalcualation(10000, 3.5);
	System.out.println(inerestCal);
	
	
	
}
}
