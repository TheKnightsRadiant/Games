package com.wizards.main;

import java.applet.AudioClip;
import java.util.Random;

import javax.swing.JApplet;

public class AudioHandler {
	AudioClip menuHoverSound = JApplet.newAudioClip(getClass().getResource("res/audio/MenuHover.wav"));

	AudioClip pageTurnSound = JApplet.newAudioClip(getClass().getResource("res/audio/pageturn/PageTurn.wav"));
	
	
	Random FileChooser = new Random();

	public AudioHandler() {
	}

	public void playMenuHoverSound() {
		if (Main.volumeOn) {
			menuHoverSound.play();
		}
	}

	public void playPageTurn() {
		if (Main.volumeOn) {
			pageTurnSound.play();
			}
		}
	}

