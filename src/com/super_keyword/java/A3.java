package com.super_keyword.java;

//child class
public class A3 extends A2
{
	
	public A3() 
	{
		super(); //Super class constructor call
		System.out.println("Value of x:"+super.x);//super class instance variable call
		super.m();//super class method call
	}

	public static void main(String[] args) {
		
		A3 QW = new A3();

	}

}
