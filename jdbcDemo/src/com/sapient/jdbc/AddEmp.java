package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AddEmp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");				// load driver
		String url = "jdbc:oracle:thin:@localhost:1521:xe";				// load driver
		
		
		Connection conn = DriverManager.getConnection(url,"system","sapient123"); // establishing connection
		
		String sql ="insert into sap_emp values(?,?,?,?,?) ";			// sql statement
		
		
		
		PreparedStatement st = conn.prepareStatement(sql);		// prepared statement
		st.setDouble(1,2001);
		st.setString(2, "ramesh");
		st.setDouble(3, 45000);
		st.setInt(4, 2);
		st.setString(5,"12-dec-2016");
		
		int rows = st.executeUpdate();
		System.out.println(rows+"rows affected");
			
		conn.close();
	}

}
