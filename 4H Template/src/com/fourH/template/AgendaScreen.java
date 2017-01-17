package com.fourH.template;

import java.awt.*;

import com.fourH.storages.*;

public class AgendaScreen {

public void paint(Graphics g) {
		
		// Background
		g.setColor(Colorer.White);
		g.fillRect(0, 0, Template.WIDTH, Template.HEIGHT);
		Textures.titleScreenBackground.render(g, Template.compareToWidth(11), Template.compareToHeight(0));
		Textures.titleScreenLogo.render(g, Template.compareToWidth(125), 170);
		Textures.fourHClover.render(g, Template.compareToWidth(100), Template.compareToHeight(100));
		Textures.fourHClover.render(g, Template.compareToWidth(500), Template.compareToHeight(100));
		
		g.setColor(Colorer.LightGray);
		g.fillRect(Template.compareToWidth(10), Template.compareToHeight(10), 150, 50);
		
		// Buttons
		Textures.btnBackState.render(g, Template.compareToWidth(10), Template.compareToHeight(10));
		Textures.btnOldBState.render(g, Template.compareToWidth(325), Template.compareToHeight(125));
		Textures.btnNewBState.render(g, Template.compareToWidth(325), Template.compareToHeight(176));
		Textures.btnAnnounceState.render(g, Template.compareToWidth(325), Template.compareToHeight(227));

	}
	
}
