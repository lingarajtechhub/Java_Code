package com.java_string.java;

public class W {

	public static void main(String[] args) {
		
		String S = "Welcome To Java"; //String Literal
		
		char ch[]={'a','b','c','d'}; 
		
		String S2 = new String(ch) ; //Wrapper
		
		String S3 = new String("Welcome");
		
		System.out.println(S+" "+S2+" "+S3);
		
		//S.concat("Nimbletech"); //Immutable
		
		String S4 = S.concat("Nimbletech");//Mutable
		
		System.out.println(S4.substring(0, 4));
		
	}

}
