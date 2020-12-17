package com.hdfc.loans.carloans;

import java.io.BufferedInputStream;

public class FirstClass {
	int a=10,b=20,c;//properties
	void add() {
		c=a+b;
		System.out.println("addition of a& b is:"+c);
	}
	void sub()
	{
		c=a-b;
		System.out.println("subtraction of a & b is"+c);
	}
	
		

	public static void main(String[] args) {
		
		
		System.out.println("Hi  ...");
		FirstClass obj=new FirstClass();
		obj.add();
		
		obj.sub();
		FirstClass obj1=new FirstClass();
		obj1.add();
		obj1.sub();


	}

}
