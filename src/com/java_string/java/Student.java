package com.java_string.java;

public class Student {
	
	int roll;
	String Name;
	
	

	public Student(int roll, String Name) {
		this.roll = roll;
		this.Name = Name;
	}

	public String toString()
	{
		return roll+" "+Name;
	}

	public static void main(String[] args) {
		
		Student S = new Student(234,"ASDFGHJ");
		
		System.out.println(S);

	}

}
