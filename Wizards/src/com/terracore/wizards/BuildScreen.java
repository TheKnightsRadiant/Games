package com.terracore.wizards;

import java.awt.Color;
import java.awt.Graphics;

public class BuildScreen {
	
	public void paint(Graphics g){
		g.setColor(new Color(244, 231, 129));
		g.fillRect(0, 0, Wizards.WIDTH , Wizards.HEIGHT);
	}
	
}
