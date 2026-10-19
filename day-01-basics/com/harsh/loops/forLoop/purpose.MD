# Problem Statement

Create an array consisting of **3 Employee objects**.

On the console, print the names of those employees whose balance is less than `2000`.

## Approach

1. **Employee class:** Create an `Employee` class with attributes and a constructor to initialize its state.

2. **Driver class:** Create three `Employee` objects by passing parameters to the constructor.
   - Now, you have three Employee objects.

3. **Store objects in an array:** Store all three Employee objects in an array.

4. **Apply a loop and make a decision:**
   - Since the input is fixed, iterate through the array using a loop.
   - Check whether each employee's balance is less than `2000`.
   - If the condition is true, print that employee's name.