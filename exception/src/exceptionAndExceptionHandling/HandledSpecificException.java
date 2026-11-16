package exceptionAndExceptionHandling;

public class HandledSpecificException {

	public static void main(String[] args) {

		String name = null;
		int[] numbers = { 10, 20, 30 };
		
		try {
			// risky code -- can run to null pointer exception
			System.out.println(name.length());
			// for 14 -- two catch one is specific and another one is parent
			// java prefers specific ones
		} catch (NullPointerException n) {
			System.out.println("specific Exception ");
			n.printStackTrace();
		} catch (Exception e) {
			System.out.println("parent exception handling");
			e.printStackTrace();
		}
		try {
			// risky code may be that index does not exist so sorround it as well
			System.out.println(numbers[5]);
		} catch (ArrayIndexOutOfBoundsException a) {
			a.printStackTrace();
		}
		try {
			int result = 100 / 0;
		} catch (ArithmeticException a) {
			a.printStackTrace();
		}

		System.out.println("Program execution completed");
	}
}
