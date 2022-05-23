package com.masai;

public class Diffrence {

	static int x = 10;
	int y = 20;
	
	public static void main(String[] args) {
		
		System.out.println(x); // static variable 
		
		Diffrence d1 = new Diffrence();
		System.out.println(d1.y); // non static variable
		
		/* 
		 1) static variable -> when we run application, all the static
		 variables will load to RAM, irrespective of we use it or not.
		 2) non static variable -> when we run application all the non static
		 variable will be stored in hard-disk not in RAM.
		 3) to access those non static variables we have to create objects.
		 4) after creating object we can access non static variables.   
		 
		*/ 
	}
}
