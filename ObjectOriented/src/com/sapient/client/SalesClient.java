package com.sapient.client;

import com.sapient.services.SalesPerson;

public class SalesClient {

	public static void main(String[] args) {
		SalesPerson s1= new SalesPerson(1001,"ram",45000);
		SalesPerson s2= new SalesPerson(1002,"tom",22000);
		SalesPerson s3= new SalesPerson(1003,"kakad",3000);
		
		s1.display();
		s2.display();
		s3.display();
		
		System.out.println("No of persons "+ SalesPerson.noOfPerson);
		System.out.println("Total no of sales "+SalesPerson.tsales);
		

	}

}
