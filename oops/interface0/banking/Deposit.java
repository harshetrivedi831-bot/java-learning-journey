package interface0.banking;

public class Deposit {
private double currentBalance;
private double depositAmount;
public double getCurrentBalance() {
	return currentBalance;
}
public void setCurrentBalance(double currentBalance) {
	this.currentBalance = currentBalance;
}
public double getDepositAmount() {
	return depositAmount;
}
public void setDepositAmount(double depositAmount) {
	this.depositAmount = depositAmount;
}

}
