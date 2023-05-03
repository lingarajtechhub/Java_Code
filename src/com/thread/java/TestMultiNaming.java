package com.thread.java;

public class TestMultiNaming extends Thread{
	
	public void run()
	{
		System.out.println("Thread is running....");
	}

	public static void main(String[] args) {
		
		TestMultiNaming T1 = new TestMultiNaming();
		TestMultiNaming T2 = new TestMultiNaming();
		
		System.out.println("Name of T1: "+T1.getName());
		System.out.println("Name of T2: "+T2.getName());
		
		T1.setName("Lingaraj Senapati");
		System.out.println("After setting name: "+T1.getName());
		
		T1.start();
		T2.start();
		
	}

}
