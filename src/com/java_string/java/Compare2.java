package com.java_string.java;

public class Compare2 {

	public static void main(String[] args) {
		String S1 = "Sachin";
		String S2 = "Sachin";
		
		String S3 = new String("Sachin");
		String S4 = "Sourav";
		
		System.out.println(S1.equals(S2));
		System.out.println(S1.equals(S3));
		System.out.println(S1.equals(S4));
		
		System.out.println(S1==S3);
		System.out.println(S1==S4);
		
		System.out.println(S1.substring(0,4));
		
		System.out.println(S1.substring(0,3));
		
		System.out.println(S1.toString());
		
		System.out.println(S1.charAt(0));
		
		System.out.println(S1.equalsIgnoreCase(S4));
		
		System.out.println(S1.toUpperCase());
		
		System.out.println(S1.toLowerCase());

	}

}
