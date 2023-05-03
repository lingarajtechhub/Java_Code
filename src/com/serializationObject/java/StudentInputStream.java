package com.serializationObject.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentInputStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ObjectInputStream OI = new ObjectInputStream(new FileInputStream("F:\\ObjectWrite.txt"));
		
		Student s = (Student) OI.readObject();
		
		System.out.println(s.roll+" "+s.name);
		
		OI.close();
		
	}

}
