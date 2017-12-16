package com.sapient.client;

import com.sapient.services.Circle;
import com.sapient.util.SapUtil;
import java.util.*;

public class CircleClient {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		Circle obj=new Circle();
		System.out.println("enter the radius");
		obj.radius=scan.nextDouble();
		System.out.println("area of the circle is "+SapUtil.roundUp2Dec(obj.area()));
		System.out.println("perimeter of the circle is "+obj.perimeter());
		scan.close();
		
	}

}
