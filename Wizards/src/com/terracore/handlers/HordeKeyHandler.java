package com.terracore.handlers;

import java.awt.event.*;

import com.terracore.wizards.*;

public class HordeKeyHandler implements KeyListener {

	public HordeKeyHandler() {

		PauseMenuScreen.startY = Wizards.compareToHeight(-400);
		PauseMenuScreen.y = PauseMenuScreen.startY;
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (Wizards.showPlayScreenHorde) {
			if (e.getKeyCode() == KeyEvent.VK_ESCAPE && Wizards.showMenuScreen == false) {
				PauseMenuScreen.scrollVel = 20;
				Wizards.showPauseMenuScreen = true;
			}
			if (e.getKeyCode() == KeyEvent.VK_ESCAPE && Wizards.showMenuScreen == true) {
				PauseMenuScreen.scrollVel = -20;
			}
		}
	}

}
