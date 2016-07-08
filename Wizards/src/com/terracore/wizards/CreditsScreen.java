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

		fontSizeTitle = fontSizeTitle * Wizards.WIDTH / 800;
		fontSizeText = fontSizeText * Wizards.WIDTH / 800;

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
		this.drawString(g,
				"Developers:     Matthew Morse   -    Tyler Eldred   -    Ian May\n\n"
						+ "Artists:               Molly Veesart   -   Tyler Eldred\n\n" + "Music:                huge\n"
						+ "                            list\n" + "                            of\n"
						+ "                            music\n\n" + "Programing:\n"
						+ "     -Graphics:     Tyler Eldred    -    Ian May\n" + "     -Sound:          Ian May\n"
						+ "     -Mechanics:  Tyler Eldred    -    Matthew Morse     -    Ian May",
				100 * Wizards.WIDTH / 800, y);

		// Top Bar
		g.setColor(new Color(244, 231, 129));
		g.fillRect(0, 0, Wizards.WIDTH, Wizards.HEIGHT * 100 / 600);

		// CREDIT TITLE
		g.setColor(new Color(192, 143, 38));
		g.setFont(new Font("ZapfDingbats", Font.BOLD, fontSizeTitle));
		g.drawString("Credits", Wizards.WIDTH * 310 / 800, Wizards.HEIGHT * 75 / 600);

		// Buttons
		btnBackState.render(g, Wizards.WIDTH * 20 / 800, Wizards.HEIGHT * 40 / 600);
	}

}
