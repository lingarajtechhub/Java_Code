package com.method_overriding.java;

public class Test {

	public static void main(String[] args) {
		
		SBI S = new SBI();
		ICICI I = new ICICI();
		AXIS A = new AXIS();
		
		System.out.println(S.getRateOfInterest());
		
		System.out.println(I.getRateOfInterest());
		
		System.out.println(A.getRateOfInterest());

	}

}
