package com.java_Exception.java;

public class TestException2 {

	
	public static void validate_Roll(int roll) throws Roll_Not_Validate_Exception  {
		
		if(roll<=100)
		{
			System.out.println("Valid Roll");
		}
		else
		{
			throw new Roll_Not_Validate_Exception("NOT Valid");
		}
		
	}
	
	
	public static void main(String[] args) throws Roll_Not_Validate_Exception {
		
		
			validate_Roll(190);
		

	}

	

}
