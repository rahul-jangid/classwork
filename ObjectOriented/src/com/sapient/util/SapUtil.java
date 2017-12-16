package com.sapient.util;

public class SapUtil {
	
	public static double roundUp2Dec(double val){
		
	return Math.round(val*100)/100.0;
			
	}
	
	public static void main(String args[]){
		double s=3.616;
		System.out.println(roundUp2Dec(s));
		
		
	}

}
