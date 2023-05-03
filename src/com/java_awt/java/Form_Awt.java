package com.java_awt.java;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.TextField;


public class Form_Awt {
	
public Form_Awt() {
		
		Frame F = new Frame("Student form");
		MenuBar Mb = new MenuBar();
		
		Label L = new Label("Roll");
		Label L2 = new Label("Name");
		Label L3 = new Label("Age");
		
		Menu M = new Menu("Name");
		Menu m2 = new Menu("Age");
		Menu m3 = new Menu("Gender");
		
		MenuItem mt1 = new MenuItem("Male");
		MenuItem mt2 = new MenuItem("Female");
		
		TextField b = new TextField();
		TextField b2 = new TextField();
		TextField b3 = new TextField();
		TextArea a = new TextArea();
		
		b.setBounds(140, 180, 300, 50); 
		b2.setBounds(140, 280, 300, 50); 
		b3.setBounds(140, 380, 300, 50); 
		m3.add(mt1);
		m3.add(mt2);
		Mb.add(M);
		Mb.add(m2);
		Mb.add(m3);
		L.setBounds(50, 150, 100, 100);
		L2.setBounds(50, 250, 100, 100);
		L3.setBounds(50, 350, 100, 100);
		
		F.add(L);
		F.add(L2);
		F.add(L3);
		
		F.add(b);
		F.add(b2);
		F.add(b3);
		F.setSize(300, 300);
		F.setMenuBar(Mb);
		F.setLayout(null);
		F.setVisible(true);
		
		}
		
		public static void main(String[] args){
			
			Form_Awt F = new Form_Awt();
		
			
		}
	
	}

