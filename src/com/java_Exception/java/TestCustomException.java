package com.java_Exception.java;

public class TestCustomException {
	
	private static void validate(int age) throws InvalidAgeException {
		
		if(age<18)
		{
			throw new InvalidAgeException("Not Valid");
		}
		
	}
	
	public static void main(String[] args){
		try {
			validate(13);
		} catch (InvalidAgeException e) {
			System.out.println(e);
		}
		finally
		{
			System.out.println("Must Implemented");
		}
	}

	

}
