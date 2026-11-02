Banking example 
customers -- different account type share common functionlaities like
deposit withdraw and checkBalance.
so these behaviours we can define in an interface.and let each account
type  class to implemnt own way.

>> Because business logic should generally return data, not print it.
so thats Why returning an object is good? via overridden method,

```
void interestCalcualtion();//needs curentAmount and rateOfInerest which is 
	// available so dont need to pass again [ something which is already
	available to class implemetation so we dont need to pass anyhting
	separately it makes no sense.
	```


===================================

