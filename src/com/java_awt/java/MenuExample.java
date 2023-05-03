package com.java_awt.java;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuExample {
	
      MenuExample() {
    	  
		Frame F = new Frame("Menu and MenuItem Example");
		
		MenuBar Mb = new MenuBar();
		
		Menu m = new Menu("File");
		Menu m2 = new Menu("Edit");
		Menu m3 = new Menu("Source");
		
		MenuItem Mt1 = new MenuItem("New");
		MenuItem Mt3 = new MenuItem("Close");
		MenuItem Mt4 = new MenuItem("Close All...");
		MenuItem Mt7 = new MenuItem("Undo Typing");
		MenuItem Mt8 = new MenuItem("Cut");
		MenuItem Mt9 = new MenuItem("Copy");
		MenuItem Mt10 = new MenuItem("Paste");
		
		Menu submenu = new Menu("Open Prospective");
		Menu submenu2 = new Menu("Open File");

		m.add(Mt1);
		m.add(submenu2);
		m.add(Mt3);
		m.add(Mt4);
		m2.add(Mt7);
		m2.add(Mt8);
		
		MenuItem Mt5 = new MenuItem("Debug");
		MenuItem Mt6 = new MenuItem("Java Browsing");
		submenu.add(Mt5);
		submenu.add(Mt6);
		
		submenu2.add(Mt9);
		
		m.add(submenu);
		Mb.add(m);
		Mb.add(m2);
		Mb.add(m3);
		F.setMenuBar(Mb);
		F.setSize(400,400);
		F.setLayout(null);
		F.setVisible(true);
		
		
		
	}


	public static void main(String[] args) {
		
		new MenuExample();
	}

}
