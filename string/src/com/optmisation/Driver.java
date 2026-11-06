package com.optmisation;

public class Driver {
public static void main(String[] args) {
	String s1="Harsh " + "is " + "Boss";
	// literals with no reference so they will not chnage
	System.out.println(s1);
	// compile time optimisation
	// instead of 3 object casue they are constant one object
	//created and saces memory
	String s2="final";
	s2="test";//can be changed that why no compile time optimisation
	String s3="boss";
	String s4=s2+s3;
	String s5="OTC"+s3;
	// s2 s3 s4 = 3 objects, heap , + internally call 
	// new StringBuilder()
	// research
}
}
