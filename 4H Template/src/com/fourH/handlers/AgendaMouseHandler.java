package com.fourH.handlers;

import java.awt.event.*;

import com.fourH.storages.*;
import com.fourH.template.*;

public class AgendaMouseHandler implements MouseListener, MouseMotionListener {

	String currentButton;

	public void mousePressed(MouseEvent e) {
		if (Template.showAgendaScreen) {

			// Back Button
			if (e.getX() >= Template.compareToWidth(10) && e.getX() <= Template.compareToWidth(10) + 150
					&& e.getY() >= Template.compareToHeight(10) && e.getY() <= Template.compareToHeight(10) + 50) {
				Textures.btnBackState = Textures.btnBackPress;
				currentButton = "Back";
			}

		}
	}

	public void mouseReleased(MouseEvent e) {
		if (Template.showAgendaScreen) {

			// Back Button
			if (currentButton == "Back" && e.getX() >= Template.compareToWidth(10)
					&& e.getX() <= Template.compareToWidth(10) + 150 && e.getY() >= Template.compareToHeight(10)
					&& e.getY() <= Template.compareToHeight(10) + 50) {
				Template.showAgendaScreen = false;
				Template.showTitleScreen = true;
				Textures.btnBackState = Textures.btnBackDef;
			}

		}
	}

	public void mouseMoved(MouseEvent e) {
		if (Template.showAgendaScreen) {

			// Back Button
			if (e.getX() >= Template.compareToWidth(10) && e.getX() <= Template.compareToWidth(10) + 150
					&& e.getY() >= Template.compareToHeight(10) && e.getY() <= Template.compareToHeight(10) + 50) {
				Textures.btnBackState = Textures.btnBackHov;

			} else {
				Textures.btnBackState = Textures.btnBackDef;
			}
			
			// Old Business Button
			
			
			// New Business Button
			
			
			// Announcements Button

		}
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseDragged(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

}
