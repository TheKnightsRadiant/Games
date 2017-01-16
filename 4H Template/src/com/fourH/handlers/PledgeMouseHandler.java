package com.fourH.handlers;

import java.awt.event.*;

import com.fourH.storages.*;
import com.fourH.template.*;

public class PledgeMouseHandler implements MouseListener, MouseMotionListener {

	String currentButton;
	
	public void mousePressed(MouseEvent e) {
		if (Template.showPledgeScreen) {

			// Back Button
			if (e.getX() >= Template.compareToWidth(10) && e.getX() <= Template.compareToWidth(10) + 150
					&& e.getY() >= Template.compareToHeight(10) && e.getY() <= Template.compareToHeight(10) + 50) {
				Textures.btnBackState = Textures.btnBackPress;
				currentButton = "Back";
			}

		}
	}

	public void mouseReleased(MouseEvent e) {
		if (Template.showPledgeScreen) {

			// Back Button
			if (currentButton == "Back" && e.getX() >= Template.compareToWidth(10) 
					&& e.getX() <= Template.compareToWidth(10) + 150 && e.getY() >= Template.compareToHeight(10) 
					&& e.getY() <= Template.compareToHeight(10) + 50) {
				Template.showPledgeScreen = false;
				Template.showTitleScreen = true;
				Textures.btnBackState = Textures.btnBackDef;
			}

		}
	}

	public void mouseMoved(MouseEvent e) {
		if (Template.showPledgeScreen) {

			// Back Button
			if (e.getX() >= Template.compareToWidth(10) && e.getX() <= Template.compareToWidth(10) + 150
					&& e.getY() >= Template.compareToHeight(10) && e.getY() <= Template.compareToHeight(10) + 50) {
				Textures.btnBackState = Textures.btnBackHov;

			} else {
				Textures.btnBackState = Textures.btnBackDef;
			}

		}
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mouseDragged(MouseEvent e) {
	}

}
