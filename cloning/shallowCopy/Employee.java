package shallowCopy;

public class Employee implements Cloneable{
String name;
String empID;
Address address;
public Employee(String name, String empID, Address address) {
	super();
	this.name = name;
	this.empID = empID;
	this.address = address;
}
/*
 * increase the visibility
 */
@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
