package com.collection_framework.java;

import java.util.Iterator;
import java.util.LinkedList;

public class EmployeeCollection {

	public static void main(String[] args) {
		
		Employee E1 = new Employee(100,"Rohan","QW-RT/4");
		Employee E2 = new Employee(101,"Gopal","QW-9/4");
		Employee E3 = new Employee(102,"RAM","QRT-67/3");
		
		
		LinkedList<Employee> L = new LinkedList<Employee>(); 
		
		L.add(E1);
		L.add(E2);
		L.add(E3);
		
//		L.forEach(a->{
//			System.out.println(a);
//		});
		
		Iterator<Employee> itr = L.iterator();
		
		while(itr.hasNext())
		{
			Employee E = (Employee)itr.next();
			System.out.println(E.EmpId+" "+E.EmpName+" "+E.EmpAddr);
		}

	}

}
