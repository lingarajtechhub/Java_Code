package com.thread.java;

public class Sleep_T extends Thread{
	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
	
		Sleep_T S= new Sleep_T();
		Sleep_T S2 = new Sleep_T();
		
		S.start();

		S2.start();

	}

}
