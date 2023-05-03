package com.java_programs.java;

import java.util.Scanner;

public class prime_numbers {
	
	int n=0;
	
	void prime_input()
	{
		System.out.println("Enter the number and check for Prime:");
		Scanner Sc = new Scanner(System.in);
		n = Sc.nextInt();
	}
	
	void Check_Prime()
	{
		int i=2;
		while(n>0)
		{
			if(n%i==0)
			{
				break;
			}
			i++;
		}
		if(n==i)
		{
			System.out.println("Prime Number. "+n);
		}
		else
		{
			System.out.println("Not a Prime. "+n);
		}
	}

	public static void main(String[] args) {
		
		prime_numbers P = new prime_numbers();
		P.prime_input();
		P.Check_Prime();
		
	}

}
