package com.java_awt.java;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowClose extends Frame{
	
	WindowClose(){  
        addWindowListener(new WindowAdapter() {
        	public void windowClosing(WindowEvent e) {  
                dispose();  
            } 
		});
             
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
    }  

	public static void main(String[] args) {
		
		new WindowClose();

	}

}
