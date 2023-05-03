package com.aggregation.java;

public class Employee {
	
	int id;
	String name;
	Address address; //Aggregation => HAS_A
	
	public Employee(int id,String name,Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void display(){
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}

	public static void main(String[] args) {
		Address A1 = new Address("BBSR", "ODISHA", "INDIA");
		Address A2 = new Address("BOKARO", "JHARKHAND", "INDIA");
			
		Employee E1 = new Employee(123, "QWERTY", A1);
		Employee E2 = new Employee(546, "Keypad", A2);
		
		System.out.println("========First Employee========");
		E1.display();
		System.out.println("========Second Employee========");
		E2.display();
	}

}
