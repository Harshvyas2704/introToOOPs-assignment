package com.masai;

public class Students {

	int roll;
	String name;
	int marks;
	
	void displayStudentDetails(int r, String n, int m) {
		System.out.println("Student name: " + n);
		System.err.println("Student roll number is: " + r);
		System.out.println("Student marks: " + m);
	}
	
	public static void main(String[] args) {
		
		Students s1 = new Students();
		s1.roll = 1;
		s1.name = "Harsh";
		s1.marks = 10;
		
		s1.displayStudentDetails(s1.roll, s1.name, s1.marks);
		s1 = null;
		
		Students s2 = new Students();
		s2.roll = 2;
		s2.name = "Prem";
		s2.marks = 10;
		
		s2.displayStudentDetails(s2.roll, s2.name, s2.marks);
		s2 = null;
		
	}
}
