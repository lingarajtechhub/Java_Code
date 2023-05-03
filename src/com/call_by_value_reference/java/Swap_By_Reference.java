package com.call_by_value_reference.java;

public class Swap_By_Reference {
	
	int x=6,y=4;
	
	static void swap(Swap_By_Reference S)
	{
		int z=23;
		int temp = S.x;
		S.x = S.y;
		S.y = temp;
	}

	public static void main(String[] args) {
		
		int z=90;
		
		Swap_By_Reference S = new Swap_By_Reference();
		
		System.out.println("Before Swap: "+S.x+" "+S.y);
		
		swap(S);
		
		System.out.println("After Swap: "+S.x+" "+S.y);

	} 

}
