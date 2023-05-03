package com.jdbc.java;

//import Requred packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Employee_Data {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException,Exception {
		
	  //JDBC Driver Name and Database URL	
		
	  final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	  final String DB_URL = "jdbc:mysql://localhost/test";
	  
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
	  sql = "SELECT * FROM `employee` where age = 32";
	  ResultSet rs = stmt.executeQuery(sql);
	  
	  //Extract data from Resultset
	  while(rs.next()){
		  //Retrive by column name
		  int employeeID = rs.getInt("roll");
		  String Name = rs.getString("name");
		  int age = rs.getInt("age");
		  
		  //Display values
		  System.out.println("EmployeeID:"+employeeID+" Name:"+Name+" Age: "+age);
	  }
	  
	  rs.close();
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

