package exceptionAndExceptionHandling;

public class SearchSpecificTypeError {
	public static void main(String[] args) {
		//cmpilation error line no 21
		SearchSpecificTypeError.searchSpecificType();
	}
	public static void searchSpecificType() {
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
		catch(ArithmeticException n) {
			n.printStackTrace();
		}
		System.out.println("handled");
	}
}
