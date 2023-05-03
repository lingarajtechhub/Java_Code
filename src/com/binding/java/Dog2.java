package com.binding.java;

public class Dog2 extends Animal{
	
	void eat()
	{
		System.out.println("dog is eating...");
	}

	public static void main(String[] args) {
		
		Animal A = new Dog2(); //Upcasting
		
		A.eat();
		
		//System.out.println(A instanceof Dog2);
		
		//Dog2 D = (Dog2)new Animal();

		//System.out.println(D instanceof Dog2);
	}

}
