package com.sapient.util;

import java.util.HashSet;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Set;


public class ExamUtil {								// we moved this funciton to ExamUtil coz random no generator could be used in many other applications too
	
	
	public static final String DRIVER;
	public static final String URL;
	public static final String UNAME;
	public static final String PWD;
	
	static{
		ResourceBundle rb = ResourceBundle.getBundle("sap.properties");
		DRIVER =rb.getString("driver");
		URL = rb.getString("URL");
		UNAME= rb.getString("UNAME");
		PWD = rb.getString("PWD");
	}
	public static Set<Integer> generateUniqueNos(int n){
		Set<Integer> set = new HashSet<>();
		Random rand = new Random();
		while(set.size()<n){
			set.add(rand.nextInt(15)+1);
		}
		
		return set;
	}
}
