# Requirement: Movie Ticket Booking System

## Create a Class

```java
MovieTicket
```

---

# Encapsulation Requirement

## Store the Following Details as Fields

1. `movieName`
2. `ticketPrice`
3. `numberOfSeats`
4. `customerEmail`

### Conditions

- These fields should **not be directly accessible** from outside the class.
- Think about why data should be protected.
- Use appropriate access modifiers.

---

# Abstraction Requirement

The user should only be able to perform:

```java
bookTicket()
```

When `bookTicket()` is called, the system should internally perform the following steps:

1. Validate seat availability.
2. Calculate total amount.
3. Apply discount if booked seats > 5.
4. Generate ticket number.
5. Process payment.
6. Send confirmation email.
7. Confirm booking.

---

# Expected Output

```text
Seats Available
Bill Calculated
Discount Applied
Payment Successful
Ticket Number Generated
Confirmation Email Sent
Ticket Booked Successfully
```

---

# Abstraction Condition

## User Should Know Only

```java
bookTicket()
```

## User Should NOT Know How These Methods Work Internally

```java
validateSeatAvailability()
calculateBill()
applyDiscount()
generateTicketNumber()
processPayment()
sendConfirmationEmail()
```

These methods are internal implementation details and should be hidden from the user.

---

# Encapsulation Condition

External classes should **not directly access**:

```java
movieName
ticketPrice
numberOfSeats
customerEmail
```

### Think About It

What can go wrong if `ticketPrice` or `numberOfSeats` become public?

Examples:

- Someone may change the ticket price to a negative value.
- Someone may set seat count to `0` or `-10`.
- Movie information may become inconsistent.
- Customer email may be modified without validation.

Encapsulation protects the object's data from invalid updates.

---

# Questions To Answer in Comments

```java
1. Where is abstraction implemented?

2. Where is encapsulation implemented?

3. Why are fields private?

4. What problem does encapsulation solve?

5. If tomorrow cashback is introduced,
   will client code change? Why?

6. What is WHAT and HOW in this requirement?
```

---

# Learning Goal

### FoodOrder

✅ Mostly Abstraction

- Customer only calls:

```java
placeOrder()
```

- Internal workflow remains hidden.

---

### MovieTicket

✅ Abstraction + Encapsulation

- Abstraction hides the booking process.
- Encapsulation protects booking data.

---

# New Concepts You'll Discover

- Data Protection
- Public vs Private Fields
- Implementation Hiding
- Business Rule Changes
- Client Code Dependency

---

# Quick Understanding

### WHAT (Visible to User)

```java
bookTicket()
```

### HOW (Hidden Implementation)

```java
validateSeatAvailability()
calculateBill()
applyDiscount()
generateTicketNumber()
processPayment()
sendConfirmationEmail()
```

### Encapsulated Data

```java
private String movieName;
private double ticketPrice;
private int numberOfSeats;
private String customerEmail;
```

This requirement demonstrates both:

✅ **Abstraction** → Hide implementation details  
✅ **Encapsulation** → Protect data from direct access