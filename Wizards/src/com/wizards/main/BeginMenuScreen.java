package com.wizards.main;

import java.awt.Color;
import java.awt.Graphics;

public class BeginMenuScreen {

	
	//TYLER - I would do this with and integer called gamemode and use a switch and case
	public boolean teamDeathmatch = false;
	public boolean endlessHorde = false;
	public boolean freeForAll = false;
	public boolean horde = false;
	
	public void paint(Graphics g) {

		// BACKGROUND
		g.setColor(new Color(244, 231, 129));
		g.fillRect(0, 0, Main.WIDTH + 10, Main.HEIGHT + 10);

	}

}
