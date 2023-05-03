package com.call_by_value_reference.java;

public class Swap_By_Value {
	
	int x=6,y=4;
	
	static void swap(int x,int y)
	{
		int temp = x;
		x = y;
		y = temp;
	}

	public static void main(String[] args) {
		
		Swap_By_Value S = new Swap_By_Value();
		
		System.out.println("Before Swap: "+S.x+" "+S.y);
		
		swap(6,4);
		
		System.out.println("After Swap: "+S.x+" "+S.y);

	}

}
