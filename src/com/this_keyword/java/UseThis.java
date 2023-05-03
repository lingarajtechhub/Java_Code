package com.this_keyword.java;

public class UseThis {
	
	int x;//property

	UseThis()
	{
		System.out.println("This constructor called by 'this()' constructor.");
	}
	
	public UseThis(int x) {
		this();//Calling the this() default constructor of class and should be the first statement.
		this.x = x;//this is refers to the current class props.
		this.method();//this is refers to the current class methods.
		method(this);//passing this as current class reference type.
		System.out.println(methodReturn());
		A4 a4 = new A4(this);//passing this as reference from one class to another
	}

	UseThis methodReturn() {
		return this; //return 'this' as current class reference on function call
	}

	void method(UseThis useThis) {
		System.out.println("Here 'useThis' is  a reference of UseThis Class.");
		
	}

	void method() {
		
		System.out.println("this method is called by 'this' reference type.");
	}

	public static void main(String[] args) {
		
		UseThis ut = new UseThis(45);

	}

}
