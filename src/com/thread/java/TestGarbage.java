package com.thread.java;

public class TestGarbage {
	
	public void finalize()
	{
		System.out.println("Object is collected By Garbage.");
	}

	public static void main(String[] args) {
		
		TestGarbage S1 = new TestGarbage();
		TestGarbage S2 = new TestGarbage();
		S1 = null;
		S2 = null;
		
		System.gc();

	}

}
