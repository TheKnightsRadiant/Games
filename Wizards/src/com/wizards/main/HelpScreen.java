package com.wizards.main;

import java.awt.*;

public class HelpScreen {

	public int pageNumber = 1;
	public int maxPages = 3;

	void drawString(Graphics g, String text, int x, int y) {
		for (String line : text.split("\n"))
			g.drawString(line, x, y += g.getFontMetrics().getHeight());

	}

	public void drawStringMultiLine(Graphics2D g, String text, int lineWidth, int x, int y) {
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
		// BACKGROUND
		g.setColor(new Color(244, 231, 129));
		g.fillRect(0, 0, 800, 600);
		
		//BACKGROUND TO TEXT
		g.setColor(new Color(255, 250, 150));
		g.fillRect(25, 100, 750, 475);

		// HELP TITLE
		g.setColor(new Color(192, 143, 38));
		g.setFont(new Font("ZapfDingbats", Font.BOLD, 50));
		g.drawString("Help", 340, 75);
		
		g.setFont(new Font("ZapfDingbats", Font.BOLD, 12));
		g.drawString("Page: " + pageNumber + "/3", 590, 75);


		// HELP CONTENTS
		g.setFont(new Font("ZapfDingbats", Font.BOLD, 18));
		switch (pageNumber) {
		case 1:
			this.drawStringMultiLine((Graphics2D) g,
					"Wizards can be played with one to four players, with AIs substituting missing humans. "
					 + "In any game mode, each player takes turns performing one of several possible actions. "
					 + "A player could choose to cast a spell, which could have a variety of effects, from their hand. "
					 + "They could also summon a creature, if any are in their hand. Creatures have stats of their own, and help wizards in the long-term game. "
					 + "A wizard can also choose to perform a physical attack at any time, regardless of what is in their hand. "
					 + "Players gain money by participating in games, and completing challenges. Money can be used to improve wizards and buy new spells and creatures.",
					700, 50, 125);
			break;
		case 2:
			this.drawStringMultiLine((Graphics2D) g, "Before starting a game, you can create up to four custom wizards to play with. To do this, choose BUILD from the main menu. Here, you will have several options. "
					+ "First, you can name your wizard. You can also choose their attributes. Wizards who have more strength will do more damage with physical attacks. "
					+ "More magic will cause their spells to be more powerful. Wizards who have more health will survive longer, but wizards with more mana will be able to cast more powerful spells. "
					+ "You can also choose whether they are more talented with dark spells or light spells, water spells or fire spells, and ethereal spells or physical spells. "
					+ "You can also customize the wizard's deck here.", 700, 50, 125);
			break;
		case 3:
			this.drawString(g, "Game Modes:\n\nFree For All:\n   In this game mode, two to four players all battle each other. The last man\nstanding wins.\n\nTeam Deathmatch:\n   In this game mode, two teams of two battle each other. "
					+ "As long as both\nmembers of a team are alive, players can use special combo abilities,\nwhich are more powerful than most normal wizard abilities. The last team\nwhich has at least one surviving member wins."
					+ "\n\nHorde:\n   In this game mode, one player fights twenty sequentially spawning\nmagical creatures.\n\nEndless Horde:\n   In this game mode, one player fights as many creatures as they can\nuntil they die.", 50, 100);
			break;
		default:
			System.err.println("There was an error changing the pages.");
		}
	}

}
