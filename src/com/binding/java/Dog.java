package com.binding.java;

public class Dog{
	
	/*
	 * private, final, static method =  static binding
	 * 
	 */
	
	private void eat()
	{
		System.out.println("dog is eating...");
	}

	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		
		d1.eat();

	}

}
