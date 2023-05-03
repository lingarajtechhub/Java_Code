package com.jdbc.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Delete_Record {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		//JDBC Driver Name and Database URL	
		
		  final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		  final String DB_URL = "jdbc:mysql://localhost/customers";
		  
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
		  
		  sql = "DELETE FROM `customer_details` WHERE cid=4";
		  stmt.executeUpdate(sql);
		  System.out.println("Records Are Deleted Successfully.");
		  
		  sql = "SELECT * FROM `customer_details` WHERE c_name='GOPAL'";
		  ResultSet rs = stmt.executeQuery(sql);
		  
		  while(rs.next()){
			  //Retrieve by column name
			  int cid = rs.getInt("cid");
			  String c_name = rs.getString("c_name");
			  String c_design = rs.getString("c_design");
			  int c_age = rs.getInt("C_age");
			  String c_gender = rs.getString("c_gender");
			  //Display values
			  System.out.println(cid+" "+c_name+" "+c_age+" "+c_design+" "+c_gender);
		  }
		  
		  System.out.println("Fetch Successfully....");
		  
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
