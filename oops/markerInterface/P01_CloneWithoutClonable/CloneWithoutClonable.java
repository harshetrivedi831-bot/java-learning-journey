package markerInterface.P01_CloneWithoutClonable;

public class CloneWithoutClonable {
	public static void main(String[] args) throws CloneNotSupportedException {
		Account account = new Account("harsh", "73645675463", 50000);
		
		
		/*
		 * did not grant permission so cloning on account obj is crashing
		 * its a criritcal activity so grant permission using clonable
		 * its amrker interface which will give infor to jvm to allow cloning
		 */
		if(account instanceof Cloneable ) {
			Account clonedObject = (Account)account.clone();
			System.out.println("clonedObject: " + clonedObject.toString());
		}
	}
}
