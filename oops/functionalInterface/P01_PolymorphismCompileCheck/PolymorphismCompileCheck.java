package functionalInterface.P01_PolymorphismCompileCheck;

/*
 * LEARNING: With polymorphism, the REFERENCE TYPE decides what you can call at compile time.
 * The OBJECT TYPE decides which version runs at runtime.
 * Always ask first: "Is this method present in the parent/interface?"
 *
 * TRY THIS: Uncomment doc.sign() and read the compiler error.
 */
public class PolymorphismCompileCheck {

    interface ICompanyDocument {
        void print();
    }

     static class Contract implements ICompanyDocument {
        public void print() {
            System.out.println("Printing contract");
        }

        public void sign() {
            System.out.println("Signing contract");
        }
    }

    public static void main(String[] args) {
        ICompanyDocument doc = new Contract(); // valid -> polymorphism

        doc.print();      // OK: print() exists in the interface
        // doc.sign();    // COMPILE ERROR: sign() is not in ICompanyDocument

     // Fix: cast to the child type so the compiler can see sign()

        Contract doc1 = (Contract)doc;
        doc1.sign();
    }
}
