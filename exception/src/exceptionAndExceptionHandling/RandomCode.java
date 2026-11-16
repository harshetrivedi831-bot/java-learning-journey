package exceptionAndExceptionHandling;

public class RandomCode {
	public static void main(String[] args) {
		/*
		 * // "harsh" can not be converted to int so sorround int value =
		 * Integer.parseInt("Harsh"); System.out.println(value);//number format
		 * exception
		 */
		try {
			int value = Integer.parseInt("Harsh");
		} catch (NumberFormatException e) {
			System.out.println();
			e.printStackTrace();
		}

	}
}
