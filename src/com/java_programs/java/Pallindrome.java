package com.java_programs.java;

import java.util.Scanner;

public class Pallindrome {
	
	int rev=0,m,n,a;
	
	void take_input()
	{
		System.out.println("Enter the number: ");
		Scanner Sc = new Scanner(System.in);
		n = Sc.nextInt();
	}
	
	void pall_reverse()
	{
		m=n;
		while(n!=0)
		{
			a = n % 10;
			rev = rev * 10 + a;
			n = n / 10;
		}
		
		if(rev == m)
		{
			System.out.println("Pallindrome Number: "+rev);
		}
		else
		{
			System.out.println("Not Pallindrome Number: "+rev);
		}
	}
	
	public static void main(String[] args){
		Pallindrome P = new Pallindrome();
		P.take_input();
		P.pall_reverse();
	}

}
