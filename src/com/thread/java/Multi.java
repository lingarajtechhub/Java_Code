package com.thread.java;

public class Multi extends Thread{
	
	public void run()
	{
		System.out.println("Thread is running......");
	}

	public static void main(String[] args) {
		Multi M = new Multi();
		
		M.start();
		
	}
}
