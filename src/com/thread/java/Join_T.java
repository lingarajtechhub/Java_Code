package com.thread.java;

public class Join_T extends Thread{
	
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
		
		Join_T J = new Join_T();
		Join_T J2 = new Join_T();
		Join_T J3 = new Join_T();
		
		J.start();
		try{
			J.join(1500);
		}catch(Exception e){System.out.println(e);}
		J2.start();
		try{
			J2.join();
		}catch(Exception e){System.out.println(e);}
		J3.start();

	}

}
