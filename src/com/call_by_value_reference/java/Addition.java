package com.call_by_value_reference.java;

public class Addition {
	
	int a=2,b = 3;
	
	void addition_val(Addition add)
	{
		int c = add.a+2 + add.b;
		System.out.println(c);
		System.out.println(add.a+2);
	}

	public static void main(String[] args) {
		
		Addition ad = new Addition();
		
		ad.addition_val(ad);
		

	}

}
