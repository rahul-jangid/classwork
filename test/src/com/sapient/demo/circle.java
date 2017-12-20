package com.sapient.demo;

import java.util.*;


public class circle {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the radius of circle");
		double r=scan.nextDouble();
		double ar=area(r);
		System.out.println("area of the cirecle is "+ar);
		double pr=parimeter(r);
		System.out.println("parimeter of the circle is "+pr);
		scan.close();

	}
	
	public static double area(double radius){
		return (Math.PI*radius*radius);
		
	}
	public static double parimeter(double radius){
		return 2*Math.PI*radius;
	}

}
