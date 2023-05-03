package com.polymorphism.java;

public class Hero extends Bike{
	
	void run()
	{
		System.out.println("Running safely with 50km/hr");
	}

	public static void main(String[] args) {
		
		Bike b = new Hero();//Upcasting
		b.run();

	}

}
