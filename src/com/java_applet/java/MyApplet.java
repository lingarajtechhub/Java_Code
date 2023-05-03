package com.java_applet.java;

import java.applet.Applet;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class MyApplet extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("Welcome", 150, 150);
	}

}
