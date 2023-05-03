package com.Inheritance.java;

public class College {
	
	String name;
	String address;
	
	public College(String name,String address) {
		this.name = name;
		this.address = address;
		System.out.println(this.name+" "+this.address);
	}
	
	void super_m()
	{
		System.out.println("this is super class");
	}

}
