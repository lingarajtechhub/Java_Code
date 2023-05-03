package com.method_overloading.java;

public class A {
	
	static int m1(int x){
		return x;
	}
	
	
	static int m1(int x,int y, int z){
		return x+y+z;
	}
	
	static float m1(int x, float y) {
		return x+y;
		
	}
	
	public static char m1(char c) {
		return c;
	}

	public static void main(String[] args) {
		
		System.out.println(m1(2));
		System.out.println(m1(2,3,4));
		System.out.println(m1('c'));
		System.out.println(m1(2,4.5f));
	}

	

	
}
