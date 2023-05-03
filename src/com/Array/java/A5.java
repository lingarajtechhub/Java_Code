package com.Array.java;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		
		//float a[] = new float[5];
		
		//System.out.println("Enter the array: ");
		
		Scanner Sc = new Scanner(System.in);
		
		/*for(int i=0;i<5;i++)
		{
			a[i] = Sc.nextFloat();
		}
		
		System.out.println("Elements are: ");
		for(int i=0;i<5;i++)
		{
			System.out.println("i= "+i+" "+a[i]);
		}
		*/
		float b[][] = new float[3][3];
		
		System.out.println("Enter the Elements 2d Array: ");
		for(int i=0;i<3;i++) //row input
		{
			for(int j=0;j<3;j++) //column input
			{
				b[i][j] = Sc.nextFloat(); //
			}
		}
		
		System.out.println("Elements 2d Array: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==2&&j==1)
				{
					System.out.print(b[i][j]+" ");
				}
			}
			System.out.println();
		}
		
		

	}

}
