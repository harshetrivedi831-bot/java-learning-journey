package com.array;
// Another way to initialize an array without new keyword 
// Req : find unnao exist in a list of cities
public class Driver2 {
public static void main(String[] args) {
	String[] cities = {"unnao","kanpur","lucknow","mirjapur","barelli",
			"sultanpur","ajamgarh","unnao"};
	System.out.println(cities);
	// iterate and break as u get the city first occurence
	for (int index = 0; index < cities.length; index++) {
		// comapring unnao with each city object
		if(cities[index].equals("unnao")) {
			System.out.println("unnao is present in the list");
			break;// for performance no need to iterate the list further
		}
	}
}
}
