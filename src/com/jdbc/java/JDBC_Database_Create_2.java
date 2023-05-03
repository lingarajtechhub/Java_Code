package com.jdbc.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Database_Create_2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		final String DB_URL = "jdbc:mysql://localhost/";
		
		final String USER = "qwerty";
		final String PASSWORD = "";
		
		Connection con = null;
		Statement stmt = null;
		
		Class.forName(JDBC_DRIVER);
		System.out.println("Connecting to database...................\n");
		con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		
		System.out.println("Creating Statement......");
		stmt = con.createStatement();
		
		String sql = "CREATE DATABASE NimbleTech6";
		stmt.executeUpdate(sql);
		System.out.println("Database created successfully....");
		  
		stmt.close();
		con.close();

		if(stmt!=null){
			  stmt.close();
		}
		  
		if(con!=null){
			  con.close();
		}
		System.out.println("GOOD BYE...........");
		
	}

}
