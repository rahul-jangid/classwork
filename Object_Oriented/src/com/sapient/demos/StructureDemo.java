package com.sapient.demos;


import java.math.*;
import java.util.*;

public class StructureDemo {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(fact(n));
		

	}
	public static BigInteger fact(int n){
		if(n==0){
			return 1;
		}
		else
		{
			BigInteger i= n*fact(n-1);
			return BigInteger.valueOf(i));
		}
	}

}
