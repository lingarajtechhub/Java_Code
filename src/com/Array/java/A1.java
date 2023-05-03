package com.Array.java;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		
		int arr[] = new int[5];
		
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter The values in an array:\n");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Sc.nextInt();
		}
		
		System.out.println("Now Display All Elements:\n");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
