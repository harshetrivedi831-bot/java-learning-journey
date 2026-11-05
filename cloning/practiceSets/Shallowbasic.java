package practiceSets;
/*
 * only outer object is copied and nested objects are shared.
 */
public class Shallowbasic {
	static class Address{
		String city;
		String pincode;
	}
	static class Customer implements Cloneable {
		String name;
		String address;
		public Customer(String name, String address) {
			super();
			this.name = name;
			this.address = address;
		}
		@Override
			protected Object clone() throws CloneNotSupportedException {
				// TODO Auto-generated method stub
				return super.clone();
			}
	}
public static void main(String[] args) throws CloneNotSupportedException {
	Customer customer=new Customer("harsh", "kabritanRoad");
	Customer clonedCustomerObject = (Customer)customer.clone();
	System.out.println(customer.address+" " + clonedCustomerObject.address);

}}
/*
 * I created one class named Address and Customer 
 * customer is implememted clonable and override clone method 
 * from main i cloned emloyee object and got cloned object 
 * tested both got same state
 */
