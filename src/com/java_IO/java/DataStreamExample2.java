package com.java_IO.java;

import java.io.FileInputStream;
import java.io.IOException;

public class DataStreamExample2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fin = new FileInputStream("F:\\Welcome.txt");
		int i = 0;
		
		while((i=fin.read())!=-1)
		{    
            System.out.print((char)i);    
        }  
		
		fin.close();
	}

}
