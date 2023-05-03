package com.collection.java;

import java.util.Iterator;
import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		
		Stack<String> st = new Stack<String>();
		
		st.push("Apple");
		st.push("Mango");
		st.push("Orange");
		
		System.out.println(st.pop());
		System.out.println("=======After Pop=======");
		System.out.println(st.pop());
		System.out.println("=======After Pop=======");
		System.out.println(st.pop());
		
		
//		Iterator<String> itr = st.iterator();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}

	}

}
