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

			// Old Business Button
			if (e.getX() >= Template.compareToWidth(325) && e.getX() <= Template.compareToWidth(325) + 150
					&& e.getY() >= Template.compareToHeight(125) && e.getY() <= Template.compareToHeight(125) + 50) {
				Textures.btnOldBState = Textures.btnOldBPress;
				currentButton = "Old Business";
			}
			
			// New Business Button
			if (e.getX() >= Template.compareToWidth(325) && e.getX() <= Template.compareToWidth(325) + 150
					&& e.getY() >= Template.compareToHeight(176) && e.getY() <= Template.compareToHeight(176) + 50) {
				Textures.btnNewBState = Textures.btnNewBPress;
				currentButton = "New Business";
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

			// Old Business Button
			if (currentButton == "Old Business" && e.getX() >= Template.compareToWidth(325) && e.getX() <= Template.compareToWidth(325) + 150
					&& e.getY() >= Template.compareToHeight(125) && e.getY() <= Template.compareToHeight(125) + 50) {
				Template.showAgendaScreen = false;
				Template.showOldBScreen = true;
				Textures.btnOldBState = Textures.btnOldBDef;
			}
			
			// New Business Button
			if (currentButton == "New Business" && e.getX() >= Template.compareToWidth(325) && e.getX() <= Template.compareToWidth(325) + 150
					&& e.getY() >= Template.compareToHeight(176) && e.getY() <= Template.compareToHeight(176) + 50) {
				Template.showAgendaScreen = false;
				Template.showNewBScreen = true;
				Textures.btnNewBState = Textures.btnNewBDef;
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
			if (e.getX() >= Template.compareToWidth(325) && e.getX() <= Template.compareToWidth(325) + 150
					&& e.getY() >= Template.compareToHeight(125) && e.getY() <= Template.compareToHeight(125) + 50) {
				Textures.btnOldBState = Textures.btnOldBHov;
			} else {
				Textures.btnOldBState = Textures.btnOldBDef;
			}
			
			// New Business Button
			if (e.getX() >= Template.compareToWidth(325) && e.getX() <= Template.compareToWidth(325) + 150
					&& e.getY() >= Template.compareToHeight(176) && e.getY() <= Template.compareToHeight(176) + 50) {
				Textures.btnNewBState = Textures.btnNewBHov;
			} else {
				Textures.btnNewBState = Textures.btnNewBDef;
			}
			
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
