package com.sapient.demos;

import java.util.Scanner;

public class EnumDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first value");
		int v1= scan.nextInt();
		System.out.println("enter second number");
		int v2=scan.nextInt();
		System.out.println("choose 1 -- Add \n 2-- Sub\n 3--Multiply\n");
		String str=scan.next();
		
		Menu menu = Menu.valueOf(str.toUpperCase());
		switch(menu){
		case ADD:
			System.out.println("Add"+ (v1+v2));
			break;
		case SUB:
			System.out.println("Substraction"+ (v1-v2));
			break;
		case MULTIPlY:
			System.out.println("Multiply"+ (v1*v2));
			break;	
		default:
			System.out.println("Invalid menu option");
		
		} 

	}

}
enum Menu{
	ADD,SUB, MULTIPlY
}
