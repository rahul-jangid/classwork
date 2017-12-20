package com.sapient.client;

import com.sapient.services.Calculator;
import com.sapient.services.Factorial;

public class FactorialClient {

	public static void main(String[] args) {
		Factorial obj = Calculator.getBasic();
		System.out.println(obj.findFact(5));
		System.out.println(obj.doSum(7,92,6,9));

	}

}
