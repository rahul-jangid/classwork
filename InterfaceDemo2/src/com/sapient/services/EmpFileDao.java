package com.sapient.services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class EmpFileDao implements Idao {

	EmpFileDao(){
		//instance cannot be created in other package
	}
	@Override
	public List<String> viewEmployee() {
		System.out.println("accessing file");
		List<String> lst = new ArrayList<String>();
		String str = null;
		try{
			FileReader fr = new FileReader("Emp.txt");
			BufferedReader br = new BufferedReader(fr);
			while((str = br.readLine()) != null){
				lst.add(str);
			}
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		return lst;
	}
	

}
