package com.sapient.services;

public class interest {
	public double amt;
	public float years;
	public float rate;
	
	public double calcsimple(){
		double si =amt*years*rate/100;
		return si;
	}
	
	public double calcCompound(){
		double ci = amt*Math.pow((1+rate/100), years);
		return ci;
		
		
	}

}
