package com.terracore.handlers;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import com.terracore.storages.Textures;
import com.terracore.wizards.Wizards;

public class HordeMouseHandler implements MouseListener, MouseMotionListener {

	public String currentButton = "null";
	public boolean cardIsSelected = false;
	public boolean cancelOption = false;
	public boolean cancel = false;
	private boolean btnHelpHover = false;

	public int overlayX = 2000;
	public int overlayY = 2000;
	
	private AudioHandler audioHandler = new AudioHandler();

	@Override
	public void mousePressed(MouseEvent e) {
		if (Wizards.showPlayScreenHorde) {

			if (e.getX() >= Wizards.compareToWidth(640) && e.getX() <= Wizards.compareToWidth(640) + 151
					&& e.getY() >= Wizards.compareToHeight(320) && e.getY() <= Wizards.compareToHeight(320) + 201) {
				currentButton = "card1";
				cancelOption = true;
			}
			if (e.getX() >= Wizards.compareToWidth(485) && e.getX() <= Wizards.compareToWidth(485) + 151
					&& e.getY() >= Wizards.compareToHeight(320) && e.getY() <= Wizards.compareToHeight(320) + 201) {
				currentButton = "card2";
				cancelOption = true;
			}
			if (e.getX() >= Wizards.compareToWidth(330) && e.getX() <= Wizards.compareToWidth(330) + 151
					&& e.getY() >= Wizards.compareToHeight(320) && e.getY() <= Wizards.compareToHeight(320) + 201) {
				currentButton = "card3";
				cancelOption = true;
			}
			if (e.getX() >= Wizards.compareToWidth(175) && e.getX() <= Wizards.compareToWidth(175) + 151
					&& e.getY() >= Wizards.compareToHeight(320) && e.getY() <= Wizards.compareToHeight(320) + 201) {
				currentButton = "card4";
				cancelOption = true;
			}
			if (e.getX() >= Wizards.compareToWidth(20) && e.getX() <= Wizards.compareToWidth(20) + 150
					&& e.getY() >=Wizards.compareToHeight(190) && e.getY() <= Wizards.compareToHeight(190) + 50) {
				cancel = true;
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (Wizards.showPlayScreenHorde) {
			if (currentButton == "card1" && e.getX() >= Wizards.compareToWidth(640)
					&& e.getX() <= Wizards.compareToWidth(640) + 151 && e.getY() >= Wizards.compareToHeight(320)
					&& e.getY() <= Wizards.compareToHeight(320) + 201) {
				overlayX = Wizards.compareToWidth(638);
				overlayY = Wizards.compareToHeight(318);
			}
			if (currentButton == "card2" && e.getX() >= Wizards.compareToWidth(485)
					&& e.getX() <= Wizards.compareToWidth(485) + 151 && e.getY() >= Wizards.compareToHeight(320)
					&& e.getY() <= Wizards.compareToHeight(320) + 201) {
				overlayX = Wizards.compareToWidth(483);
				overlayY = Wizards.compareToHeight(318);
			}
			if (currentButton == "card3" && e.getX() >= Wizards.compareToWidth(330)
					&& e.getX() <= Wizards.compareToWidth(330) + 151 && e.getY() >= Wizards.compareToHeight(320)
					&& e.getY() <= Wizards.compareToHeight(320) + 201) {
				overlayX = Wizards.compareToWidth(328);
				overlayY = Wizards.compareToHeight(318);
			}
			if (currentButton == "card4" && e.getX() >= Wizards.compareToWidth(175)
					&& e.getX() <= Wizards.compareToWidth(175) + 151 && e.getY() >= Wizards.compareToHeight(320)
					&& e.getY() <= Wizards.compareToHeight(320) + 201) {
				overlayX = Wizards.compareToWidth(173);
				overlayY = Wizards.compareToHeight(318);
			}
			if (cancel == true && (e.getX() >= Wizards.compareToWidth(20) && e.getX() <= Wizards.compareToWidth(20) + 150
			&& e.getY() >=Wizards.compareToHeight(190) && e.getY() <= Wizards.compareToHeight(190) + 50)) {
			overlayX = 2000;
			overlayY = 2000;
			cancelOption = false;
			Textures.btnHelpState = Textures.btnHelpDef;
			}
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		if (Wizards.showPlayScreenHorde) {
			if (cancelOption == true && (e.getX() >= Wizards.compareToWidth(20) && e.getX() <= Wizards.compareToWidth(20) + 150
					&& e.getY() >=Wizards.compareToHeight(190) && e.getY() <= Wizards.compareToHeight(190) + 50)) {
				Textures.btnHelpState = Textures.btnHelpHov;
				if (!btnHelpHover) {
					audioHandler.playButtonHoverSound();
					btnHelpHover = true;
				} 
			} else {
				Textures.btnHelpState = Textures.btnHelpDef;
				btnHelpHover = false;
			}
		}
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
