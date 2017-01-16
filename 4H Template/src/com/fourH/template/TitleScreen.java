package com.fourH.template;

import java.awt.Font;
import java.awt.Graphics;
import com.fourH.storages.Colorer;
import com.fourH.storages.Textures;

public class TitleScreen {

	private int fontSizeSettingsTitleDef = 18;
	private int fontSizeSettingsTextDef = 15;
	private int fontSizeSettingsTitle = fontSizeSettingsTitleDef;
	private int fontSizeSettingsText = fontSizeSettingsTextDef;

	public void paint(Graphics g) {
		
		// Background
		g.setColor(Colorer.White);
		g.fillRect(0, 0, Template.WIDTH, Template.HEIGHT);

		// Title Screen Buttons
		Textures.btnAgendaState.render(g, Template.centerToWidth(150), Template.compareToHeight(225));
		Textures.btnMembersState.render(g, Template.centerToWidth(150), Template.compareToHeight(280));

	}
}
