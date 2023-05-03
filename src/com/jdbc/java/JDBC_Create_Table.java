package com.jdbc.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Create_Table {

	public static void main(String[] args)  {
		
		//JDBC Driver Name and Database URL	
		
		  final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		  final String DB_URL = "jdbc:mysql://localhost/NimbleTech8";
		  
		  //Database Credentials
		  final String USER = "lingaraj";
		  final String PASSWORD = "siva8984";
		  
		  //Assign values on con and stmt object;
		  Connection con = null;
		  Statement stmt = null;
		  
		  //Register JDBC Driver
		  try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
			
		  //Open a connection
		  System.out.println("Connecting to database...................\n");
		  try {
			con = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		  
		  //Execute a query
		  System.out.println("Creating Statement......");
		  try {
			stmt = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  String sql;
		  sql = "CREATE TABLE Customer_details"+
				"( cid INT NOT NULL AUTO_INCREMENT PRIMARY KEY,"+
				"c_name VARCHAR(30) NOT NULL,"+
				"c_design VARCHAR(30) NOT NULL,"+
				"C_age int(20),"+
				"c_gender text(3) )";
		  
		  try {
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  System.out.println("Table created successfully....");
		  
		  try {
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		  if(stmt!=null){
			  try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
		  
		  if(con!=null){
			  try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
		  System.out.println("GOOD BYE...........");

	}

}
