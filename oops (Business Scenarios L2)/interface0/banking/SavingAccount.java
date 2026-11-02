package interface0.banking;

public class SavingAccount implements IBankAccount{

	double currentBalance;
	double rateOfInterest;
	
	public SavingAccount(double currentBalance,double rateOfInterest) {
		super();
		this.currentBalance = currentBalance;
		this.rateOfInterest=rateOfInterest;
	}

	@Override
	public Deposit deposit(double amount) {
		currentBalance = amount + currentBalance;
		// user should be able to see deposited money 
		// so store in object and send.
		Deposit deposit=new Deposit();
		deposit.setCurrentBalance(currentBalance);
		deposit.setDepositAmount(amount);
		return deposit;
	}

	@Override
	public void withdraw(double amount) {
		// while withdraw check amount cause 1000 rs should be there.
		if(amount>=MINUMUM_BALANCE) {
			currentBalance=currentBalance-amount;
			System.out.println(currentBalance+" is the currentBalance after withdraw :" 
					+ amount);
		}
		else
		{
			System.out.println("InSufficient Funds");
		}
		
		
	}

	@Override
	public void checkBalance() {
		System.out.println("currentBalance : " + currentBalance);
		
	}
/*
 * interestClaculation is static in an interface
 */
//	@Override
//	public double interestCalcualtion() {
//		return currentBalance*rateOfInterest/100;
//		
//	}

}
