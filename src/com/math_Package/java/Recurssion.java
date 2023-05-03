package com.math_Package.java;

import java.util.Scanner;

public class Recurssion {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int x = Sc.nextInt();

		System.out.println(factorial_recurrsion(x));
	}

	private static int factorial_recurrsion(int x) {
		if(x == 0) {
			return 1;
		}
		else {
			return x*factorial_recurrsion(x-1);
		}
	}

}
