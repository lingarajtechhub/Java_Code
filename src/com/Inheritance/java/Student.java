package com.Inheritance.java;

public class Student extends College{
	int roll;
	String name;
	
	public Student(String name, String address) {
		super(name, address); //constructor
		super.name = "qwerty"; //property
		super.super_m(); //method
	}


	public static void main(String[] args) {
		Student S = new Student("QWERTY","QWERTY-123");
		S.Stud_Details(232,"QWSDF");
	}


	public void Stud_Details(int roll, String name) {
		this.roll = roll;
		this.name = name;
		System.out.println(this.roll+" "+this.name);
	}

}
