package com.final_value_change.java;

import java.util.Scanner;

public class Q {
	
	final static int x = 34;
	
	public Q() {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the value of x:");
		//x = Sc.nextInt();
	}
	
	final void m()
	{
		System.out.println("This is final Method.");
	}

	public static void main(String[] args) {
		Q q = new Q();
		
	}

}
