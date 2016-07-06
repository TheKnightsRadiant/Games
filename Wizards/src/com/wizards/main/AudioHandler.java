package com.wizards.main;

import java.applet.AudioClip;
import java.util.Random;

import javax.swing.JApplet;

public class AudioHandler {
	AudioClip buttonHoverSound = JApplet.newAudioClip(getClass().getResource("res/audio/ButtonHover.wav"));

	AudioClip buttonClickSound = JApplet.newAudioClip(getClass().getResource("res/audio/ButtonClick.wav"));
	
	
	Random FileChooser = new Random();

	public AudioHandler() {
	}

	public void playButtonHoverSound() {
		if (Main.volumeOn) {
			buttonHoverSound.play();
		}
	}

	public void playButtonClickSound() {
		if (Main.volumeOn) {
			buttonClickSound.play();
			}
		}
	}

