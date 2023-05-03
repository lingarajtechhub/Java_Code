package com.java_IO.java;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamExample {
	
	public static void main(String[] args) throws IOException{
		
		FileOutputStream fout = new FileOutputStream("F:\\Welcome.txt");
		//FileOutputStream fout2 = new FileOutputStream("F:\\Welcome2.txt");
		
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		bout.write(65);
		bout.writeTo(fout);
		//bout.writeTo(fout2);
		bout.flush();
		bout.close();
		System.out.println("Success...");
	}

}
