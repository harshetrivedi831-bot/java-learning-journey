package exceptionAndExceptionHandling;

public class ExceptionFlow {
	public static void main(String[] args) {
		ExceptionFlow driver = new ExceptionFlow();
		driver.calculateLength(null);
		System.out.println("end");
	}

	public void calculateLength(String name) {
		System.out.println("start");
		int amount = 20;
		try {

			try {
				amount = amount / 0;
			} catch (ArithmeticException a) {
				System.out.println("Arithmetic Exception");
				a.printStackTrace();
			}

			System.out.println(name.length());
		} catch (NullPointerException e) {
			System.out.println("Name is null.....");
			/*
			 * stack trace will print the exception line the line on which exception
			 * 
			 */
			e.printStackTrace();
		}

		System.out.println("end-2");
	}
}
