# Requirement: Online Banking System

## Create a Parent Class

```java
BankAccount
```

---

# Encapsulation Requirement

## Store the Following Details

```java
accountNumber
accountHolderName
balance
```

### Conditions

These fields should not be directly accessible from outside the class.

### Validations

1. Balance should never be negative.
2. Account number should not be null.
3. Account holder name should not be empty.

### Suggested Access Modifier

```java
private String accountNumber;
private String accountHolderName;
private double balance;
```

This ensures data protection and controlled access through methods.

---

# Inheritance Requirement

## Create Two Child Classes

```java
SavingAccount
CurrentAccount
```

### SavingAccount

- Interest feature available.

### CurrentAccount

- Overdraft feature available.

### Inheritance Structure

```text
                BankAccount
                     |
        -------------------------
        |                       |
 SavingAccount          CurrentAccount
```

### Rule

Both child classes must inherit common properties from:

```java
BankAccount
```

Do not duplicate fields such as:

```java
accountNumber
accountHolderName
balance
```

These should be written once in the parent class.

---

# Abstraction Requirement

The client should only perform:

```java
openAccount()
deposit()
withdraw()
```

---

## Internal Process of openAccount()

When `openAccount()` is called, the system should internally:

1. Verify customer details.
2. Validate PAN.
3. Generate account number.
4. Activate account.
5. Send welcome email.

---

## Internal Process of withdraw()

When `withdraw()` is called, the system should internally:

1. Check balance.
2. Validate transaction limit.
3. Deduct amount.
4. Record transaction.
5. Send notification.

The client should not know how these steps are executed.

---

# Expected Output

```text
Customer Verified
PAN Verified
Account Number Generated
Account Activated
Welcome Email Sent

Amount Deposited Successfully

Balance Checked
Transaction Recorded
Notification Sent
Withdrawal Successful
```

---

# Abstraction Condition

## Client Should Know Only

```java
openAccount()
deposit()
withdraw()
```

## Client Should NOT Know

```java
verifyCustomer()
validatePAN()
generateAccountNumber()
activateAccount()
recordTransaction()
sendNotification()
```

These methods represent internal implementation details.

---

# Inheritance Condition

```java
SavingAccount
CurrentAccount
```

must inherit from:

```java
BankAccount
```

Common details should be written only once inside the parent class.

---

# Challenge Questions

### 1. Which fields demonstrate encapsulation?

```java
accountNumber
accountHolderName
balance
```

These fields are encapsulated because they are hidden using the `private` access modifier.

---

### 2. Why are they private?

To prevent direct modification from outside the class and enforce business validations.

Example:

```java
account.balance = -50000;   // Invalid
```

Encapsulation prevents such situations.

---

### 3. Which class is the parent?

```java
BankAccount
```

---

### 4. Which classes are the children?

```java
SavingAccount
CurrentAccount
```

---

### 5. What code duplication did inheritance remove?

Without inheritance, both child classes would separately contain:

```java
accountNumber
accountHolderName
balance
deposit()
withdraw()
```

Inheritance allows these common members to be written once in `BankAccount`.

---

### 6. Where is abstraction implemented?

Abstraction is implemented through the public methods:

```java
openAccount()
deposit()
withdraw()
```

The client uses these methods without knowing the internal workflow.

---

### 7. If tomorrow SMS notification is added, will client code change?

**No.**

Client code still calls:

```java
withdraw();
```

Only the internal implementation changes.

Example:

```java
withdraw()
{
    checkBalance();
    recordTransaction();
    sendNotification();
    sendSMS();
}
```

The client remains unaffected.

---

### 8. If tomorrow all accounts require Aadhaar validation, in which class should that logic be added?

```java
BankAccount
```

Since Aadhaar validation applies to all account types, it should be added to the common account-opening process in the parent class.

---

# Learning Goal

## FoodOrder

✅ Abstraction

```java
placeOrder()
```

User sees only the operation.

---

## MovieTicket

✅ Abstraction + Encapsulation

```java
bookTicket()
```

Data is protected and implementation is hidden.

---

## Online Banking System

✅ Encapsulation + Inheritance + Abstraction

### Encapsulation

```java
private String accountNumber;
private String accountHolderName;
private double balance;
```

Protects data.

---

### Inheritance

```java
SavingAccount extends BankAccount
CurrentAccount extends BankAccount
```

Reuses common functionality.

---

### Abstraction

```java
openAccount()
deposit()
withdraw()
```

Hides implementation details from the client.

---

# Quick Understanding

## WHAT (Visible to Client)

```java
openAccount()
deposit()
withdraw()
```

---

## HOW (Hidden Internally)

```java
verifyCustomer()
validatePAN()
generateAccountNumber()
activateAccount()
checkBalance()
recordTransaction()
sendNotification()
```

---

## Encapsulated Data

```java
private String accountNumber;
private String accountHolderName;
private double balance;
```

---

## Inheritance Hierarchy

```text
BankAccount
    |
    |---- SavingAccount
    |
    |---- CurrentAccount
```

This requirement demonstrates all three major OOP concepts:

✅ **Encapsulation** → Protect Data  
✅ **Inheritance** → Reuse Common Code  
✅ **Abstraction** → Hide Internal Implementation