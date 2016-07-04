package com.wizards.main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TitleScreen extends JFrame implements ActionListener {
	public TitleScreen() {
		super("Wizards v1.1.1");
		setBounds(265, 100, 1280, 800);
		getContentPane().setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {		
	}
}
