package com.sapient.exceptions;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("line 1");
		System.out.println("line 2");
		try{
			int a=5/2;									// try to change denominator (0,2,5)
			System.out.println("try block");
		}catch(ArithmeticException ex){
			System.out.println(ex.getMessage());
			System.out.println("catch block");
			ex.printStackTrace(); 						// tracing the excepotion
		}finally{
			System.out.println("finally block ");
		}
		
		System.out.println("line 3");
		System.out.println("line 4");
		System.out.println("line 5");
		System.out.println("line 6");

	}

}
