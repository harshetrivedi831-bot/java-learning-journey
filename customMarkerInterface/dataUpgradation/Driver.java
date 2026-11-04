package dataUpgradation;

public class Driver {
public static void main(String[] args) {
	Employee employee=new Employee("harsh", "101A");
	Upgradation dataUpgradation=new Upgradation();
	dataUpgradation.upgrade(employee);//not allowed without permission
}
}
/*is it possible to create custom exception?
 * yes it is possible steps i will take :
 * Step 1 : create empty interface let say dataUpgrdation
 * Step 2 : class which implement dataupgardation fucntionality
 * and use instance of to check the object(let say the object 
 * is employee so employee has got the behvaiour of 
 * upgradation ? only after allow upgradation.
 * Step 3 : make suure object will be there  implements upgadation 
 * Stp 4 : test the class , we need object ( need tobe upgraded and a fnctionlity.
 * - You are implementing a runtime permission check using instanceof.
 * 
 */
I created a custom marker interface and using instanceof
such that at runtime it will check the obj got the permission
to do datacleanup or not 