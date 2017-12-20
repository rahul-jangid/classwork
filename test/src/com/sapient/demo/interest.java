package com.sapient.demo;

import java.util.Scanner;

public class interest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the amt");
		double p= scan.nextDouble();
		System.out.println("enter the years");
		int n = scan.nextInt();
		System.out.println("enter the rate of interest");
		float per =scan.nextFloat();
		
		double simple=calcSimple(p,n,per);
		double compound=calcCompound(p,n,per);
		
		System.out.println("simple interest is"+simple);
		System.out.println("compound interest is"+compound);
		
		scan.close();
		

	}
	public static double calcSimple(double amt,int years, float rate){
		double si= amt*years*rate/100;
		return si;
		
	}
	
	public static double calcCompound(double amt, int years, float rate){
		
		double ci = amt * Math.pow((1+rate/100), years);
		return ci;
	}

}
