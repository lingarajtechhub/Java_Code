package com.java_IO.java;

import java.io.FileInputStream;

public class FISReadAllCharacters {

	public static void main(String[] args) {
		
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
