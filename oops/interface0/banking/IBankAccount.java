package interface0.banking;

public interface IBankAccount {
	/*
	 * among account type minimum balance needed to be maintained as well
	 */
	float MINUMUM_BALANCE = 1000f;
	Deposit deposit(double amount);
	void withdraw(double amount);
	void checkBalance();
	// years later interestCalculation() featured introduced which is common for all.
	//double interestCalcualtion();//needs curentAmount and rateOfInerest which is 
	// available so dont need to pass again
	static double interestCalcualation(double currentBalance,double rateOfInterest) {
		// logic will not change that why i keep static.
		return currentBalance*rateOfInterest/100;
	}
	
	private void validate() {
		// possible repeatation if i convert abstract methods
		// using default
		System.out.println("IBankAccount.validate()");
	}
/*
 * transaction limit feature vary account to acocunt / internal logic 
 */
}
