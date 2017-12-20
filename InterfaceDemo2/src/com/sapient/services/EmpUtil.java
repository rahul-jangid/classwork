package com.sapient.services;

import java.util.ResourceBundle;

public class EmpUtil {
	private static ResourceBundle rb;					// compiler wont know at compile time that Dog d = new Dog();
	private static Idao dao;
	static{
		rb = ResourceBundle.getBundle("sap");
		try{
			
			Class cls = Class.forName(rb.getString("cname"));		// load the class
			dao = (Idao)cls.newInstance();			//create new instance
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		
	}
	
	public static Idao getDaoInstance(){
		
		return dao;
		
	}

}
