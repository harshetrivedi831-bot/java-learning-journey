package com.objectCreation;

public class Driver5 {
public static void main(String[] args) {
	String s1 = new String("Java");
	// line 5 creates two object : scp(Java) and heap(Java)
	// s1 points to heap and original point to scp
	String s2 = s1.intern();
	// s2 point to pooled object(Java) 
	// earlier Java is pointed by original now s2 is pointing
	System.out.println(s1==s2);
	//false
}
}
