package com.sapient.services;

public class Circle {					//immutable class
	private double radius;
	
	
	
	public Circle(double radius) throws Exception {
		super();
		if(radius <= 0)
			throw new Exception ("radius must be greater than zero");
		this.radius = radius;
	}
	public double area(){
		return Math.PI*radius*radius;
		
	}
	public double perimeter(){
		return Math.PI*radius*2;
	}
	

}
