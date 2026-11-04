# Custom Marker Interface Flow
Step 1: Create a Custom Marker Interface
Step 2: Let Eligible Classes Implement the Marker Interface
Step 3: Perform Runtime Permission Check Using `instanceof`
Step 4: Test the Behaviour Using a Driver Class
--------------------------------------------------------
## Step 1: Create a Custom Marker Interface

A marker interface is an empty interface used only to provide permission or identification to a class.

```java
package dataUpgradation;

public interface DataUpgradation {
}
```

Purpose:
- Acts as a permission tag.
- Does not contain any methods.
- Similar to Java's `Serializable` and `Cloneable`.

---

## Step 2: Let Eligible Classes Implement the Marker Interface

Any class that is allowed to participate in data upgradation implements the marker interface.

```java
package dataUpgradation;

public class Employee implements DataUpgradation {

    String name;
    String employeeID;

    public Employee(String name, String employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }
}
```

Purpose:
- Marks `Employee` as eligible for data upgradation.
- Grants permission for the operation.

---

## Step 3: Perform Runtime Permission Check Using `instanceof`

Before performing the critical operation, verify whether the object has the required permission.

```java
package dataUpgradation;

public class Upgradation {

    public void upgrade(Object obj) {

        if (obj instanceof DataUpgradation) {

            System.out.println("Upgrade the object");

            // Actual data cleanup/upgradation logic
            // can be written here

        } else {

            System.out.println("Upgradation is not allowed");
        }
    }
}
```

Purpose:
- Runtime validation.
- Checks whether the object implements the marker interface.
- Allows only authorised objects to proceed.

---

## Step 4: Test the Behaviour Using a Driver Class

Create an object and pass it for upgradation.

```java
package dataUpgradation;

public class Driver {

    public static void main(String[] args) {

        Employee employee = new Employee("Harsh", "101A");

        Upgradation upgradation = new Upgradation();

        upgradation.upgrade(employee);
    }
}
```

Output:

```text
Upgrade the object
```

---

# Interview Summary

> I created a custom marker interface called `DataUpgradation`. Classes that are authorised for data cleanup or upgradation implement this interface. Before performing the operation, I use `instanceof` to perform a runtime check. If the object implements the marker interface, the operation is allowed; otherwise, it is rejected. This follows the same concept as Java marker interfaces such as `Serializable` and `Cloneable`.