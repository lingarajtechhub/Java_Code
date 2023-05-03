package com.thread.java;

public class Test_daemon extends Thread{
	
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Deamon Thread Work.");
		}
		else
		{
			System.out.println("USer Thread Work.");
		}
	}
	

	public static void main(String[] args) {
		
		Test_daemon T1 = new Test_daemon();
		Test_daemon T2 = new Test_daemon();
		Test_daemon T3 = new Test_daemon();
		
		T1.setDaemon(true);
		
		T1.start();
		T2.start();
		T3.start();

	}

}
