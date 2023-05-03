package com.java_Exception.java;

public class Finallize_java {
	
	public void finalize()
	{
		System.out.println("Objects are Removed.");
	}

	public static void main(String[] args) {
		
		Finallize_java f1 = new Finallize_java();
		Finallize_java f2 = new Finallize_java();
		
		f1 = null;
		f2 = null;
		
		System.gc();

	}

}
