package com.sapient.services;

public class Car {
	private int carId;
	private String carName;
	private double price;
	
	
	public Car(int carId) throws Exception{
		super();
		System.out.println("one arguement constructor");
		if(carId<1000)
			throw new Exception("carId must be more than or =1000");
		this.carId=carId;
		
	}
	public Car(int carId, String carName) throws Exception{
		this(carId);
		System.out.println("two arg");
		if(carName.matches("[a-z]{3,10}"))
			throw new Exception("car Name must contain 3-10 alphabets");
		this.carName=carName;
		
	}
	public Car(int carId, String carName, double price) throws Exception {
		this (carId,carName);
		System.out.println("three arg constructor");
		if(price < 100000)
			throw new Exception("price must be more than 1 lakh");
		this.price = price;
	}
	public void display(){
		System.out.println(carId+" "+carName+" "+price);
		
	}

}
