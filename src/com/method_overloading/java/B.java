package com.method_overloading.java;

public class B {

	static int m1(int x,int y){
		return x+y;
	}
	
	static double m1(double x,double y, double z){
		return x+y+z;
	}
	public static void main(String[] args) {
		
		System.out.println(B.m1(2,3));
		System.out.println(B.m1(2.3,3.4,5.6));

	}

}
