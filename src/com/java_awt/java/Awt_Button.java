package com.java_awt.java;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Awt_Button {
	
	public Awt_Button() {
		Frame f = new Frame();
		Button b = new Button("Addition");
		Button b2 = new Button("Substraction");
		final TextField tf = new TextField();
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a = 3;
				int b = 6;
				tf.setText("Sum= "+(a+b));
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a = 3;
				int b = 6;
				tf.setText("Sub= "+(a-b));
			}
		});
		b.setBounds(30, 50, 80,30);
		b2.setBounds(140,50,80,30);
		tf.setBounds(60, 140, 160, 60);
		f.add(b);
		f.add(b2);
		f.add(tf);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		
		Awt_Button A = new Awt_Button();

	}

}
