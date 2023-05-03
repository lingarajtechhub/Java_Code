package com.java_awt.java;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ADD_Button{
	
	public ADD_Button() {
		Button b = new Button("Click Me");
		b.setBounds(60, 80, 80, 30);
		Frame F = new Frame();
		F.add(b);
		F.setSize(400, 300);
		F.setLayout(null);
		F.setVisible(true);
		
	}
	 
	public static void main(String[] args) {
			
		ADD_Button AB = new ADD_Button();

	}

}
