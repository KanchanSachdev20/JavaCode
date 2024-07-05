package Assignments;

public class MethodsAssignment {

	public int add(int a, int b) {
		int c = a+b;
		System.out.println("Sum is :");
		return c;
	}
	
	public int sub(int a, int b) {
		int c = a-b;
		System.out.println("Substraction is :");
		return c;
	}
	
	public int division(int a, int b) {
		int c = a/b;
		System.out.println("division is :");
		return c;
	}
	
	public int multiplication(int a, int b) {
		int c = a*b;
		System.out.println("multiplication is :");
		return c;
	}
	
	public double product(double a, double b) {
		double c = a*b;
		System.out.println("product is:");
		return c;
	}
	
	public boolean evenOrOdd(int num) {
		System.out.println("Num is :");
		if(num%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		return true;
	}
	public static void main(String[] args) {
//		1.Write a program to print the addition/subtraction/division/multiplication of two numbers entered by user by defining your own method

		MethodsAssignment calculate = new MethodsAssignment();
		int sum = calculate.add(10, 20);
		System.out.println(sum);
		
		int sub =calculate.sub(30, 15);
		System.out.println(sub);
		
		int div = calculate.division(20, 10);
		System.out.println(div);
		
		int mul = calculate.multiplication(16, 24);
		System.out.println(mul);
		
		
	//		2. Define a method that returns the product of two double numbers entered by user.
		
		double res= calculate.product(25.22, 33.44);
				System.out.println(res);
				
				//Def﻿ine a program to find out whether a given number is even or odd - return true/false.
		boolean flag = calculate.evenOrOdd(245);
		
	}

}
