package com.java_Exception.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class input2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int x = 0 ,y =  0;
		
		System.out.println("enter the value of x and y: ");
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		x = Integer.parseInt(br.readLine());
		y = Integer.parseInt(br.readLine());
		
        
        System.out.println(x+y);
        
        int[] a = new int[5];
        
        
        try {
        	a[5] = 30;
        	System.out.println(a[5]);
        }catch (ArrayIndexOutOfBoundsException e) {
        	System.out.println(e);
		}
        
        
      }

}
