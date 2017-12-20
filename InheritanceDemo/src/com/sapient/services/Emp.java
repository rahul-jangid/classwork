package com.sapient.services;

public class Emp implements Cloneable {			// implement Cloneable interface
	
	private int eid;
	private String ename;
	public Emp(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	@Override
	public String toString() {
		
		return eid+" "+ename;
	}
	@Override
	public boolean equals(Object obj) {
		
		Emp emp = (Emp)obj;
		if(this==emp)
			return true;
		else if (this.eid==emp.eid && this.ename.equals(emp.ename))
			return true;
		else
			return false;
		
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("The object is GCed for employee Id "+eid);
	}
	@Override
	public Emp clone() throws CloneNotSupportedException {		// change visibility from protected to public to access it in EmpClient2
		// TODO Auto-generated method stub							// 
		return (Emp)super.clone();								// change return type from Object to Emp
	}
	
	
	
	

}
