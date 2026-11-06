package com.objectCreationNew;

public class Driver5 {
public static void main(String[] args) {
	Driver5 driver = new Driver5();
	driver.practiceSet1();
	driver.practiceSet2();
}
void practiceSet1() {
	String s2="hii harsh";
	String s1="hii"+" harsh";
	//compiler ise "hiiharsh" mein optimize kar sakta hai. Dono compile-time constants hain.
	//agar username runtime par Scanner se aata hai, toh concatenation runtime par hogi.
	System.out.println(s1==s2);
}
void practiceSet2() {
	  String s1 = "Java";
      String s2 = "Spring";

      String s3 = "Java" + "Developer";
      String s4 = s1 + "Developer";
      String s5 = "JavaDeveloper";
      String s6 = s2 + "Developer";
      String s7 = new String("Java");
      String s8 = s7.intern();
      
      String f = "Java";
      String f1 = new String("java").intern();
      
      System.out.println(f1);//java
      
      System.out.println(f == f1);//f
      
  }
}

