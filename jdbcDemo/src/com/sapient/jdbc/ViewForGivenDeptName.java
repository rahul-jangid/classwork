package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ViewForGivenDeptName {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the dept id");
		int x = scan.nextInt();
		
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");				// load driver
		String url = "jdbc:oracle:thin:@localhost:1521:xe";				// load driver
		
		
		Connection conn = DriverManager.getConnection(url,"system","sapient123"); // establishing connection
		
		String sql ="select * from sap_emp where dept_id=? ";			// sql statement
		
	
		PreparedStatement st = conn.prepareStatement(sql);		// prepared statement
		st.setInt(1, x);
		
		
		
		ResultSet rs = st.executeQuery();				// execute  the query or DML
		
		while(rs.next()){									// iterate result set
			System.out.println(rs.getInt("eid"));
			
			

			System.out.println("---------------------------------------------");
			
		}
			
		conn.close();

	}

	}


