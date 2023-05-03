package com.Array.java;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		int search_element = 0;
		Scanner Sc = new Scanner(System.in);
//		
		int a[] = new int[50]; //1-D Array
		
		//float f[] = new float[40];//1-D Array float declaration  
		
		System.out.println("Enter the size of array:");
		int m = Sc.nextInt();//Input array size
		
		System.out.println("Enter the elements in array: ");
		for(int i=0;i<m;i++)
		{
			a[i] = Sc.nextInt();
		}

		System.out.println("Elements Are:");
		for(int i=0;i<m;i++)
		{
			System.out.println("i="+i+" index => "+a[i]);
		}
		
		
		System.out.println("Enter the element to search: ");
		search_element = Sc.nextInt();
		
		for(int i=0;i<m;i++)
		{
			if(a[i]==search_element)
			{
				System.out.println("Element is found "+(i+1)+" location.");
			}
			else
			{
				System.out.println("Element is absent.");
			}
		}
		
		Sc.close();
		
	}

}
