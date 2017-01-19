package com.fourH.handlers;

import java.awt.event.*;

import com.fourH.template.*;
import com.fourH.storages.*;

public class NewBMouseHandler implements MouseListener, MouseMotionListener {

	String currentButton;

	public void mousePressed(MouseEvent e) {
		if (Template.showNewBScreen) {

			// Button Back
			if (e.getX() >= Template.compareToWidth(20) && e.getX() <= Template.compareToWidth(20) + 150
					&& e.getY() >= Template.compareToHeight(40) && e.getY() <= Template.compareToHeight(40) + 50) {
				Textures.btnBackState = Textures.btnBackPress;
				currentButton = "Back";
			}

			// Button Previous
			if (e.getX() >= Template.compareToWidth(600) && e.getX() <= Template.compareToWidth(600) + 40
					&& e.getY() >= Template.compareToHeight(50) && e.getY() <= Template.compareToHeight(50) + 40) {
				if (NewBusinessScreen.pageNumber > 1) {
					Textures.btnPrevState = Textures.btnPrevPress;
				} else {
					Textures.btnPrevState = Textures.btnPrevPress;
				}
				currentButton = "Previous";
			}

			// Button Next
			if (e.getX() >= Template.compareToWidth(700) && e.getX() <= Template.compareToWidth(700) + 40
					&& e.getY() >= Template.compareToHeight(50) && e.getY() <= Template.compareToHeight(50) + 40) {
				if (NewBusinessScreen.pageNumber < NewBusinessScreen.maxPages) {
					Textures.btnNextState = Textures.btnNextPress;
				} else {
					Textures.btnNextState = Textures.btnNextPress;
				}
				currentButton = "Next";
			}

		}
	}

	public void mouseReleased(MouseEvent e) {
		if (Template.showNewBScreen) {

			// Button Back
			if (currentButton == "Back" && e.getX() >= Template.compareToWidth(20)
					&& e.getX() <= Template.compareToWidth(20) + 150 && e.getY() >= Template.compareToHeight(40)
					&& e.getY() <= Template.compareToHeight(40) + 50) {
				Textures.btnPrevState = Textures.btnPrevPress;
				Textures.btnNextState = Textures.btnNextDef;
				NewBusinessScreen.pageNumber = 1;
				Template.showNewBScreen = false;
				Template.showAgendaScreen = true;
				Textures.btnBackState = Textures.btnBackDef;
			}

			// Button Previous
			if (currentButton == "Previous" && e.getX() >= Template.compareToWidth(600)
					&& e.getX() <= Template.compareToWidth(600) + 40 && e.getY() >= Template.compareToHeight(50)
					&& e.getY() <= Template.compareToHeight(50) + 40) {
				if (NewBusinessScreen.pageNumber > 1) {
					Textures.btnNextState = Textures.btnNextDef;
					NewBusinessScreen.pageNumber--;
				}
				if (NewBusinessScreen.pageNumber > 1) {
					Textures.btnPrevState = Textures.btnPrevHov;
				}
			}

			// Button Next
			if (currentButton == "Next" && e.getX() >= Template.compareToWidth(700)
					&& e.getX() <= Template.compareToWidth(700) + 40 && e.getY() >= Template.compareToHeight(50)
					&& e.getY() <= Template.compareToHeight(50) + 40) {
				if (NewBusinessScreen.pageNumber < NewBusinessScreen.maxPages) {
					Textures.btnPrevState = Textures.btnPrevDef;
					NewBusinessScreen.pageNumber++;
				}
				if (NewBusinessScreen.pageNumber < NewBusinessScreen.maxPages) {
					Textures.btnNextState = Textures.btnNextHov;
				}
			}

		}
	}

	public void mouseMoved(MouseEvent e) {
		if (Template.showNewBScreen) {
			
			// Button Back
			if (e.getX() >= Template.compareToWidth(20) && e.getX() <= Template.compareToWidth(20) + 150
					&& e.getY() >= Template.compareToHeight(40) && e.getY() <= Template.compareToHeight(40) + 50) {
				Textures.btnBackState = Textures.btnBackHov;
			} else {
				Textures.btnBackState = Textures.btnBackDef;
			}

			// Button Previous
			if (NewBusinessScreen.pageNumber > 1) {
				if (e.getX() >= Template.compareToWidth(600) && e.getX() <= Template.compareToWidth(600) + 40
						&& e.getY() >= Template.compareToHeight(50) && e.getY() <= Template.compareToHeight(50) + 40) {
					Textures.btnPrevState = Textures.btnPrevHov;
				} else {
					Textures.btnPrevState = Textures.btnPrevDef;
				}
			}

			// Button Next
			if (NewBusinessScreen.pageNumber < NewBusinessScreen.maxPages) {
				if (e.getX() >= Template.compareToWidth(700) && e.getX() <= Template.compareToWidth(700) + 40
						&& e.getY() >= Template.compareToHeight(50) && e.getY() <= Template.compareToHeight(50) + 40) {
					Textures.btnNextState = Textures.btnNextHov;
				} else {
					Textures.btnNextState = Textures.btnNextDef;
				}
			}
			
		}
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mouseDragged(MouseEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
	}

}
