package com.call_by_value_reference.java;

public class Call_By_Value {
	
	int data = 90;
	
	void change(int data)
	{
		data = data+60;
	}

	public static void main(String[] args) {
		
			Call_By_Value C = new Call_By_Value();
			C.change(12);
			System.out.println(C.data);
	}

}
