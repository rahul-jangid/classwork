package com.sapient.vo;

import java.time.LocalDate;

public class Emp implements Comparable<Emp>{			// to bind the database columns at one place
	
	private int empId;
	private String empName;
	private double sal;
	private int deptId;
	private LocalDate doj;
	
	public Emp(int empId, String empName, double sal, int deptId, LocalDate doj) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;				// going to change many times so provide setter
		this.deptId = deptId;
		this.doj = doj;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public int getDeptId() {
		return deptId;
	}

	public LocalDate getDoj() {
		return doj;
	}

	@Override
	public String toString() {
		return empId+" 	"+empName+" "+sal+" "+deptId+" "+doj; 
	}

	@Override
	public int compareTo(Emp emp) {
		Integer e1 = this.empId;
		Integer e2 = this.empId;
		return e1.compareTo(e2);
	}
	
	

}
