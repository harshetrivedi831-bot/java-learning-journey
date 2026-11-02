# interface 

## Daily Notes

> Start using draw.io.
> Spend 10 minutes every day creating diagrams and writing thoughts.
> Helpful for interviews and visualising concepts.

---
>> What is Interface?
Its class blueprint and tells what needs to be done.
benefit to class is -- class knows what to be done.
'I' -- mention this while naming interface to distinguish between class and interface.

>> till 7 -- version of an interface
1. interface consists of abstract methods and constant fields { by default 
methods are public abstract and fields are public final and static even if u dont write}2. interface are 100 percent contract means class who were implementing they signed a contract that they are agree to give method implementation.

Abstract methods -- are the idea/thought 
Concrete methods -- got implementation of idea/thought

```
Extra info : regards method 
method can return primitives and object.
```
>> Problem with interface till 7 
1. its 100 percent contract casue years later if business requiremnt says to add
seatUpgrade functionality then exisiting implememting class will break and not every
class need that functionlaity.

>> To overcome the problem comes with abstract method, interface evolved and brings
backward compatibility through default method in java 8.
1. default method is optional to use, implemting classes can use default implmentation
or can override and give implementation.
2. The problem -- which comes with default method is : code duplicacy 
ex ; two default methods i have one is seatUpgradation() , sendNotifiication() , in 
both i am establishing connection with db so 25 lines of same code is there in both.
so to fix this code duplicay, private methods introduced in java 9 version.

>> to fix this code duplicay, private methods introduced in java 9 version.
private methods holds the implentation -- which is repeatative like db connection.

>> one more method is there is java 8 , static method whose purpose is to pretend like
utility method which belongs to interface, useful for the functionlaity which can be 
duplicated in the code like ticket generation based on argument can be shared among
implemetating classes.




>> static method in an interface :

Static methods often act as helper/utility methods.
Integer.parseInt("123");
parseInt() converts a String to a primitive int. The behaviour remains the same no matter where it is used, and it does not depend on any object's state.

Similarly, static methods in an interface can provide common/helper functionality that is useful to all implementing classes. They belong to the interface itself, cannot be overridden, and are called using the interface name.
example :
interface AccountUtil {

    static double calculateInterest(
            double balance,
            double rate) {
        return balance * rate / 100;
    }

    static void printTicket(Ticket ticket) {
        System.out.println(ticket);
    }
}

>> User can enter current balance and rate of interest manually, therefore the calculation can be a common utility operation similar to Integer.parseInt().

>> before java 9 code duplicay is there which private method removed?
interface Account {

    default void deposit() {
        validate();
        System.out.println("Deposit");
    }

    default void withdraw() {
        validate();
        System.out.println("Withdraw");
    }

    // ❌ Not allowed before Java 9
//  private void validate() {}
}


>>Different implementation      -> Abstract
Same implementation mostly    -> Default
Logic never changes,
only input changes           -> Static
Duplicate code inside
default/static methods       -> Private (Java 9)

>> >>Logic remains same + Only input changes -- static method
Integer.parseInt()
Math.max()
validatePAN()
calculateGST()
calculateDiscount()

>>Abstract method : Logic changes from implementation to implementation
deposit()
withdraw()
pay()
sendNotification()
calculateInterest() // if account types have different rules

>>Default method : Most implementations can use the same logic, but some may customise it

getFreeTransactionLimit()
applyMinimumBalancePenalty()
getSmsCharge()
---

## Interface Learning

### Default Methods

> Default methods can call abstract methods.
> Implementing classes automatically inherit default methods.

### Why Default Methods Were Introduced

> To provide backward compatibility.
> Existing implementations do not break when new methods are added to an interface.

### Access Modifier Rules

> Interface methods are implicitly `public`.

When overriding:

- Child access modifier must be same or wider than parent.
- Since `public` is already the widest access level, overridden interface methods must also be `public`.

### Why Interface Methods Are Public

> An interface defines a contract.
> Any class, regardless of package, should be able to see and implement that contract.
> Restricting access would defeat the purpose of a universally visible contract.

### Interface Variables

> Interface variables are implicitly `public static final`.

Example:

```java
interface Constants {
    int MAX_SIZE = 100;
}