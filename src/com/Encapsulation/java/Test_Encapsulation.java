package com.Encapsulation.java;

public class Test_Encapsulation {
	
	public static void main(String[] args) {
		
		Student S = new Student();
		
		int age;
		
		S.setAddress("QWERTY-123");
		S.setName("QWERTY");
		S.setRoll(21);
		S.setAge(12);

		System.out.println(S.getRoll());
		System.out.println(S.getName());
		System.out.println(S.getAddress());	
		
		//System.out.println(S.getAge());
		
		age = S.getAge();
		System.out.println(age);
	}
}
