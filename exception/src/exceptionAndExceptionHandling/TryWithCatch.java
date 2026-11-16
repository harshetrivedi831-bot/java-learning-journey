package exceptionAndExceptionHandling;

public class TryWithCatch {

	public static void main(String[] args) {

		String data = null;

		try {
			System.out.println(data.toLowerCase());

		} catch (NullPointerException e) {
			System.out.println("Outer null pointer exception");
		}
		try {
			int result = 50 / 0;

		} catch (ArithmeticException e) {
			System.out.println("Outer arithmetic exception");
		}

		System.out.println("Main completed");

	}
}
