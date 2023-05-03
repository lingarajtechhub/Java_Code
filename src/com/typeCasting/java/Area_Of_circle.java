package com.typeCasting.java;

import java.util.Scanner;

public class Area_Of_circle {

	public static void main(String[] args) {
		
		//float area;
		int b,h;
		
		//System.out.println("Enter the base and height:");
		Scanner Sc = new Scanner(System.in);
		b = Sc.nextInt();
		h = Sc.nextInt();
		//area = (float)1/2 *b *h;
		//System.out.println("Area= "+area);
		
		System.out.println("==========Premitive To Wrapper=========");
		Integer I = new Integer(b);
		System.out.println(I);
		
		Integer I2 = Integer.valueOf(b);//Converting int to integer explicitly
		Integer b2 = I2;//internally => autoBoxing
		System.out.println(b2);
		System.out.println("===== Wrapper To Premitive===========");
		
		Integer a= new Integer(h);
		System.out.println(a);
		int i = a.intValue();//Integer to int explicitly
		int j = i; //internally => UnBoxing
		System.out.println(j);

	}

}
