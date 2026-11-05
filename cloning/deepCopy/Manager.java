package deepCopy;

public class Manager implements Cloneable {//cause i will be doing cloning on manager object so manager should have clone
String managerId;
String managerName;
Employee employee;
public Manager(String managerId, String managerName, Employee employee) {
	super();
	this.managerId = managerId;
	this.managerName = managerName;
	this.employee = employee;
}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// sahllow copy
		Manager copiedObj = (Manager) super.clone();
		// deep copy
		copiedObj.employee=(Employee)employee.clone();
		return copiedObj;//return newly created nested object
		
		
	}

}
