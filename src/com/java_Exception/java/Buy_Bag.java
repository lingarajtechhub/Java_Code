package com.java_Exception.java;

public class Buy_Bag {

	public static void main(String[] args) {
		
		try {
			validate_price_bag(500);
		} catch (price_is_not_validException e) {
			System.out.println(e);
		}

	}

	private static void validate_price_bag(int price) throws price_is_not_validException {
		
		if(price<=600)
		{
			System.out.println("You Found Your Bag In Valid Price.");
		}
		else
		{
			throw new price_is_not_validException("Not Valid");
		}
		
	}

}
