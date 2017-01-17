package com.fourH.handlers;

import java.awt.event.*;

import com.fourH.storages.*;
import com.fourH.template.*;

public class MouseHandler implements MouseListener, MouseMotionListener {

	String currentButton;
	
	public void mousePressed(MouseEvent e) {
		if (Template.showTitleScreen) {
			
			// Button Agenda
			if (e.getX() >= Template.compareToWidth(95) && e.getX() <= Template.compareToWidth(95) + 150
					&& e.getY() >= Template.compareToHeight(85) && e.getY() <= Template.compareToHeight(85) + 50) {
				Textures.btnAgendaState = Textures.btnAgendaPress;
				currentButton = "Agenda";
			} 
			
			// Button Pledge
			if (e.getX() >= Template.compareToWidth(95) && e.getX() <= Template.compareToWidth(95) + 150
					&& e.getY() >= Template.compareToHeight(136) && e.getY() <= Template.compareToHeight(136) + 50) {
				Textures.btnPledgeState = Textures.btnPledgePress;
				currentButton = "Pledge";
			}
			
			// Button Exit
			if (e.getX() >= Template.compareToWidth(95) && e.getX() <= Template.compareToWidth(95) + 150
					&& e.getY() >= Template.compareToHeight(187) && e.getY() <= Template.compareToHeight(187) + 50) {
				Textures.btnExitState = Textures.btnExitPress;
				currentButton = "Exit";
			}
			
		}
	}

	public void mouseReleased(MouseEvent e) {
		if (Template.showTitleScreen){
			
			// Button Agenda
			if (currentButton == "Agenda" && e.getX() >= Template.compareToWidth(95) 
					&& e.getX() <= Template.compareToWidth(95) + 150 && e.getY() >= Template.compareToHeight(85) 
					&& e.getY() <= Template.compareToHeight(85) + 50) {
				Template.showTitleScreen = false;
				Template.showAgendaScreen = true;
				Textures.btnAgendaState = Textures.btnAgendaDef;
			}
			
			// Button Pledge
			if (currentButton == "Pledge" && e.getX() >= Template.compareToWidth(95) 
					&& e.getX() <= Template.compareToWidth(95) + 150 && e.getY() >= Template.compareToHeight(136) 
					&& e.getY() <= Template.compareToHeight(136) + 50) {
				Template.showTitleScreen = false;
				Template.showPledgeScreen = true;
				Textures.btnPledgeState = Textures.btnPledgeDef;
			}
			
			// Button Exit
			if (currentButton == "Exit" && e.getX() >= Template.compareToWidth(95) 
					&& e.getX() <= Template.compareToWidth(95) + 150 && e.getY() >= Template.compareToHeight(187) 
					&& e.getY() <= Template.compareToHeight(187) + 50) {
				Textures.btnExitState = Textures.btnExitDef;
				Template.exit();
			}
			
		}
	}

	public void mouseMoved(MouseEvent e) {
		if (Template.showTitleScreen) {
			
			// Button Agenda
			if (e.getX() >= Template.compareToWidth(95) && e.getX() <= Template.compareToWidth(95) + 150
					&& e.getY() >= Template.compareToHeight(85) && e.getY() <= Template.compareToHeight(85) + 50) {
				Textures.btnAgendaState = Textures.btnAgendaHov;
			} else {
				Textures.btnAgendaState = Textures.btnAgendaDef;
			}
			
			// Button Pledge
			if (e.getX() >= Template.compareToWidth(95) && e.getX() <= Template.compareToWidth(95) + 150
					&& e.getY() >= Template.compareToHeight(136) && e.getY() <= Template.compareToHeight(136) + 50) {
				Textures.btnPledgeState = Textures.btnPledgeHov;
			} else {
				Textures.btnPledgeState = Textures.btnPledgeDef;
			}
			
			// Button Exit
			if (e.getX() >= Template.compareToWidth(95) && e.getX() <= Template.compareToWidth(95) + 150
					&& e.getY() >= Template.compareToHeight(187) && e.getY() <= Template.compareToHeight(187) + 50) {
				Textures.btnExitState = Textures.btnExitHov;
			} else {
				Textures.btnExitState = Textures.btnExitDef;
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
