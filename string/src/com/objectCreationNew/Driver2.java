package com.objectCreationNew;

public class Driver2 {
public static void main(String[] args) {
	String s1="Harsh";
	// concat op. will create new object and new object
	// always create in heap******
	String s2 = s1.concat(s1);
	System.out.println(s1);//H.....
	System.out.println(s2);//Harshharsh
	System.out.println(s1==s2);//f
}
}
