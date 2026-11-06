package com.objectCreationNew;

public class Driver3 {
public static void main(String[] args) {
	Driver3 driver3= new Driver3();
	driver3.practiceSet1();
	driver3.practiceSet2();
	driver3.practiceSet3();
	driver3.practiceSet4();
	driver3.practiceSet5();
	driver3.practiceSet6();
	driver3.practiceSet7();
}
void practiceSet1() {
	String s1="Harsh";
	String s2 = "Harsh";
	String s3 = new String("Harsh");// 2 objects
//	System.out.println(s1==s2);//t
//	System.out.println(s1==s3);//f
//	System.out.println(s1.equals(s3));//t
}
void practiceSet2() {
	String s1 = "Java";
	String s2 = s1;

	s1 = s1.concat(" Developer");//2 object : scp + heap 

//	System.out.println(s1);//Java Developer
//	System.out.println(s2);//Java
//	System.out.println(s1 == s2);//false
}
void practiceSet3() {
	String s1 = "Java";
	String s2 = "Java";

	s1 = s1.concat("");

	//System.out.println(s1 == s2);//true
}
void practiceSet4() {
	String s1 = "Java";
	String s2 = new String("Java");//2 object

	s2 = s2.concat(" Developer");//s2-->new obj

//	System.out.println(s1 == s2);//false
//	System.out.println(s1.equals(s2));//false
}
void practiceSet5() {
	String s1 = "Java";
	String s2 = new String("Java");

//	System.out.println(s1 == s2);//false
//	System.out.println(s1.equals(s2));//true
}
void practiceSet6() {
	String s1 = "Java";
	String s2 = new String("Java");

//	System.out.println(s1 == s2);//false
//	System.out.println(s1.equals(s2));//true
}
void practiceSet7() {
	 String s1 = "Java";
     String s2 = s1;

     s1 = s1.concat(" Developer");// concat will return a new String 
     // as it is a method

     System.out.println(s1);
     System.out.println(s2);
}
}
