package com.collection.java;

import java.util.ArrayList;
import java.util.Iterator;

public class User_defined_List {

	public static void main(String[] args) {
		
		Student S = new Student(362, "QWERTY", 23);
		Student S2 = new Student(234, "QTERW", 24);
		Student S3 = new Student(245, "DDSSS", 24);
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(S);
		al.add(S2);
		al.add(S3);
		
		Iterator<Student> itr = al.iterator();
		
		while(itr.hasNext())
		{
			Student st = (Student)itr.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
		
	}

}
