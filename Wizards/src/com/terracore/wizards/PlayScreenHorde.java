package com.terracore.wizards;

import java.awt.Color;
import java.awt.Graphics;

import com.terracore.storages.Textures;

public class PlayScreenHorde {
	
	public void paint(Graphics g){
		g.setColor(new Color(244, 231, 129));
		g.fillRect(0, 0, Wizards.WIDTH , Wizards.HEIGHT);
		
		Textures.blankCreatureCard.render(g, Wizards.compareToWidth(220), Wizards.compareToHeight(20));
		Textures.blankSpellCard.render(g, Wizards.compareToWidth(120), Wizards.compareToHeight(20));
		Textures.blankCard.render(g, Wizards.compareToWidth(20), Wizards.compareToHeight(20));
		
		Textures.blankCard.render(g, Wizards.compareToWidth(20), Wizards.compareToHeight(320));
		Textures.blankSpellCard.render(g, Wizards.compareToWidth(170), Wizards.compareToHeight(320));
		Textures.blankCreatureCard.render(g, Wizards.compareToWidth(320), Wizards.compareToHeight(320));
	}

}
