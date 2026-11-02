package polymorphism.employee;

public class Driver {
	public static void main(String[] args) {
		EmployeeProcessor emp = new EmployeeProcessor();
// generic
		emp.employeeProcessor(new Employee());
// runtime decision
		emp.employeeProcessor(new Manager());
		emp.employeeProcessor(new Developer());
		/*
		 * new role : changes to be done on ui
		 */
		
	}
}
