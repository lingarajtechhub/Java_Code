package com.java_awt.java;

import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class Label_AWT {
	
	public Label_AWT() {

		Frame f= new Frame("Label Example");  
	    Label l1,l2;  
	    l1=new Label("First Label.");  
	    l1.setBounds(50,100, 100,30);  
	    l2=new Label("Second Label.");  
	    l2.setBounds(50,150, 100,30);
	    TextField T1 = new TextField("This is a text field");
	    TextField T2 = new TextField("This is a text field2");
	    T1.setBounds(200, 100, 200, 30);
	    T2.setBounds(200, 150, 200, 30);
	    f.add(l1); f.add(l2);  
	    f.add(T1); f.add(T2);
	    f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true);  
	}

	public static void main(String[] args) {
		new Label_AWT();
	}

}
