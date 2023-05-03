package com.swing.java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JButton_Action {

	public JButton_Action() {
		JFrame JF = new JFrame("Button ActionListener");
		
		JButton JB = new JButton("Click Me");
		final JTextField JT = new JTextField();
		JB.setBounds(50, 100, 95, 30);
		JT.setBounds(50, 180, 195, 30);
		JB.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JT.setText("Welcome To NimbleTech.");
				
			}
		});
		JF.add(JB);
		JF.add(JT);
		JF.setSize(400,400);
		JF.setLayout(null);
		JF.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new JButton_Action();
	}

}
