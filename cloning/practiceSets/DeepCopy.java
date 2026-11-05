package practiceSets;

public class DeepCopy {
	static class Account implements Cloneable {
		String accountId;

		public Account(String accountId) {
			super();
			this.accountId = accountId;
		}
		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
		
	}
	static class SavingAccount implements Cloneable{
		String savingAccountId;
		Account account;
		public SavingAccount(String savingAccountId, Account account) {
			super();
			this.savingAccountId = savingAccountId;
			this.account = account;
		}
		@Override
		protected Object clone() throws CloneNotSupportedException {
			
			// TODO Auto-generated method stub
			SavingAccount savingAccount=(SavingAccount)super.clone();
			//savingAccount.account =(Account)account.clone();
			return savingAccount;// on calling clone() from saving account saving account got the deep copy behviour 
		}
		
		
	}
public static void main(String[] args) throws CloneNotSupportedException {
	Account account=new Account("122A");
	SavingAccount savingAccount=new SavingAccount("122A", account);
	
	SavingAccount copiedSavingAccountObject = (SavingAccount)savingAccount.clone();
	Account copiedAccountObject = (Account) account.clone();
	copiedSavingAccountObject.account.accountId="124A";
	System.out.println(copiedAccountObject.accountId);//122A
	System.out.println(copiedSavingAccountObject.account.accountId);//124A
	
}

}
