package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewByEid {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		Connection conn = DriverManager.getConnection(url, "system","sapient123");
		
		String sql ="select eid,ename from sap_emp";
		PreparedStatement st= conn.prepareStatement(sql);
		
		ResultSet rs =st.executeQuery();
		while(rs.next()){
			System.out.println(rs.getInt("eid"));
			System.out.println(rs.getString("ename"));
		}
		conn.close();

	}

}
