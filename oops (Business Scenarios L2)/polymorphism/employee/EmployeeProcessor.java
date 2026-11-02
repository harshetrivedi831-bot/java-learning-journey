package polymorphism.employee;

public class EmployeeProcessor {
void employeeProcessor(Employee e) {
	e=new Manager();
	e=new Developer();
	e.printPerformace();//polyMorphism happening.
}
}
