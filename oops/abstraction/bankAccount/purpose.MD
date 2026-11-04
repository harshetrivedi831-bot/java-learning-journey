# Requirement: Online Banking System


## Create a Parent Class

```java
BankAccount
```

---


# Inheritance Requirement

## Create Two Child Classes

```java
SavingAccount
CurrentAccount
```

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

