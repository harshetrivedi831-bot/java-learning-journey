package com.objectCreation;
class Student
{
	
}
public class Driver6 {
public static void main(String[] args) {
	

	Student[] arr = new Student[3];
	
	arr[0] = new Student();

	System.out.println(arr[0]);//holds Student object (address)
	System.out.println(arr[1]);//null 
	
}
}
