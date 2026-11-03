package functionalInterface.P06_FunctionalInterfaceRules;
/*
* LEARNING: A functional interface can still contain:
*   - default methods
*   - static methods
*   - Object methods such as equals() (they do not count as abstract)
* but ONLY ONE abstract method in total, including those inherited from parent interfaces.
*
* TRY THIS: In TimedLogger, add another abstract method and see the annotation complain.
*/
public class FunctionalInterfaceRules  extends Object{
	@FunctionalInterface
	public interface IPayment {
		void pay();
		default void showQrCode() {
			
		}
		static void validateAdhaar() {
			
		}
		private void dbConnection() {
			
		}
		// object methods does not count as absract casue they are there
		// with every implemetation 
		boolean equals(Object obj);
		public String toString();
		int hashCode();
		 
	}
	public static void main(String[] args) {
		IPayment iPayment=()->{
			System.out.println("toString change");// here i am implemeting pay fucntionality
		};
		System.out.println(iPayment.toString());
	}
	
	
}
