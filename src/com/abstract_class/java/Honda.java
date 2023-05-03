package com.abstract_class.java;

public class Honda extends Bike{

	public static void main(String[] args) {
		Honda H = new Honda();
		H.run();
		H.gear();

	}

	@Override
	void run() {
		System.out.println("Running safely.");
		
	}

	@Override
	void gear() 
		{
			System.out.println("Bike Gear");
		}

	

}
