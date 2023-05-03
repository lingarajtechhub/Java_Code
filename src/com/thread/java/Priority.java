package com.thread.java;

public class Priority extends Thread{

	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		
		Priority C = new Priority();
		Priority C2 = new Priority();
		Priority C3 = new Priority();
		
		C.setPriority(Thread.MIN_PRIORITY);
		C2.setPriority(Thread.MAX_PRIORITY);
		C3.setPriority(Thread.NORM_PRIORITY);
		
		C.start();
		C2.start();
		C3.start();

	}

}
