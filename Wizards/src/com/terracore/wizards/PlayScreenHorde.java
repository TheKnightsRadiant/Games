package com.terracore.wizards;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import com.terracore.storages.Textures;

public class PlayScreenHorde {
	
	int HP = 100;
	
	public void paint(Graphics g){
		g.setColor(new Color(244, 231, 129));
		g.fillRect(0, 0, Wizards.WIDTH , Wizards.HEIGHT);
		
		Textures.blankCreatureCard.render(g, Wizards.compareToWidth(580), Wizards.compareToHeight(320));
		Textures.blankSpellCard.render(g, Wizards.compareToWidth(480), Wizards.compareToHeight(320));
		Textures.blankCard.render(g, Wizards.compareToWidth(380), Wizards.compareToHeight(320));
		
		Textures.blankCreatureCard.render(g, Wizards.compareToWidth(600), Wizards.compareToHeight(60));
		Textures.blankCreatureCard.render(g, Wizards.compareToWidth(420), Wizards.compareToHeight(60));
		Textures.blankCreatureCard.render(g, Wizards.compareToWidth(240), Wizards.compareToHeight(60));
	
		g.setColor(new Color(28, 28, 22));
		g.drawLine(0, 300, 800, 300);
		//Horizontal Deck Line
		g.drawLine(200, 0, 200, 600);
		//Vertical Line
		
		g.setFont(new Font("ZapfDingbats", Font.BOLD, 31));
		
		g.drawString("Your Hand:", Wizards.compareToWidth(210), Wizards.compareToHeight(345));
		g.drawString("Actions:", Wizards.compareToWidth(35), Wizards.compareToHeight(345));
		g.drawString("Notifications:", Wizards.compareToWidth(5), Wizards.compareToHeight(40));
		g.drawString("Enemies:", Wizards.compareToWidth(215), Wizards.compareToHeight(41));
		g.drawString("HP: " + HP, Wizards.compareToWidth(212), Wizards.compareToHeight(375));
	}
}