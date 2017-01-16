package com.fourH.template;

import java.awt.Font;
import java.awt.Graphics;

import com.fourH.storages.Colorer;
import com.fourH.storages.Textures;

public class LoadingScreen {
	
	public static boolean isDone = false;
	
	public static String LoadingMessage = "";
	
	public void paint(Graphics g) {
		// Template.preLoad = false;
		g.setColor(Colorer.White);
		g.fillRect(0, 0, Template.WIDTH, Template.HEIGHT);
		g.setColor(Colorer.DarkGreen);
		g.setFont(new Font("ZapfDingbats", Font.BOLD, 50));
		if (Template.loadCounter < 80 && Template.loadCounter >= 60) {
			g.drawString("Loading", Template.centerToWidth(200), Template.centerToHeight());
		} else if (Template.loadCounter < 60 && Template.loadCounter >= 40) {
			g.drawString("Loading.", Template.centerToWidth(200), Template.centerToHeight());
		} else if (Template.loadCounter < 40 && Template.loadCounter >= 20) {
			g.drawString("Loading..", Template.centerToWidth(200), Template.centerToHeight());
		} else if (Template.loadCounter < 20 && Template.loadCounter >= 0) {
			g.drawString("Loading...", Template.centerToWidth(200), Template.centerToHeight());
			if (Template.loadCounter == 0) {
				Template.loadCounter = 80;
			}
		}
		
		g.setFont(new Font("ZapfDingbats", Font.BOLD, 30));
		g.drawString(LoadingMessage, Template.centerToWidth(200), Template.centerToHeight(-200));
		
		Template.loadCounter--;

		if(!isDone){
			@SuppressWarnings("unused")
			Textures Textures = new Textures();
		}
	
	}
}