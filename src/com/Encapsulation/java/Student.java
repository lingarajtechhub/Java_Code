package com.Encapsulation.java;

public class Student {
	
	private int roll;
	private String name;
	private String Address;
	private int age;
	
	
	public int getRoll() { //S.getRoll()
		return roll;
	}
	public void setRoll(int roll) { //S.setRoll(213)
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
