package com.fourH.template;

import java.awt.*;

import com.fourH.storages.*;

public class NewBusinessScreen {

	private int fontSizeText = 17;
	private int fontSizePage = 12;
	private int fontSizeTitle = 50;

	private int textLineWidth;
	private int textX;
	private int textY;

	public static int pageNumber = 1;
	public static int maxPages = 3;

	void drawString(Graphics g, String text, int x, int y) {
		for (String line : text.split("\n"))
			g.drawString(line, x, y += g.getFontMetrics().getHeight());

	}

	public void drawStringMultiLine(Graphics g, String text, int lineWidth, int x, int y) {
		FontMetrics m = g.getFontMetrics();
		if (m.stringWidth(text) < lineWidth) {
			g.drawString(text, x, y);
		} else {
			String[] words = text.split(" ");
			String currentLine = words[0];
			for (int i = 1; i < words.length; i++) {
				if (m.stringWidth(currentLine + words[i]) < lineWidth) {
					currentLine += " " + words[i];
				} else {
					g.drawString(currentLine, x, y);
					y += m.getHeight();
					currentLine = words[i];
				}
			}
			if (currentLine.trim().length() > 0) {
				g.drawString(currentLine, x, y);
			}
		}
	}

	public void paint(Graphics g) {

		textLineWidth = Template.compareToWidth(700);
		textX = Template.compareToWidth(50);
		textY = Template.compareToHeight(125);

		// Background
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, Template.WIDTH, Template.HEIGHT);
		
		g.setColor(new Color(240, 240, 240));
		g.fillRect(Template.compareToHeight(25), Template.compareToWidth(100), Template.compareToWidth(750),
				Template.compareToHeight(450));

		// Top Text
		g.setColor(Colorer.DarkGreen);
		g.setFont(new Font("ZapfDingbats", Font.BOLD, fontSizeTitle));
		g.drawString("Old Business", Template.compareToWidth(230), Template.compareToHeight(75));

		// Page Number
		g.setFont(new Font("ZapfDingbats", Font.BOLD, fontSizePage));
		g.drawString("Page: " + pageNumber + "/" + maxPages, Template.compareToWidth(643),
				Template.compareToHeight(75));

		g.setColor(Colorer.LightGray);
		g.fillRect(Template.compareToWidth(20), Template.compareToHeight(40), 150, 50);
		
		// Buttons
		Textures.btnBackState.render(g, Template.compareToWidth(20), Template.compareToHeight(40));
		Textures.btnPrevState.render(g, Template.compareToWidth(600), Template.compareToHeight(50));
		Textures.btnNextState.render(g, Template.compareToWidth(700), Template.compareToHeight(50));
		
		// Contents
		g.setFont(new Font("ZapfDingbats", Font.BOLD, fontSizeText));
		g.setColor(Colorer.DarkGreen);
		switch (pageNumber) {
		case 1:
			this.drawStringMultiLine(g,
					"This is the First Page of New Business",
					textLineWidth, textX, textY);
			break;
		case 2:
			this.drawStringMultiLine(g,
					"This is the Second Page of New Business",
					textLineWidth, textX, textY);
			break;
		case 3:
			this.drawStringMultiLine(g,
					"This is the Third Page of New Business",
					textLineWidth, textX, textY);
			break;
		default:
			System.err.println("There was an error changing the pages.");
		}
		
	}
	
}
