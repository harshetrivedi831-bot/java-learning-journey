package exceptionAndExceptionHandling;

public class MethodCallChainingException {
	 public static void main(String[] args) {

		 MethodCallChainingException driver = new MethodCallChainingException();

	        try {
	        	// driver can hold null so risky
	            driver.methodA();
	            /*
	             * from try call goes to method A then method B then 
	             * C so their exception object will also be handled here.
	             */
	  
	        } catch (NullPointerException e) {
	            System.out.println("Exception handled in main");
	        }

	        System.out.println("Main completed");
	    }

	    public void methodA() {

	        System.out.println("Inside method A");

	        methodB();
	    }

	    public void methodB() {

	        System.out.println("Inside method B");

	        methodC();
	    }

	    public void methodC() {

	        String name = null;
	        System.out.println(name.length());
	        // methodC belongs to method A only so it will be handled by its 
	        // catch block only

	    }
}
