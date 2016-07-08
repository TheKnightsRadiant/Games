package com.terracore.wizards;

import java.awt.Color;
import java.awt.Graphics;

import com.terracore.handlers.Texture;

public class BuildScreen {

	public static Texture btnBackDef, btnBackPress, btnBackHov, btnBackState;

	public BuildScreen() {

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
		g.fillRect(0, 0, Wizards.WIDTH, Wizards.HEIGHT * 100 / 600);

		// Buttons
		btnBackState.render(g, Wizards.WIDTH * 20 / 800, Wizards.HEIGHT * 40 / 600);
	}

}
