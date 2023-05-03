package com.thread.java;

public class Multi2 implements Runnable{
	
	public void run()
	{
		System.out.println("thread is running....");
	}

	public static void main(String[] args) {
	
		Multi2 M = new Multi2();
		
		Thread T = new Thread(M);
		
		T.start();
	}
}
