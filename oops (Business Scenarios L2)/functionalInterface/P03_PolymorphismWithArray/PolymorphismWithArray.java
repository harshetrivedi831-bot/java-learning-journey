package functionalInterface.P03_PolymorphismWithArray;

/*
 * LEARNING: One parent-type array can hold many different child objects.
 * A single loop then works for all of them (arrays + loops + polymorphism).
 *
 * TRY THIS: Add a fourth document type and see that the loop needs no change.
 */
public class PolymorphismWithArray {
@FunctionalInterface
    interface ICompanyDocument {
        void print();
    }

//    static class Contract implements ICompanyDocument {
//        public void print() {
//            System.out.println("Contract printed");
//        }
//       
//    }
//
//    static class Invoice implements ICompanyDocument {
//        public void print() {
//            System.out.println("Invoice printed");
//        }
//    }
//
//    static class Report implements ICompanyDocument {
//        public void print() {
//            System.out.println("Report printed");
//        }
//    }
//    static class EmployeeRecords implements ICompanyDocument{
//
//		@Override
//		public void print() {
//			System.out.println("Records Printed");
//			
//		}
//    	
//    }

    public static void main(String[] args) {
    	ICompanyDocument contract = ()->{
    		System.out.println("contract printed");
    	};
    	ICompanyDocument invoice = ()->{
    		System.out.println("invoice printed");
    	};
    	ICompanyDocument report = ()->{
    		System.out.println("report printed");
    	};
    	ICompanyDocument record = ()->{
    		System.out.println("record printed");
    	};
    	 ICompanyDocument[] documents = {contract,invoice,report,record};
//       ICompanyDocument[] documents = {new Contract(),new Invoice(),new Report(),new EmployeeRecords()};
       for (int index = 0; index < documents.length; index++) {
		documents[index].print();//polymorphism
	}
    }
}
