package com.sapient.client;

import com.sapient.services.ContractEmp;
import com.sapient.services.Employee;
import com.sapient.services.OnRoll;


public class EmployeeClient {

	public static void main(String[] args) {
		Employee [] emp =new Employee[4];
		emp[0]=new OnRoll(1001,"rama",35000);
		emp[1]=new OnRoll(1002,"shyama",23000);
		emp[2]=new ContractEmp(1003,"geeta",50000,5);
		emp[3]=new ContractEmp(1004,"babita",5000,5);
		
		System.out.println("------------------------------------------------------------------------------------");
		System.out.printf("%10d%30s%10.2f%10.2f%10.2f%10d%10.2f%","EMPID","ENAME","DA","PF","DAYS");
		System.out.println("------------------------------------------------------------------------------------");
		for(Employee prod: emp){
			prod.display();
			System.out.println("\n");
		}

	}

}
