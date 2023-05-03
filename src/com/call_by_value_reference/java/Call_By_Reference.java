package com.call_by_value_reference.java;

public class Call_By_Reference {

	int data = 60;
	
	static void change(Call_By_Reference D)
	{
		 D.data = D.data+30;
	}
	
	public static void main(String[] args) {
		
		Call_By_Reference D = new Call_By_Reference();
		System.out.println("Before Change: " + D.data);

		change(D);

		System.out.println("After Change: " + D.data);
		
	}

}
