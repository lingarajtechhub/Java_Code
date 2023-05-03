package com.java_awt.java;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button_Oclick {
	
	public Button_Oclick() {
		
		Frame F = new Frame();
		Button B = new Button("Hi");
		B.setBounds(30, 50, 80,30);
		
		final TextField TF = new TextField();
		TF.setBounds(30, 150, 160, 80);
		F.add(TF);
		F.add(B);
		B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		F.setSize(300, 300);
		F.setLayout(null);
		F.setVisible(true);
	}

	public static void main(String[] args) {
		
	   new Button_Oclick();

	}

}
