package com.this_keyword.java;

public class A {
	
	int roll;
	String name;
	
	
	public A(int roll, String name) {
		this();//default constructor
		//refers current class properties
		this.roll = roll;
		this.name = name;
		System.out.println(this.roll+" "+this.name);
		A2 Q = new A2(this);
		A3 Q2 = new A3(this);//passing the reference from one to another
	}

	public A() {
		System.out.println("This Constructor");
		System.out.println(m3());
	}

	A m3() {
		return this;
	}

	public static void main(String[] args) {
		
		A a1 = new A(23,"KEYPAD");
		
		a1.v1(121,"QWERTY");
		
	}



    void v1(int roll ,String name) {
		
		this.roll = roll;
		this.name = name;
		this.v2();//refer to current class method
	}



	void v2() {
		System.out.println("This method called by this reference");
		v3(this);//passing in current class argument.
	}



	void v3(A a2) {
		System.out.println(a2.roll+" "+a2.name);
	}

}
