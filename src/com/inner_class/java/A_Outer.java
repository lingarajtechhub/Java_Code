package com.inner_class.java;

public class A_Outer {
	
	private int x  = 30;
	
	public class A_Inner{
		
		void msg(){
			System.out.println("Data: "+x);
		}
		
	}
	
	public static void main(String[] args){ 
		A_Outer AO = new A_Outer();
		A_Outer.A_Inner AI = AO.new A_Inner();
		AI.msg();
	}

}
