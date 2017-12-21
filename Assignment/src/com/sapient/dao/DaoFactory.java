package com.sapient.dao;

import java.util.ResourceBundle;



public class DaoFactory {
	
	private static ResourceBundle rb;					// compiler wont know at compile time that Dog d = new Dog();
	private static IDao dao;
	static{
		rb = ResourceBundle.getBundle("sap");
		try{
			
			Class cls = Class.forName(rb.getString("cname"));		// load the class
			dao = (IDao)cls.newInstance();			//create new instance
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		
	}
	
	public static IDao getDaoInstance(){
		
		return dao;

	}
}
