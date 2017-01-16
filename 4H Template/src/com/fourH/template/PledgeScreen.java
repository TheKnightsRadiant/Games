package com.fourH.template;

import java.awt.*;

import com.fourH.storages.*;

public class PledgeScreen {

public void paint(Graphics g) {
		
		// Background
		g.setColor(Colorer.White);
		g.fillRect(0, 0, Template.WIDTH, Template.HEIGHT);
		Textures.titleScreenBackground.render(g, Template.compareToWidth(11), Template.compareToHeight(0));
		Textures.pledgeScreenBackground.render(g, Template.compareToWidth(50), Template.compareToHeight(70));
		
		//Buttons
		g.setColor(Colorer.LightGray);
		g.fillRect(Template.compareToWidth(10), Template.compareToHeight(10), 150, 50);
		Textures.btnBackState.render(g, Template.compareToWidth(10), Template.compareToHeight(10));

	}
	
}
