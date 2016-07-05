package com.wizards.main;

import java.awt.*;

public class HelpScreen {
	
	void drawString(Graphics g, String text, int x, int y) {
	    for (String line : text.split("\n"))
	        g.drawString(line, x, y += g.getFontMetrics().getHeight());
	}
	
	public void paint(Graphics g) {
		//BACKGROUND
		g.setColor(new Color(244, 231, 129));
		g.fillRect(0, 0, 800, 600);
		
		g.setColor(new Color(255, 250, 150));
		g.fillRect(25, 100, 750, 475);
		
		//HELP TITLE
		g.setColor(new Color(192, 143, 38));
		g.setFont(new Font("ZapfDingbats", Font.BOLD, 50));
		g.drawString("Help", 340, 75);
		
		//HELP CONTENTS
		g.setFont(new Font("ZapfDingbats", Font.BOLD, 15));
		this.drawString(g, "This is the help page.\nMatt, please tell me what you want me to write here...\n\n--Tyler", 50, 125);
	}
	
}
