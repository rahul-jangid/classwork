package com.sapient.client;

import java.util.Scanner;

import com.sapient.services.Circle;


public class CircleClient {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the radius");
		double rad = scan.nextDouble();
		
		try {
			Circle obj= new Circle(rad);
			double area = obj.area();
			double pm =obj.perimeter();
			System.out.println("area of the circle is "+area);
			System.out.println("perimeter of the circle is "+pm);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		scan.close();		

	}

}
