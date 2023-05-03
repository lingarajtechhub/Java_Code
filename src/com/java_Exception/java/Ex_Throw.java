package com.java_Exception.java;

public class Ex_Throw {

	public static void main(String[] args) {
		
		 validate(13);
		 System.out.println("Rest of the code.");
	}

    static void validate(int age) {
		
		if(age<18)
		{
			try{
				throw new ArithmeticException("Not Eligible");
			}
			catch(ArithmeticException A){
				System.out.println(A);
			}
			finally {
				System.out.println("this is always implemented.");
			}
		}
		else
		{
			System.out.println("Welcome to vote.");
		}
	}

}
