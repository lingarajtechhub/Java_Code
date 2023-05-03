package com.java_string.java;

import java.util.StringTokenizer;

public class Simple {

	public static void main(String[] args) {
		
		StringTokenizer S = new StringTokenizer("T!h!i!s!is!Java!Class.");
		
		while(S.hasMoreTokens())
		{
			System.out.println(S.nextToken("!"));
		}
	}

}
