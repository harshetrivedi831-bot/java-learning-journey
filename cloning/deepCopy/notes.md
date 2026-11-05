# Deep Copy

In deep copy, we change the implementation of the overridden clone() method of a class that contains nested objects.

Instead of only cloning the current object (level 1 object), we also clone the nested objects
 and assign those cloned objects to the cloned parent object.
 As a result:

✅ A new outer object is created.
✅ A new nested object is created.
✅ References are not shared.
✅ Changes in the original nested object do not affect the cloned object.

Process:

1. Call super.clone() to create a shallow copy.
2. Clone the nested object separately.
3. Replace the copied reference with the newly cloned nested object.
4. Return the fully copied object.

Example:

Manager copiedObj = (Manager) super.clone();

copiedObj.employee = (Employee) employee.clone();

return copiedObj;