package com.terracore.handlers;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import com.terracore.storages.Textures;
import com.terracore.wizards.Wizards;

public class HordeMouseHandler implements MouseListener, MouseMotionListener {
	
	String currentButton;

	@Override
	public void mousePressed(MouseEvent e) {
		if (Wizards.showPlayScreenHorde) {
			
			if(e.getX() >= Wizards.centerToWidth(640) && e.getX() <= Wizards.centerToWidth(640) + 151
					&& e.getY() >=Wizards.centerToHeight(320) && e.getY() <= Wizards.centerToHeight(320) + 201) {
				currentButton = "card1";
			}
			if(e.getX() >= Wizards.centerToWidth(485) && e.getX() <= Wizards.centerToWidth(485) + 151
					&& e.getY() >=Wizards.centerToHeight(320) && e.getY() <= Wizards.centerToHeight(320) + 201) {
				currentButton = "card2";
			}
			if(e.getX() >= Wizards.centerToWidth(330) && e.getX() <= Wizards.centerToWidth(330) + 151
					&& e.getY() >=Wizards.centerToHeight(320) && e.getY() <= Wizards.centerToHeight(320) + 201) {
				currentButton = "card3";
			}
			if(e.getX() >= Wizards.centerToWidth(175) && e.getX() <= Wizards.centerToWidth(175) + 151
					&& e.getY() >=Wizards.centerToHeight(320) && e.getY() <= Wizards.centerToHeight(320) + 201) {
				currentButton = "card4";
			}
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (Wizards.showPlayScreenHorde) {
			if (currentButton == "card1" && e.getX() >= Wizards.centerToWidth(640) && e.getX() <= Wizards.centerToWidth(640) + 151
					&& e.getY() >=Wizards.centerToHeight(320) && e.getY() <= Wizards.centerToHeight(320) + 201) {
				
			}
			if (currentButton == "card2" && e.getX() >= Wizards.centerToWidth(485) && e.getX() <= Wizards.centerToWidth(485) + 151
					&& e.getY() >=Wizards.centerToHeight(320) && e.getY() <= Wizards.centerToHeight(320) + 201) {
				
			}
			if (currentButton == "card3" && e.getX() >= Wizards.centerToWidth(330) && e.getX() <= Wizards.centerToWidth(330) + 151
					&& e.getY() >=Wizards.centerToHeight(320) && e.getY() <= Wizards.centerToHeight(320) + 201) {
				
			}
			if (currentButton == "card4" && e.getX() >= Wizards.centerToWidth(175) && e.getX() <= Wizards.centerToWidth(175) + 151
					&& e.getY() >=Wizards.centerToHeight(320) && e.getY() <= Wizards.centerToHeight(320) + 201) {
				
			}
		}
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

}
