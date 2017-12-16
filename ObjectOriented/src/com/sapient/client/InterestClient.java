package com.sapient.client;

import java.util.Scanner;

import com.sapient.services.interest;

public class InterestClient {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the amt");
		double p= scan.nextDouble();
		System.out.println("enter the years");
		int n = scan.nextInt();
		System.out.println("enter the rate of interest");
		float per =scan.nextFloat();
		
		interest obj=new interest();
		obj.amt=p;
		obj.rate=n;
		obj.years=per;
		
		double si= obj.calcsimple();
		double ci = obj.calcCompound();
		
		System.out.println("simple"+si);
		System.out.println("compound"+ci);
		
		scan.close();


	}

}
