package shallowCopy;

public class Driver extends Object{
	
public static void main(String[] args) throws CloneNotSupportedException {
	/*
	 * Consider a address and employee class is there which employee 
	 */
	
	Address address=new Address("AwasViaks", "NAHI pata", "unnao");
	
	Employee employee=new Employee("harsh", "12A",address);
	Employee clonedObject = (Employee) employee.clone();//compile time erro as clone is proteceted.
	// changes the address reference city to kanpur as both object shared same addresss so chages will reflect there as well.
	employee.address.city="kanpur";
	System.out.println(employee.address.city);
	System.out.println(clonedObject.address.city);
	
	
}
}
/*
employee                    clonedObject
|                              |
v                              v
+------------------+      +------------------+
| name="harsh"     |      | name="harsh"     |
| id="12A"         |      | id="12A"         |
| address ---+     |      | address ---+     |
+------------|-----+      +------------|-----+
          |                         |
          +-----------+-------------+
                      |
                      v
               +------------+
               | city=unnao |
               +------------+
*/