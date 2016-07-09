package com.terracore.wizards;

import java.awt.Color;
import java.awt.Graphics;

import com.terracore.handlers.Texture;

public class BeginScreen {

	public static Texture btnBackDef, btnBackPress, btnBackHov, btnBackState;

	public BeginScreen() {

		btnBackDef = new Texture("buttonback/ButtonBackDefault");
		btnBackPress = new Texture("buttonback/ButtonBackPressed");
		btnBackHov = new Texture("buttonback/ButtonBackHovered");
		btnBackState = btnBackDef;

	}

	public void paint(Graphics g) {
		// Background
		g.setColor(new Color(255, 250, 150));
		g.fillRect(0, 0, Wizards.WIDTH, Wizards.HEIGHT);

		// Top Bar
		g.setColor(new Color(244, 231, 129));
		g.fillRect(0, 0, Wizards.WIDTH, Wizards.compareToHeight(100));

		// Buttons
		btnBackState.render(g, Wizards.compareToWidth(20), Wizards.compareToHeight(40));
	}
	
}
