package com.terracore.wizards;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import com.terracore.storages.Cards;
import com.terracore.storages.Textures;

public class PlayScreenHorde {
	
	//Move these ints to a separate class later
	int HP = 100;
	int MP = 50;
	int MPRegen = 3;
	int enemyHP = 20;
	String affinity = "Fire";
	
	public void paint(Graphics g){
		g.setColor(new Color(244, 231, 129));
		g.fillRect(0, 0, Wizards.WIDTH , Wizards.HEIGHT);
		
		while (Textures.cardSlot1 == null){
			Textures.cardSlot1 = Cards.getCard().getTexture();
		}
		while (Textures.cardSlot2 == null){
			Textures.cardSlot2 = Cards.getCard().getTexture();
		}
		while (Textures.cardSlot3 == null){
			Textures.cardSlot3 = Cards.getCard().getTexture();
		}
		while (Textures.cardSlot4 == null){
			Textures.cardSlot4 = Cards.getCard().getTexture();
		}
		while (Textures.cardSlot5 == null){
			Textures.cardSlot5 = Cards.getCard().getTexture();
		}
		
		Textures.cardSlot1.render(g, Wizards.compareToWidth(640), Wizards.compareToHeight(320));
		Textures.cardSlot2.render(g, Wizards.compareToWidth(485), Wizards.compareToHeight(320));
		Textures.cardSlot3.render(g, Wizards.compareToWidth(330), Wizards.compareToHeight(320));
		Textures.cardSlot4.render(g, Wizards.compareToWidth(175), Wizards.compareToHeight(320));
		
		Textures.cardSlot5.render(g, Wizards.compareToWidth(600), Wizards.compareToHeight(60));
		
		g.setColor(new Color(28, 28, 22));
		g.drawLine(0, 300, 800, 300);
		//Horizontal Deck Line
		//g.drawLine(200, 0, 200, 600);
		//Vertical Line
		g.drawLine(580, 0, 580, 300);
		//Vertical Line
		
		g.setFont(new Font("ZapfDingbats", Font.BOLD, 31));
		
		g.drawString("Your Hand:", Wizards.compareToWidth(10), Wizards.compareToHeight(345));
		//g.drawString("Actions:", Wizards.compareToWidth(35), Wizards.compareToHeight(345));
		//g.drawString("Notifications:", Wizards.compareToWidth(5), Wizards.compareToHeight(40));
		g.drawString("Creatures:", Wizards.compareToWidth(210), Wizards.compareToHeight(40));
		g.drawString("Enemies:", Wizards.compareToWidth(600), Wizards.compareToHeight(41));
		g.drawString("HP: " + HP, Wizards.compareToWidth(12), Wizards.compareToHeight(375));
		g.drawString("MP: " + MP, Wizards.compareToWidth(12), Wizards.compareToHeight(405));
		g.drawString("MP Reg: " + MPRegen, Wizards.compareToWidth(10), Wizards.compareToHeight(435));
		g.drawString("Aff: " + affinity, Wizards.compareToWidth(7), Wizards.compareToHeight(465));
		g.drawString("HP: " + enemyHP, Wizards.compareToWidth(601), Wizards.compareToHeight(290));
	}
}