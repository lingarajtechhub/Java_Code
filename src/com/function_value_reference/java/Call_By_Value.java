package com.function_value_reference.java;
public class Call_By_Value {

	int data = 60;

	void change(int data) {
		//this.data = this.data + data;
		data += 50;
	}

	public static void main(String[] args) {

		Call_By_Value CV = new Call_By_Value();

		System.out.println("Before Change: " + CV.data);

		CV.change(400);

		System.out.println("After Change: " + CV.data);
	}

}
