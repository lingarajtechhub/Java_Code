package com.Array.java;

import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		
		int a[][][] = new int[2][2][3];
		
		System.out.println("Enter the elements in array: ");
		Scanner Sc = new Scanner(System.in);
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				for(int k=0;k<3;k++)
				{
					a[i][j][k] = Sc.nextInt();
				}
			}
			
		}

		System.out.println("Elements Are:");
		
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print("{");
				for(int k=0;k<3;k++)
				{
					
					System.out.print(a[i][j][k]+",");
					
				}
				System.out.print("},");
			}
			System.out.println();
		}

	}

}
