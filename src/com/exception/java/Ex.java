package com.exception.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		int a = 0,b = 0,c=0, d;
		
		System.out.println("Enter the value of a and b:");
		
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			a = Integer.parseInt(Br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
		try {
			b = Integer.parseInt(Br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		c = Integer.parseInt(Br.readLine());
		
		d =a+b+c;
		
		System.out.println("Sum: "+c);
		
	}

}
