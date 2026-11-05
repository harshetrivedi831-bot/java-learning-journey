package deepCopy;

public class Driver {

    public static void main(String[] args)
            throws CloneNotSupportedException {

        Employee employee =
                new Employee(
                        "AwasVikas",
                        "NAHI pata");


        Manager manager =
                new Manager(
                        "M101",
                        "Rahul",
                        employee);

        Manager copiedManager =
                (Manager) manager.clone();

        System.out.println("Before Change");

        System.out.println(manager.employee.employeeID);
        System.out.println(copiedManager.employee.employeeID);

        // Change nested object
        manager.employee.employeeID = "Changed Employee";

        System.out.println();
        System.out.println("After Change");

        System.out.println(manager.employee.employeeID);
        System.out.println(copiedManager.employee.employeeID);
    }
}
