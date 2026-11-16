package exceptionAndExceptionHandling;

public class StackOverFlowError {
	public static void main(String[] args) {
		try {
			/*
			 * Risk-ii code can call to main infinite times and lead to error,method call goes
			 * to stack frame and if we keep calling it will lead to stackOverflow error
			 */
			main(args);
		} 
		catch (NumberFormatException | NullPointerException e) 
        {
            System.out.println(1);
        }catch (Error e) {
			System.out.println(2);
		}//handled by Error class

	}

}
