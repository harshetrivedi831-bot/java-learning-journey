package exceptionAndExceptionHandling;

public class NumberFormat  {
	public static void main(String[] args) {
		//NumberFormatException driver2 = new NumberFormatException();

		try {
			int marks = Integer.parseInt("harsh");
		} catch (NumberFormatException e) {
			System.out.println("number format exception");
			//e.printStackTrace();
			System.out.println(e.getStackTrace());

		}
	}

//	public void accessInvalidIndex(int marks) {
//		System.out.println(marks);
//	}

}
