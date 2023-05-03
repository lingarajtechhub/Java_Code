package com.java_IO.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadString {

	public static void main(String[] args) throws NullPointerException, Exception{
		
		InputStreamReader I = new InputStreamReader(System.in);
		BufferedReader Br = new BufferedReader(I);
		System.out.println("Enter the 2 numbers: ");
		int a = Integer.parseInt(Br.readLine());
		int b = Integer.parseInt(Br.readLine());
		
		System.out.println(a+b);

	}

}
