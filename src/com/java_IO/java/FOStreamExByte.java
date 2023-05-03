package com.java_IO.java;

import java.io.FileOutputStream;

public class FOStreamExByte {

	public static void main(String[] args) {
		
		try{
			FileOutputStream fout = new FileOutputStream("F:\\Lingaraj.txt");
			fout.write(78);
			fout.close();
			System.out.println("Success...");
		}catch(Exception E){
			System.out.println(E);
		}

	}

}
