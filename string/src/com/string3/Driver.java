package com.string3;

public class Driver {
public static void main(String[] args) {
	String s1="hello";
	String s2 =" world";
	String s3=s1+s2;
	System.out.println(s3);//hello world in heap b/s of new StringBuilder
	/*
	 * prove that s3 copy is not there in scp it is in heap 
	 * compare the reference 
	 */
	String s4="hello world";//hello world in heap
	//System.out.println(s3==s4);//false
	/*
	 * Lets optimise the memory s3 reference should point to s4 as a object
	 * with same content is present there how use of intern()
	 */
	System.out.println(s4==s3.intern());//true
	
	
	
}
}
