package com.collection.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Array_List {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Shankar");
		System.out.println(al);
		
		Iterator<String> itr = al.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		for(String ag:al){
			System.out.println(ag);
		}
		
		List<Integer> li = new LinkedList<Integer>();
		li.add(534);
		li.add(645);
		System.out.println(li);
		
		for(Integer I:li) {
			System.out.println(I);
		}
	}

}
