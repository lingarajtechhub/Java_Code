package com.java_programs.java;


public class Range_Prime {
	
	Range_Prime()
	{
		int count=0,j;
		for(int k=1;k<=1000000;k++)
		{
			for(j=2;j<=k;j++)
			{
				if(k%j==0)
				{
					
					break;
				}
				
			}
			if(k==j)
			{
				System.out.println("Prime Number. "+k);
				count++;
			}
			
		}
		System.out.println("Number Of Primes."+count);
		
	}

	public static void main(String[] args) {
		
		Range_Prime RP = new Range_Prime();
		

	}

}
