package com.java_string.java;

public class S {

	public static void main(String[] args) {
		
		char[] ch= {'a','b','c','d'}; //character array
		
		String s2 = new String(ch); //char => to string object
		
		System.out.println(s2);
		
		String str = "Qwerty"; //literal
		str.concat(s2);//immutable
		System.out.println(str);
		
		
		StringBuffer SB = new StringBuffer("Hello");
		
		/*
		SB.append("World");
		
		System.out.println(SB);
		
		SB.insert(0, 'Q');
		
		System.out.println(SB);
		
		SB.replace(1, 3, "QWE");
		
		System.out.println(SB);
		
		SB.delete(0, 4);
		
		System.out.println(SB);
		
		System.out.println(SB.reverse());
		
		StringBuffer SB2 = new StringBuffer();
		
		System.out.println(SB2.capacity());
		
		SB2.append("Hello");
		
		System.out.println(SB2.capacity());
		
		SB2.append("Nimbletech Organisation Institute");
		
		System.out.println(SB2.capacity());
		*/

	}

}
