package com.package_2.java;

import java.util.Scanner;

import com.package_1.java.A;
import com.package_1.java.D;
import com.package_1.java.W;

public class B extends W{
	
	void display()
	{
		System.out.println(e);
		
		Scanner sc = new Scanner(System.in);
	}

	
	public static void main(String[] args) {
		
		A a = new A();
		System.out.println(a.getX());
		
		D d = new D();
		System.out.println(d.getZ());
		
		B b = new B();
		b.display();

	}

}
