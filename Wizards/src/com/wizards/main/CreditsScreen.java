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
		g.fillRect(0, 0, 800 + 10, 600 + 10);
		
		//Credits
		g.setColor(new Color(192, 143, 38));
		g.setFont(new Font("ZapfDingbats", Font.BOLD, 15));
		this.drawString(g, "Developers:     Matthew Morse   -    Tyler Eldred   -    Ian May\n\n"
						 + "Artists:               Molly Veesart   -   Tyler Eldred\n\n"
						 + "Music:                huge\n"
						 + "                            list\n"
						 + "                            of\n"
						 + "                            music\n\n" 
						 + "Programing:\n" 
						 + "     -Graphics:     Tyler Eldred    -    Ian May\n" 
						 + "     -Sound:          Ian May\n" 
						 + "     -Mechanics:  Tyler Eldred    -    Matthew Morse     -    Ian May", 50, y);

		// Top Bar
		g.setColor(new Color(255, 250, 150));
		g.fillRect(0, 0, 800 + 10, 100);

		// CREDIT TITLE
		g.setColor(new Color(192, 143, 38));
		g.setFont(new Font("ZapfDingbats", Font.BOLD, 50));
		g.drawString("Credits", 310, 75);
	}

}
