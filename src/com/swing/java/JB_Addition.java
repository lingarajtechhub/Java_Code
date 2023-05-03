package com.swing.java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JB_Addition {
	
	public JB_Addition() {
		
		JFrame JF = new JFrame("Addition of Number.");
		JButton JB = new JButton("Addition Of 2");
		final JLabel JL = new JLabel();
		final JTextField JT1 = new JTextField();
		final JTextField JT2 = new JTextField();
		JB.setBounds(50, 100, 180, 30);
		JT1.setBounds(50, 150, 170, 40);
		JT2.setBounds(50, 200, 170, 40);
		JL.setBounds(50, 240, 170, 40);
		JB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(JT1.getText());
				int y = Integer.parseInt(JT2.getText());
				JL.setText("Sum= "+(x+y));
			}
		});
		JF.add(JB);
		JF.add(JT1);
		JF.add(JT2);
		JF.add(JL);
		JF.setSize(400,400);
		JF.setLayout(null);
		JF.setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new JB_Addition();

	}

}
