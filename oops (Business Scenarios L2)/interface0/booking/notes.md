>> booking train and booking flight is different 
	but booking tickst can be same.
	
>>
/*
	 * default method brings code duplicacy line db connenction in autoUpgrade() and
	 * sendNotification() so private method introduced in java9
	 */
	private void connectToDb() {
		System.out.println("IBooking.connectToDb()");
	}
	
	
```
thinking is key -- how connection is happening between interface methods
think more and build meaningful programs.
```