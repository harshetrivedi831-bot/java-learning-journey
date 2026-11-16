package exceptionAndExceptionHandling;

public class NoStatementsInBetween {
	public static void main(String[] args) {
		NoStatementsInBetween.noStatementsInBetween();
	}

	public static void noStatementsInBetween() {
		String name = "harsh";
		int number = 12;
		try {
			name.length();

			number = number / 0;

		}
		// System.out.println("------------");
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("handled");
	}
	
}
