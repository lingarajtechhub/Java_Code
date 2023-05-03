package com.serializationObject.java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentObjectSerialization {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fout = new FileOutputStream("F:\\ObjectWrite.txt");
		
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		Student S = new Student(100,"Qwerty");
		
		out.writeObject(S);
		
		out.flush();
		out.close();
		System.out.println("Sucess.....");
	}

}
