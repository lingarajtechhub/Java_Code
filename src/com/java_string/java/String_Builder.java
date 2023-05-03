package com.java_string.java;

public class String_Builder {

	public static void main(String[] args) {
	
		/*
		StringBuilder Sb = new StringBuilder(" Welcome ");
		Sb.append(" NimbleTech ");
		System.out.println(Sb);
		
		Sb.insert(16, "QWERTY");
		
		System.out.println(Sb);
		*/
		
		
		StringBuilder Sb = new StringBuilder();
		
		System.out.println(Sb.capacity());
		
		Sb.append("Welcome");
		
		System.out.println(Sb.capacity());
		
		Sb.append("QWERTY KEYPAD");
		
		System.out.println(Sb.capacity());
		
		Sb.append("ASDF");
		
		System.out.println(Sb.capacity());
		
		Sb.append("EDFGTH");
		
		System.out.println(Sb.capacity());
		
		Sb.append("SDCVB");
		
		System.out.println(Sb.capacity());
		
		Sb.append("SDCVB12234");
		
		System.out.println(Sb.capacity());
		
		Sb.append("SDCVB12234");
		
		System.out.println(Sb.capacity());
		
		Sb.append("SDCVB12234");
		
		System.out.println(Sb.capacity());
		
		Sb.append("SDCVB12234");
		
		System.out.println(Sb.capacity());
	}
	
}
