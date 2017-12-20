package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewAll {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");				// load driver
		String url = "jdbc:oracle:thin:@localhost:1521:xe";				// load driver
		
		
		Connection conn = DriverManager.getConnection(url,"system","sapient123"); // establishing connection
		
		String sql ="select * from sap_emp";			// sql statement
		
		PreparedStatement st = conn.prepareStatement(sql);		// prepared statement
		
		ResultSet rs = st.executeQuery();				// execute  the query or DML
		
		while(rs.next()){									// iterate result set
			System.out.println(rs.getInt("eid"));
			System.out.println(rs.getString("ename"));
			System.out.println(rs.getDouble("sal"));
			System.out.println(rs.getInt("dept_id"));
			System.out.println(rs.getDate("doj"));
			
		}
			
		conn.close();										// if connection is not closed other users have to wait for very long time and it cannot be GCed
		
		
		
		
	}

}
