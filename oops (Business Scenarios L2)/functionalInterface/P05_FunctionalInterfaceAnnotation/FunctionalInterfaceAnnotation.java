package functionalInterface.P05_FunctionalInterfaceAnnotation;

/*
 * LEARNING: @FunctionalInterface came later. It does not create anything new;
 * it FORCES the compiler to guarantee the interface has exactly one abstract method.
 *
 * TRY THIS: Add a second abstract method to Calculator and read the compiler error.
 */
public class FunctionalInterfaceAnnotation {

    @FunctionalInterface
    interface Calculator {
        int calculate(int a, int b);
        //int calculate(int a, int b,int c);--not allowed
    }

    public static void main(String[] args) {
    	Calculator calculator=(a,b)->{
    		return a+b;
    	};
    	System.out.println(calculator.calculate(1, 2));
    }
}

