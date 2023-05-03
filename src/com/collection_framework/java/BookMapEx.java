package com.collection_framework.java;

import java.util.LinkedHashMap;
import java.util.Map;

public class BookMapEx {

	public static void main(String[] args) {
		
		Book B1 = new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
		Book B2 = new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		Book B3 = new Book(103,"Operating System","Galvin","Wiley",6);
		
		LinkedHashMap<Integer,Book> map = new LinkedHashMap<Integer,Book>();
		
		map.put(1, B1);
		map.put(2, B2);
		map.put(3, B3);
		
		for(Map.Entry<Integer, Book> entry:map.entrySet()) {
			int k = entry.getKey();//key access
			Book b = (Book)entry.getValue();//value access
			System.out.println("Book Details: "+k);
			System.out.println(b.Bk_id+" "+b.Bk_name+" "+b.Bk_author+" "+b.Bk_publisher+" "+b.Bk_quantity);
		}
				
	}

}
