package com.exception.java;

public class Throw {

	public static void main(String[] args) {
		
		try {
			validate(1);
		} catch (AgeNotValidateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	 static void validate(int age) throws AgeNotValidateException{
		if(age>=18)
		{
			System.out.println("Eligible For Voting.");
		}
		else
		{
			throw new AgeNotValidateException("Age Is Not Validate.");
		}
		
	}

}
