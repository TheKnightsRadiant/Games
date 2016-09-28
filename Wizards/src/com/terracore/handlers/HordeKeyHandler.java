package com.terracore.handlers;

import java.awt.event.*;

import com.terracore.wizards.*;

public class HordeKeyHandler implements KeyListener{
	
	public static boolean menuScreen;
	
	public HordeKeyHandler() {
		menuScreen = false;
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
			if (e.getKeyCode() == KeyEvent.VK_ESCAPE && menuScreen == false) {
				PauseMenuScreen.scrollVel = 20;
				Wizards.showPauseMenuScreen = true;
			}
			if (e.getKeyCode() == KeyEvent.VK_ESCAPE && menuScreen == true) {
				PauseMenuScreen.scrollVel = -20;
			}
		}
	}

}
