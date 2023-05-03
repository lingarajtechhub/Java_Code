package com.thread.java;

public class Current_Java extends Thread{
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
		Current_Java C = new Current_Java();
		Current_Java C2 = new Current_Java();
		Current_Java C3 = new Current_Java();
		
		C.start();
		C2.start();
		C3.start();

	}

}
