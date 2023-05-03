package com.java_IO.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FOSS {

	public static void main(String[] args) {
		
		try{
			FileOutputStream fout = new FileOutputStream("F:\\Lingaraj.txt");
			String s = "Hello World.";
			byte b[] = s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Writing Success...");
		}catch(Exception E){
			System.out.println(E);
		}
		

		try{
			
			FileInputStream fis = new FileInputStream("F:\\Lingaraj.txt");
			int i = 0;
			
			while((i = fis.read())!=-1){
				System.out.print((char)i);
			}
			
		}catch(Exception E){
			System.out.println(E);
		}


	}

}
