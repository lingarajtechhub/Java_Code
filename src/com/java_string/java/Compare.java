package com.java_string.java;

public class Compare {

	public static void main(String[] args) {
		
		/*
		 * .equals() content inside object comparison
		 *  ==  object comparison
		 * 
		 */
		
		String S = "Qwerty";
		
		String S2 = "Qwerty1";
		
		String S3 = new String("Qwerty");
		
		String S4 = "NImbletech";
		
		System.out.println(S.equals(S2)); //Content level Comparison
		
	
		System.out.println(S.equals(S3));
		
			
		System.out.println(S.equals(S4));
		
		System.out.println(S2.equals(S3));
		/*
		System.out.println(S2==S3);//Reference level comparison
		
		System.out.println(S==S4);
		
		System.out.println(S.compareTo(S3));
		
		System.out.println(S2.compareTo(S3));
		
		
		String S5 = "Hello"+"World";
		
		System.out.println(S5);
		
		
		String S6 = "Qwerty";
		
		String S7 = "Keypad";
		
		String S8 = S6.concat(S7);
		
		System.out.println(S8);
		
		System.out.println(S.substring(0,4));
		
		System.out.println(S.substring(0,8));
		
		System.out.println(S.toString());
		
		System.out.println(S.charAt(0));
		
		System.out.println(S.equalsIgnoreCase(S4));
		
		System.out.println(S.toUpperCase());
		
		System.out.println(S.toLowerCase());
		
		String S9 = "  Hello World  ";
		
		System.out.println(S9.trim());
		
		System.out.println(S.startsWith("N"));
		
		System.out.println(S.endsWith("ch"));
		
		System.out.println(S.length());
		
		String S10 = S.intern();//String Copy
		
		System.out.println(S10);
		
		int x = 10;
		
		String S11 = String.valueOf(x);
		
		System.out.println(S11);
		
		System.out.println(S.replace("Institute", "Organisation"));
     */
	}

}
