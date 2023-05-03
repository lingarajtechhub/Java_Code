package com.collection_framework.java;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHasMapEx {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> LH = new LinkedHashMap<Integer, String>();
		
		LH.put(100, "Apple");
		LH.put(101, "Mango");
		LH.put(102, "Banana");
		
		for(Map.Entry<Integer,String> m:LH.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
