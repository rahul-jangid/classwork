package com.sapient.client;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.sapient.dao.DaoFactory;
import com.sapient.dao.IDao;
import com.sapient.exception.IdException;
import com.sapient.exception.NotfoundException;
import com.sapient.vo.Emp;

public class EmpClient {

		
		static Scanner scan = new Scanner(System.in);
		static IDao dao = DaoFactory.getDaoInstance();
		
		public static void main (String[] args){
			String  menu = null;
			String opt = null;
			Menu emenu = null;
			do{
				System.out.println("Choose : ADD \n EDIT \n REMOVE\n VIEWALL\n");
				menu = scan.next();
				try{
					emenu = Menu.valueOf(menu);
					processMenu(emenu);
				}catch(Exception ex){
					System.out.println("invalid menu option ");
				}
				
				System.out.println("press y to continue ");
				opt = scan.next();
			}while(opt.equals("y"));
		}
		public static void processMenu(Menu menu){
			switch(menu){
			case VIEWALL:
				viewall();
				break;
			case VIEW:
				viewbyid();
				break;
			case ADD:
				add();
			}
			
		}
		public static void viewall(){
			List<Emp> lst = dao.viewEmployee();
			for(Emp emp: lst){
				System.out.println(emp);
			}
			
		}
		public static void viewbyid(){
			System.out.println("enter Employee Id");
			int eid = scan.nextInt();
			try{
				Emp emp= dao.viewEmployee(eid);
				System.out.println(emp);
				
			}catch(NotfoundException e){
				System.out.println(e.getMessage());
			}
		}
		public static void add(){
			System.out.println("Enter employee Id");
			int eid = scan.nextInt();
			System.out.println("enter employee name");
			String name = scan.next();
			System.out.println("enter employee salary");
			Double sal =scan.nextDouble();
			System.out.println("enter DeptId");
			int did = scan.nextInt();
			System.out.println("enter data (dd-mm-yyyy)");
			String strdt = scan.next();
			DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate doj =LocalDate.parse(strdt,df);			// this funciton will convert the entered string in the form of df in date format
			Emp emp = new Emp(eid,name,sal,did,doj);
			try{
				dao.addEmployee(emp);
				System.out.println("employee added");
			}catch(IdException e){
				System.out.println(e.getMessage());
			}
		}

	}


