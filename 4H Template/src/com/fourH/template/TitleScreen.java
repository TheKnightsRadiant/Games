package com.fourH.template;

import java.awt.*;

import com.fourH.storages.Colorer;
import com.fourH.storages.Textures;

public class TitleScreen {

	public void paint(Graphics g) {
		
		// Background
		g.setColor(Colorer.White);
		g.fillRect(0, 0, Template.WIDTH, Template.HEIGHT);
		Textures.titleScreenBackground.render(g, Template.compareToWidth(11), Template.compareToHeight(0));
		Textures.titleScreenLogo.render(g, Template.compareToWidth(125), 95);
		
		g.setColor(Color.black);
		g.drawString("Made by Tyler Eldred", 585, 515);
		g.setColor(Colorer.DarkGreen);
		g.setFont(new Font("Serif", Font.BOLD, 50));
		g.drawString("January 16th, 2017", 275, 175);

		// Title Screen Buttons
		Textures.btnAgendaState.render(g, Template.compareToWidth(95), Template.compareToHeight(85));
		Textures.btnPledgeState.render(g, Template.compareToWidth(95), Template.compareToHeight(136));
		Textures.btnExitState.render(g, Template.compareToWidth(95), Template.compareToHeight(187));

	}
}
