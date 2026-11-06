package com.objectCreationNew;

public class Driver {
public static void main(String[] args) {
	String s1 = "Java";
	String s2 = "Java";

	s2 = s2.concat(" Developer");
	String s3 = s2;
	s2 = s2.concat("");
	String s4="Java Developer";

	System.out.println(s1 == s2);
	System.out.println(s2 == s3);
	System.out.println(s2.equals(s3));
	// intern() takes benefit of scp
	// object present in heap, brings in scp
	// if available in scp start pointing else create a 
	// copy and point
	System.out.println(s2.intern()==s4);
	
}
}
