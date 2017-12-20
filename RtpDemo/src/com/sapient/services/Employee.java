package com.sapient.services;

public abstract class Employee {
	
	private int empId;
	private String eName;
	private double sal;
	public Employee(int empId, String eName, float sal) {
		super();
		this.empId = empId;
		this.eName = eName;
		this.sal = sal;
	}
	
	
	public double getSal() {
		return sal;
	}


	public void display(){
		
		System.out.printf("%10d%10s%10.2f",empId,eName,sal);
	}
	public abstract double calSal();

}
