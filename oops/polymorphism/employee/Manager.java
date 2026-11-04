package polymorphism.employee;

public class Manager extends Employee {
	@Override
	void printPerformace() {
		System.out.println("Manager.printPerformace()-Manager");
	}
}
