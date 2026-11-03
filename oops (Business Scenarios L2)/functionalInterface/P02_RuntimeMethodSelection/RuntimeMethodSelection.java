package functionalInterface.P02_RuntimeMethodSelection;

/*
 * LEARNING: Overridden METHODS are chosen by the object at runtime.
 * FIELDS are NOT polymorphic; they are chosen by the reference type.
 *
 * TRY THIS: Add a third child class and print its field and method through a Payment reference.
 */
public class RuntimeMethodSelection {

    static class Payment {
        String type = "Generic";

        void pay() {
            System.out.println("Paying with a generic payment");
        }
    }

    static class CardPayment extends Payment {
        String type = "Card";

        @Override
        void pay() {
            System.out.println("Paying with a card");
        }
    }
    static class UPIPayment extends Payment{
    	String type = "UPI";
    	@Override
	    void pay() {
	    System.out.println("pay with a upi");	
	    }
    }
    public static void main(String[] args) {
        Payment p = new CardPayment();
        System.out.println(p.type);//generic field does not follow polym.
        CardPayment cardPayment = (CardPayment)p;
        System.out.println(cardPayment.type);//child attribute
        Payment p1 = new UPIPayment();
        // cast to UPIPayment
        UPIPayment upiPayment = (UPIPayment)p1;
        System.out.println(upiPayment.type);//child attribute
        //upiPayment.pay();
        
        
       
    }
}
