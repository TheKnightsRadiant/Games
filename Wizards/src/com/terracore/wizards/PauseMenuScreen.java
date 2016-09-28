package com.terracore.wizards;

import java.awt.*;

import com.terracore.handlers.*;

public class PauseMenuScreen {

	//Variables
	public static int startY;
	public static int y = startY;
	public static int scrollVel = 20;
	
	void drawString(Graphics g, String text, int x, int y) {
		for (String line : text.split("\n"))
			g.drawString(line, x, y += g.getFontMetrics().getHeight());

	}
	
	//Paint Method
	public void paint(Graphics g) {
		
		y+=scrollVel;
		if (y >= 10) {
			scrollVel = 0;
			HordeKeyHandler.menuScreen = true;
		}
		if (y <= -400) {
			scrollVel = 0;
			HordeKeyHandler.menuScreen = false;
			Wizards.showPauseMenuScreen = false;
		}
		
		g.setColor(Color.black);
		g.fillRect(Wizards.centerToWidth(600), y, 600, 400);
		g.setColor(Color.white);
		g.drawString("PAUSE", Wizards.centerToWidth(125), y + 50);
		drawString(g, "Note: Make the game actually pause\nso that buttons won't work.", Wizards.centerToWidth(580), y + 100);
		
	}
	
}
