# Requirement 2: Payment Gateway System using Runtime Polymorphism

## Problem Statement

Design a Payment Gateway System that can process transactions using different payment methods. The system should determine the appropriate payment processing behavior at runtime based on the actual object type.

---

## Functional Requirements : (?what system will do)

### 1. Create a Parent Class

Create a class:

```java
Payment
```

The class should contain common transaction-related information such as:

- transactionId
- amount
- paymentStatus

All fields must be declared as `private`.

Use constructors to initialize required data.

Provide getters for read-only access.

Implement a method:

```java
processPayment()
```

which will be overridden by child classes.

---

### 2. Create Child Classes

Create the following child classes:

```java
UPIPayment
```

```java
CCPay
```

Both classes must inherit from:

```java
Payment
```

and override:

```java
processPayment()
```

to provide their own payment processing behavior.

---

### 3. UPI Payment Processing

`UPIPayment` should contain:

```java
upiId
```

Validate the following conditions before processing:

- Amount must be greater than 0.
- UPI Id must contain `@`.

If validation passes:

```text
UPI Payment Successful
```

Otherwise:

```text
UPI Payment Failed
```

---

### 4. Credit Card Payment Processing

`CCPay` should contain:

```java
cardNumber
```

Validate the following conditions before processing:

- Amount must be greater than 0.
- Card number must contain at least 12 digits.

If validation passes:

```text
Credit Card Payment Successful
```

Otherwise:

```text
Credit Card Payment Failed
```

---

### 5. Runtime Polymorphism

Create payment objects using parent references.

Examples:

```java
Payment p1 = new UPIPayment(...);
Payment p2 = new CCPay(...);
```


The following call:

```java
p.processPayment();
```

must execute the correct overridden method at runtime.

---

### 6. Array Implementation

Store all payment objects inside an array.

Example:

```java
Payment[] payments;
```

The array should contain both:

- UPI payments
- Credit card payments

---

### 7. Looping

Use a loop to process all transactions.

Example concepts:

- for loop
- enhanced for loop - avoid

The program must iterate through every payment object and invoke:

```java
processPayment();
```

---

### 8. Conditional Statements

Use:

```java
if
```

```java
if-else
```

for validation and transaction status determination.

---

### 9. Transaction Statistics

While processing transactions maintain:

```java
totalTransactions
successfulTransactions
failedTransactions
totalAmountProcessed
```

Update values dynamically.

Display the final summary after all transactions are processed.

---

## Expected Output

```text
====== Payment Summary ======

Total Transactions : X
Successful Payments : X
Failed Payments     : X
Total Amount        : X

============================
```

---

# Concepts Implemented

## Core Java Fundamentals

- Variables
- Data Types
- Conditional Statements
- if-else
- Loops
- Arrays
- Counters
- Accumulator Pattern (`+=`)
- Constructors
- Method Invocation
- Object Creation

---

## OOP Concepts

- Class and Object
- Encapsulation
- Constructor-based Initialization
- Inheritance
- Method Overriding
- Runtime Polymorphism
- Upcasting
- Dynamic Method Dispatch
- Code Reusability

---

## Logic Building Concepts

- Input Validation
- Success/Failure Handling
- Transaction Processing Workflow
- Collection Processing using Arrays
- Runtime Decision Making
- Report/Summary Generation

---

## Learning Outcome

By implementing this requirement, I practiced:

- Designing parent-child relationships.
- Applying encapsulation to secure data.
- Using inheritance to eliminate duplicate code.
- Understanding runtime polymorphism through parent references.
- Processing heterogeneous objects through a single array.
- Building validation logic using conditional statements.
- Using loops to automate transaction processing.
- Generating aggregate reports using counters and accumulators.
- Connecting Java fundamentals with real-world payment processing scenarios.