package com.java_string.java;

public class String_Class {

	public static void main(String[] args) {
		
		String  S = "Cat";
		
		String S2 = "Dog";//literal
		
		System.out.println(S.equals(S2));//both are belongs same category why because of content match

		
		String s3 = new String("Dog");//object
		
		System.out.println(S2==s3);
		
		System.out.println(S2.equals(s3));//content comparison
		
	}

}
