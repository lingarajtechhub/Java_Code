package com.jdbc.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Create_Table2 {

	public static void main(String[] args) throws SQLException {
		
		final String JDBC_Driver = "com.mysql.jdbc.Driver";
		final String DB_URL = "jdbc:mysql://localhost/";
		
		final String USER = "bhabani";
		final String PASSWORD = "123";
		
		Connection con = null;
		Statement stmt = null;
		
		try {
			Class.forName(JDBC_Driver);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		
		System.out.println("Connecting to database...................\n");
		try {
			con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
		System.out.println("Creating Statement......");
		try {
			stmt = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql = "CREATE DATABASE NimbleTech7";
		
		stmt.executeUpdate(sql);
		
		System.out.println("Database created successfully....");
		
		stmt.close();
		con.close();
		
		if(stmt!=null) {
			stmt.close();
		}
		
		if(stmt!=null) {
			con.close();
		}
		
	}

}
