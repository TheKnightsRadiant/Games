package com.fourH.handlers;

import java.awt.event.*;

import com.fourH.storages.*;
import com.fourH.template.*;
import com.fourH.storages.*;

public class MouseHandler implements MouseListener, MouseMotionListener {

	public void mousePressed(MouseEvent e) {
		
	}

	public void mouseReleased(MouseEvent e) {

	}

	public void mouseMoved(MouseEvent e) {

		if (Template.showTitleScreen = true) {
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
