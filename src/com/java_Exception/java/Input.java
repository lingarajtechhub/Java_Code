package com.java_Exception.java;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
	
	public static void main(String[] args) {
		
		InputStreamReader I = new InputStreamReader(System.in);
		
		BufferedReader Br = new BufferedReader(I);
		
		int x = 0,y = 0,z;
		
		System.out.println("Enter the value of x,y:");
		
		try {
			x = Integer.parseInt(Br.readLine());
			try{
				System.out.println(x/0);
			}catch(Exception e)
			{
			System.out.println(e);	
			}
			finally
			{
				System.out.println("This statement always executed.");
			}
		} catch (NumberFormatException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		
		try {
			y = Integer.parseInt(Br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		z = x+y;
		System.out.println("z="+z);
	}

}
