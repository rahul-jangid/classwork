package com.sapient.services;

public class SalesPerson {
	public int id;
	public String name;
	public double samt;
	public static int noOfPerson=0;
	public static double tsales;
	
	
	public SalesPerson(int id, String name, double samt) {
		super();
		this.id = id;
		this.name = name;
		this.samt = samt;
		++noOfPerson;
		tsales=tsales+samt;
	}


	public double calcSalesComm(){
		double sc=0;
		if(samt>=50000){
			sc=samt*.1;
		}
		if(samt<50000 && samt>=20000){
			sc=samt*.05;
		}
		if(samt<20000){
			sc=samt*.03;
		}
		return sc;
		
	}
	
	public void display(){
		System.out.println("Id "+id+" Name "+name+" Sales amt "+samt+" "+calcSalesComm());
		
	}

}
