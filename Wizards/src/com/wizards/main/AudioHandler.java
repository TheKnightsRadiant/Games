package com.wizards.main;

import java.applet.Applet;
import java.applet.AudioClip;
import javax.swing.JApplet;

public class AudioHandler {
	
	static AudioClip track1 = JApplet.newAudioClip(getClass().getResource("res/music/WizardsTrack1.wav"));
	
	public static void startMusic() {
		((Applet) track1).start();
	}
	
}
