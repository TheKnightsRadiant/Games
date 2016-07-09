package com.terracore.wizards;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import com.terracore.handlers.Texture;

public class CreditsScreen {

	public static int startY = 600 * Wizards.HEIGHT / 600;
	public static int y = startY;

	private int fontSizeTitle = 50;
	private int fontSizeText = 15;

	public static Texture btnBackDef, btnBackPress, btnBackHov, btnBackState;

	void drawString(Graphics g, String text, int x, int y) {
		for (String line : text.split("\n"))
			g.drawString(line, x, y += g.getFontMetrics().getHeight());

	}

	public CreditsScreen() {

		fontSizeTitle = Wizards.compareToWidth(fontSizeTitle);
		fontSizeText = Wizards.compareToWidth(fontSizeText);

		btnBackDef = new Texture("buttonback/ButtonBackDefault");
		btnBackPress = new Texture("buttonback/ButtonBackPressed");
		btnBackHov = new Texture("buttonback/ButtonBackHovered");
		btnBackState = btnBackDef;

	}

	public void paint(Graphics g) {

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
		btnBackState.render(g, Wizards.compareToWidth(20), Wizards.compareToHeight(40));
	}

}
