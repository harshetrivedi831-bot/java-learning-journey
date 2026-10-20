# Requirement: Food Ordering System

## Objective
Create a `FoodOrder` class.

The customer should only be able to place an order using:

```java
placeOrder()
```

## Internal Process

When `placeOrder()` is called, the system should internally perform the following steps:

1. Validate restaurant availability.
2. Check item availability.
3. Calculate the bill.
4. Apply discount if the order value is above ₹1000.
5. Process payment.
6. Generate Order ID.
7. Send confirmation message.

## Expected Output

```text
Restaurant Verified
Items Available
Bill Calculated
Discount Applied
Payment Successful
Order ID Generated
Confirmation Sent
Order Placed Successfully
```

## Abstraction Condition

### Customer Should Know Only

```java
placeOrder()
```

### Customer Should Not Know How These Methods Work Internally

```java
validateRestaurant()
checkItems()
calculateBill()
applyDiscount()
processPayment()
generateOrderId()
sendConfirmation()
```

These methods should be hidden from the customer and executed internally by the `placeOrder()` method, demonstrating the concept of **Abstraction**.