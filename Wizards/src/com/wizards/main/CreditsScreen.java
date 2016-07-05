package com.wizards.main;

import java.awt.*;

public class CreditsScreen {

	//Variables
	public int y = 610;
	
	void drawString(Graphics g, String text, int x, int y) {
		for (String line : text.split("\n"))
			g.drawString(line, x, y += g.getFontMetrics().getHeight());

	}

	public void paint(Graphics g) {
		// BACKGROUND
		g.setColor(new Color(244, 231, 129));
		g.fillRect(0, 0, 800, 600);

		//Credits
		g.setColor(new Color(192, 143, 38));
		g.setFont(new Font("ZapfDingbats", Font.BOLD, 15));
		this.drawString(g, "Developers:     Tyler Eldred   -    Matthew Morse   -    Ian May\n"
						 + "Artists:             Molly Veesart   -   Tyler Eldred\n"
						 + "Music:              huge\n"
						 + "                        list\n"
						 + "                        of\n"
						 + "                        music", 50, y);
		
		//Top Bar
		g.setColor(new Color(255, 250, 150));
		g.fillRect(0, 0, 800, 100);
	}

}
