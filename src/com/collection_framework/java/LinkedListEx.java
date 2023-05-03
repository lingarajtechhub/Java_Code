package com.collection_framework.java;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		
		
		LinkedList<String> Li = new LinkedList<String>();
		
		Li.add("Apple");
		Li.add("Mango");
		Li.add("Orange");
		
		System.out.println(Li);
		
		Iterator<String> itr = Li.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for (String str : Li) {
			System.out.println(str);
		}
		
		Li.forEach(a->{
			System.out.println(a);
		});

	}

	

}
