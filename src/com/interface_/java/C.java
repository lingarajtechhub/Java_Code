package com.interface_.java;

public class C implements A,B{
	
	public static void main(String[] args) {
		
		C c = new C();
		c.d1();c.d2();c.d3();
	}

	public void d2() {
		
		System.out.println("This is d1. ");
	}

	public void d1() {
		System.out.println("This is d2. ");
		
	}

	public void d3() {
		System.out.println("This is d3. ");
		
	}

}
