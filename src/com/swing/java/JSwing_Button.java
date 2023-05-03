package com.swing.java;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JSwing_Button {
	
	public JSwing_Button() {
		JFrame JF = new JFrame("This is Button Frame");
		JButton JB = new JButton("Welcome JButton");
		JB.setBounds(50, 100, 95, 30);
		JF.add(JB);
		JF.setSize(400,400);
		JF.setLayout(null);
		JF.setVisible(true);
	}

	public static void main(String[] args) {
		
		new JSwing_Button();

	}

}
