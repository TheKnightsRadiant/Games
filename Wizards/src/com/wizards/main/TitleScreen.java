package com.wizards.main;
import java.awt.Color;
import java.awt.Font;
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
		
		JLabel title = new JLabel("Wizards");
		title.setFont(new Font("Baskerville Old Face", Font.ITALIC, 57));
		title.setForeground(Color.RED);
		title.setBounds(535, 70, 200, 50);
		
		getContentPane().add(title);
	}

	public void actionPerformed(ActionEvent e) {		
	}
}
