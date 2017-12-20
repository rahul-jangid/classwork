package com.sapient.services;

public class OnRoll extends Employee {
	
	private double da;
	private double pf;
	
	
	public OnRoll(int empId, String eName, float sal) {
		super(empId, eName, sal);
		da = calda();
		pf = calpf();

	}
	
	private double calpf(){
		
		return getSal()*0.12;
	}
	private double calda(){
		return getSal()* 0.4;
	}

	@Override
	public void display() {
		super.display();
		System.out.printf("%10.2f%10.2f%30.2f%20s",da,pf,calSal(),getClass().getSimpleName());
	}


	@Override
	public double calSal() {
		return getSal()-da+pf;
	}

}
