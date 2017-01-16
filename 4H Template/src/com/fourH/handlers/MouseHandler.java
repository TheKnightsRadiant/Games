package com.fourH.handlers;

import java.awt.event.*;

import com.fourH.storages.*;
import com.fourH.template.*;
import com.fourH.storages.*;

public class MouseHandler implements MouseListener, MouseMotionListener {

	private boolean btnAgendaHover = false;

	public void mousePressed(MouseEvent e) {

	}

	public void mouseReleased(MouseEvent e) {

	}

	public void mouseMoved(MouseEvent e) {

		if (Template.showTitleScreen = true) {
			if (e.getX() >= Template.compareToWidth(5) && e.getX() <= Template.compareToWidth(5) + 150
					&& e.getY() >= Template.compareToHeight(150) && e.getY() <= Template.compareToHeight(150) + 50) {

				// Button Agenda
				Textures.btnAgendaState = Textures.btnAgendaHov;
				if (!btnAgendaHover) {
					btnAgendaHover = true;
				}
			} else {
				Textures.btnAgendaState = Textures.btnAgendaDef;
				btnAgendaHover = false;
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
