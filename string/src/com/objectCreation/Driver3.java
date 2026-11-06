package com.objectCreation;

public class Driver3 {
	public static void main(String[] args) {
//		String a = "Java";//a-->obj(Java)
//		String b = a;
//
//		a = "Spring";
//
//		System.out.println(a);
//		System.out.println(b);
		Driver3 driver3=new Driver3();
		driver3.stringSet();
		driver3.stringSet1();
		driver3.stringSet2();
		driver3.stringSet3();
		driver3.stringSet4();
		driver3.stringSet5();
		driver3.stringSet6();

	}
	void stringSet() {
		String s1=new String("Java");
		String s2 = new String("Java");
		//System.out.println(s1==s2);//f
		//System.out.println(s1.equals(s2));//t
	}
	void stringSet1() {
		String s1="Java";
		String s2 ="Java";
		//System.out.println(s1==s2);//t
		//System.out.println(s1.equals(s2));//t
	}
	void stringSet2() {
		String s1="Java";
		String s2 ="Java";
		s1="Spring";
		//System.out.println(s1==s2);//f
		
	}
	void stringSet3() {
		// 9 conceptual String objects.
		String s1 = "Java";
		String s2 = "Backend";
		String result1 = s1 + s2 + "Developer";
		String result2 = s1 + (s2 + "Developer");
		String result3 = s1.concat(s2).concat("Developer");
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result1 == result2);
		
	}
	
	void stringSet4() {
		String s1="Java";
		String s2=s1;
		//concat() does not modify "Java"
		//It creates/returns a String containing "Java Developer".
		s1.concat(" Developer");
		//System.out.println(s1);//Java
		//System.out.println(s2);//Java	
	}
	void stringSet5() {
		System.out.println("===========================================");
		// s1 & s2 -- object ( java)
		String s1 = "Java";
		String s2 = "Java";
		// concat() ko empty String mila → kuch add nahi hua → same String object return hu
		s2 = s1.concat("");
		//System.out.println(s1 == s2);//true
		s1 = s1.concat(" ");// blank space 
		//System.out.println(s1 == s2);//false
		
	}
	void stringSet6() {
		String s1 = "Java";

		s1.toUpperCase();

		//System.out.println(s1);
	}
	
}
