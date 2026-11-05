package deepCopy;

public class Employee implements Cloneable{
String employeeID;
String empName;
public Employee(String employeeID, String empName) {
	super();
	this.employeeID = employeeID;
	this.empName = empName;
}
@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
