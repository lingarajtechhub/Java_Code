package com.jdbc.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBC_Record_Insertion {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//JDBC Driver Name and Database URL	
		
		  final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		  final String DB_URL = "jdbc:mysql://localhost/NimbleTech5";
		  
		  //Database Credentials
		  final String USER = "root";
		  final String PASSWORD = "";
		  
		  //Assign values on con and stmt object;
		  Connection con = null;
		  Statement stmt = null;
		  
		  //Register JDBC Driver
		  Class.forName(JDBC_DRIVER);
			
		  //Open a connection
		  System.out.println("Connecting to database...................\n");
		  con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		  
		  //Execute a query
		  System.out.println("Creating Statement......");
		  stmt = con.createStatement();
		  String sql;
		  sql = "INSERT INTO `customer_details`"+
		        "(`cid`, `c_name`, `c_design`, `C_age`, `c_gender`)"+
				"VALUES (NULL,'SHYAM','KAPOOR',21,'M')";
		  
		  stmt.executeUpdate(sql);
		  System.out.println("Record Inserted Successfully....");
		  
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
