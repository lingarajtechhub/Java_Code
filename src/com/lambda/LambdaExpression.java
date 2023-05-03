package com.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExpression {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(100);
		arr.add(101);
		arr.add(102);
		arr.add(103);
		arr.add(104);
		
		arr.forEach((n)->{
			System.out.println(n);
		});
		
		
		ArrayList<String> arr2 = new ArrayList<String>();
		
		arr2.add("Apple");
		arr2.add("Mango");
		arr2.add("Orange");
		arr2.add("Pineapple");
		arr2.add("Grapes");
		
		arr2.forEach((n) -> {
			System.out.println(n);
		});
		
		//Consumer Interface To Store Lambda Expression as a Variable.
		Consumer<String> m = (n) -> { System.out.println(n); };
		arr2.forEach(m);
		
	}

}
