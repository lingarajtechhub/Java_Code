package com.exception.java;

public class CustomException {
	
	public static void main(String[] args) {
		
		try {
			validateRoll(123);
		} catch (RollDoesNotExist e) {
			e.printStackTrace();
		}
		
	}

	static void validateRoll(int roll) throws RollDoesNotExist {
		
		if(roll>=1 && roll<=100) {
			System.out.println("Student Exist.");
		}
		else
		{
			throw new RollDoesNotExist("Student Does Not Exist.");
		}
		
	}

}
