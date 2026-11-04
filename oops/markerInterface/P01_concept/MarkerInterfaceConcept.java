package markerInterface.P01_concept;

// its an interface which has nothing and when we implement so it tags the 
//class so at runtime jvm sees the class got the permission to become
//clonable if implememts clonable interface else it will throw an exception
public class MarkerInterfaceConcept {
	
	static class Payment{
		String payment="Rs";
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Payment";
		}
	}
	@FunctionalInterface
	public interface Account{
//		Account pay();//we are returning a class not allowed
		Payment pay();
	}
//	class SavingAccount implements Account{
//
//		@Override
//		public void pay() {
//			System.out.println();
//			
//		}
//		
//	}or use lambda expression to give implementation to a fucntional interface
	
	public static void main(String[] args) {
		
		Account account = ()->{
			System.out.println("MarkerInterfaceConcept.main()");
			return new Payment();
		};
		Payment payment = account.pay();//caller
		System.out.println("payment:"+payment.toString());//now iwant to see its content
	}
	
	
}
