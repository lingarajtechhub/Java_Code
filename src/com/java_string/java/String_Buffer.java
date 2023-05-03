package com.java_string.java;

public class String_Buffer {

	public static void main(String[] args) {
		
		//Mutable
		StringBuffer Sb = new StringBuffer("Hello");
		
		Sb.append("World");
		System.out.println(Sb);
		
		Sb.reverse();
		System.out.println(Sb);
		
		//Immutable
		String S = "ASDF";
		
	    S.concat("World");
		
		System.out.println(S);

	}

}
