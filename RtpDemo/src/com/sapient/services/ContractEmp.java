package com.sapient.services;

public class ContractEmp extends Employee {
	
	private int days;

	public ContractEmp(int empId, String eName, float sal, int days) {
		super(empId, eName, sal);
		this.days = days;
	}
	
	

	@Override
	public void display() {
		super.display();
		System.out.printf("%30.2f%20.2f%20s",days,calSal(),getClass().getSimpleName());
	}



	@Override
	public double calSal() {
		return getSal()*days;
	}
	

}
