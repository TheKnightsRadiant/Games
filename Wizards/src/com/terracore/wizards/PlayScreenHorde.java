package com.terracore.wizards;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import com.terracore.storages.Textures;

public class PlayScreenHorde {
	
	public void paint(Graphics g){
		g.setColor(new Color(244, 231, 129));
		g.fillRect(0, 0, Wizards.WIDTH , Wizards.HEIGHT);
		
		Textures.blankCreatureCard.render(g, Wizards.compareToWidth(580), Wizards.compareToHeight(320));
		Textures.blankSpellCard.render(g, Wizards.compareToWidth(480), Wizards.compareToHeight(320));
		Textures.blankCard.render(g, Wizards.compareToWidth(380), Wizards.compareToHeight(320));
	
		g.setColor(new Color(28, 28, 22));
		g.drawLine(0, 300, 800, 300);
		//Horizontal Deck Line
		g.drawLine(200, 0, 200, 600);
		
		g.setFont(new Font("ZapfDingbats", Font.BOLD, 31));
		
		g.drawString("Your Hand:", Wizards.compareToWidth(210), Wizards.compareToHeight(345));
	}
}