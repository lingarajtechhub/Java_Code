package com.serializationObject.java;

import java.io.Serializable;

public class Student implements Serializable{
	
	public Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}
	
	int roll;
	String name;
	
	

}
