package com.fourH.handlers;

import java.awt.event.*;

import com.fourH.storages.*;
import com.fourH.template.*;

public class MouseHandler implements MouseListener, MouseMotionListener{

	public void mousePressed(MouseEvent e) {
		
	}

	public void mouseReleased(MouseEvent e) {
		
	}

	public void mouseEntered(MouseEvent e) {
		if (Template.showTitleScreen = true){
			
			if (e.getX() >= Template.compareToWidth(5) && e.getX() <= Template.compareToWidth(5) + 150
					&& e.getY() >= Template.compareToHeight(150) && e.getY() <= Template.compareToHeight(150) + 50) {
				Textures.btnAgendaState = Textures.btnAgendaHov;
			}
			
		}
	}
	
	public void mouseExited(MouseEvent e) {
		
	}
	
	public void mouseDragged(MouseEvent e) {}
	public void mouseMoved(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}

}
