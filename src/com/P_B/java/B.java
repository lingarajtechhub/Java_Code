package com.P_B.java;

import com.P_A.java.A;

public class B extends A{

	public static void main(String[] args) {
		
		B b = new B();
		
		System.out.println(b.x);
		
		b.m();
		
		System.out.println(b.add());

		
		/*A A2 = new A();
		
		System.out.println(A2.x);
		
		A2.m();
		
		System.out.println(A2.add());
		*/
	}

}
