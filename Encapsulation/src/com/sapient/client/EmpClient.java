package com.sapient.client;

import com.sapient.services.Emp;

public class EmpClient {

	public static void main(String[] args) {
		Emp emp = new Emp();
		try {
			emp.setName("ram");
			emp.setAge(56);
			System.out.println(emp.getName()+" "+ emp.getAge()+" " +emp.getBusUnit());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
