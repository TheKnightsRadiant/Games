package com.wizards.main;

import java.applet.Applet;
import java.applet.AudioClip;
import javax.swing.JApplet;

public class AudioHandler {
	AudioClip menuHoverSound = JApplet.newAudioClip(getClass().getResource("res/audio/MenuHover.wav"));

	public AudioHandler() {
	}

	public void playMenuHoverSound() {
		if (Main.volumeOn) {
			menuHoverSound.play();
		}
	}
}
