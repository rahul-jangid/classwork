package com.sapient.wrapper;

public class Boxing {

	public static void main(String[] args) {
		Integer a = new Integer(10);		// boxing
		Integer b =new Integer(20);
		int res = a.intValue()+b.intValue(); 		// unboxing
		Integer c = Integer.valueOf(res);
		System.out.println(c);
		
		int v1 = 10;
		Integer wrap=v1;
	}

}
