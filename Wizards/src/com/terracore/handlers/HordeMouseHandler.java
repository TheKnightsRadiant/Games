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

	public int overlayX = 2000;
	public int overlayY = 2000;

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
			//if (e.getX() >= Wizards.compareToWidth(x) && e.getX() <= Wizards.compareToWidth(x) + x
					//&& e.getY() >=Wizards.compareToHeight(y) && e.getY() <= Wizards.compareToHeight(y) + y) {
				//cancel = true;
			//}
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
			//if cancel == true && (e.getX() >= Wizards.compareToWidth(x) && e.getX() <= Wizards.compareToWidth(x) + x
			//&& e.getY() >=Wizards.compareToHeight(y) && e.getY() <= Wizards.compareToHeight(y) + y) {
			//overlayX = 2000;
			//overlayY = 2000;
			//}
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
