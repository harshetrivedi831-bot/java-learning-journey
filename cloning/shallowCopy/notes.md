Shallow copy means only the first level object is duplicated.

If that object contains another object (nested object),
the nested object is not duplicated.

Instead, the reference/address of the nested object is copied.

As a result:

✅ Original object's address is different.
✅ Cloned object's address is different.
✅ Nested object's address is the same.

Therefore both objects share the same nested object.

employee                    clonedObject
   |                              |
   v                              v
+------------------+      +------------------+
| name="harsh"     |      | name="harsh"     |
| id="12A"         |      | id="12A"         |
| address ---+     |      | address ---+     |
+------------|-----+      +------------|-----+
             |                         |
             +-----------+-------------+
                         |
                         v
                  +------------+
                  | city=unnao |
                  +------------+
