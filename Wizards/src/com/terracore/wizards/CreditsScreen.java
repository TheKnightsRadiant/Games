package com.terracore.wizards;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import com.terracore.storages.Textures;

public class CreditsScreen {

	public static int startY = Wizards.compareToHeight(600);
	public static int y = startY;

	private int fontSizeTitle = 50;
	private int fontSizeText = 15;


	void drawString(Graphics g, String text, int x, int y) {
		for (String line : text.split("\n"))
			g.drawString(line, x, y += g.getFontMetrics().getHeight());

	}

	public void paint(Graphics g) {

		fontSizeTitle = Wizards.compareToWidth(fontSizeTitle);
		fontSizeText = Wizards.compareToWidth(fontSizeText);
		
		y--;
		// Background
		g.setColor(new Color(255, 250, 150));
		g.fillRect(0, 0, Wizards.WIDTH, Wizards.HEIGHT);

		// Credits
		g.setColor(new Color(192, 143, 38));
		g.setFont(new Font("ZapfDingbats", Font.BOLD, fontSizeText));
		this.drawString(g, "INSERT CREDITS HERE (LATER)", Wizards.compareToWidth(100), y);

		// Top Bar
		g.setColor(new Color(244, 231, 129));
		g.fillRect(0, 0, Wizards.WIDTH, Wizards.compareToHeight(100));

		// CREDIT TITLE
		g.setColor(new Color(192, 143, 38));
		g.setFont(new Font("ZapfDingbats", Font.BOLD, fontSizeTitle));
		g.drawString("Credits", Wizards.compareToWidth(310), Wizards.compareToHeight(75));

		// Buttons
		Textures.btnBackState.render(g, Wizards.compareToWidth(20), Wizards.compareToHeight(40));
	}
}
