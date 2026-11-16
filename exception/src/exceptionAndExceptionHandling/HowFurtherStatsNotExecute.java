package exceptionAndExceptionHandling;
/*
 * Your challenges:
1. Predict the exact output before running the program.
2. Does the inner try execute?
3. Will the outer catch handle an exception originating inside the inner try?
4. Why is RuntimeException placed before Exception?
5. Modify the code so that both the null pointer and array index exceptions can be handled in the same execution.
 */
public class HowFurtherStatsNotExecute {
	  public static void main(String[] args) {

	        String employeeName = null;
	        int[] salaries = {25000, 35000, 45000};

	        try {

	            System.out.println("Step 1");

	            System.out.println(employeeName.length());
	            /*
	             * if exception came above further statements will not execute at all
	             */
	            System.out.println("Step 2");

	            try {

	                System.out.println(salaries[5]);

	                int result = 100 / 0;

	            } catch (ArithmeticException e) {

	                System.out.println("Arithmetic exception handled");

	            } catch (ArrayIndexOutOfBoundsException e) {

	                System.out.println("Array exception handled");
	            }

	            System.out.println("Step 3");

	        } catch (NullPointerException e) {

	            System.out.println("Null pointer handled");

	        } catch (RuntimeException e) {

	            System.out.println("Runtime exception handled");

	        } catch (Exception e) {

	            System.out.println("Parent exception handled");
	        }

	        System.out.println("Application completed");
	    }
}


