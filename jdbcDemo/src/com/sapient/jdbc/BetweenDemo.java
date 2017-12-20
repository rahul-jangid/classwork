package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BetweenDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the lowest range");
		double minsal = scan.nextDouble();
		System.out.println("enter the maximum range");
		double maxsal = scan.nextDouble();
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");				// load driver
		String url = "jdbc:oracle:thin:@localhost:1521:xe";				// load driver
		
		
		Connection conn = DriverManager.getConnection(url,"system","sapient123"); // establishing connection
		
		String sql ="select * from sap_emp where sal between ? and ? ";			// sql statement
		
		
		
		PreparedStatement st = conn.prepareStatement(sql);		// prepared statement
		st.setDouble(1,minsal);
		st.setDouble(2, maxsal);
		
		
		ResultSet rs = st.executeQuery();				// execute  the query or DML
		
		while(rs.next()){									// iterate result set
			System.out.println(rs.getInt("eid"));
			System.out.println(rs.getString("ename"));
			System.out.println(rs.getDouble("sal"));
			System.out.println(rs.getInt("dept_id"));
			System.out.println(rs.getDate("doj"));
			System.out.println("---------------------------------------------");
			
		}
			
		conn.close();

	}

}
