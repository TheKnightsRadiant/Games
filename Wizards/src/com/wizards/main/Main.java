package com.wizards.main;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;

import javax.imageio.*;
import javax.swing.*;

public class Main extends JComponent implements MouseListener, MouseMotionListener{
	
	//VARIABLES
	public int WIDTH = 800;
	public int HEIGHT = 600;
	
	public boolean showTitleScreen = true;
	public boolean showBuildScreen = false;
	public boolean showPlayScreen = false;
	
	BufferedImage btnBeginDef;
	BufferedImage btnBeginPress;
	BufferedImage btnBeginHov;
	BufferedImage btnBeginState;
	
	BufferedImage btnHelpDef;
	BufferedImage btnHelpPress;
	BufferedImage btnHelpHov;
	BufferedImage btnHelpState;
	
	
	//CONSTRUCTOR
	public Main() throws IOException {
		btnBeginDef = ImageIO.read(getClass().getResource("res/buttonbegin/ButtonBeginDefault.png"));
		btnBeginHov = ImageIO.read(getClass().getResource("res/buttonbegin/ButtonBeginHovered.png"));
		btnBeginPress = ImageIO.read(getClass().getResource("res/buttonbegin/ButtonBeginPressed.png"));
		btnBeginState = btnBeginDef;
		
		btnHelpDef = ImageIO.read(getClass().getResource("res/buttonhelp/ButtonHelpDefault.png"));
		btnHelpHov = ImageIO.read(getClass().getResource("res/buttonhelp/ButtonHelpHovered.png"));
		btnHelpPress = ImageIO.read(getClass().getResource("res/buttonhelp/ButtonHelpPressed.png"));
		btnHelpState = btnHelpDef;
		
	}
	
	
	//MAIN METHOD
	public static void main(String[] args) throws IOException {
		
		JFrame window = new JFrame("Wizards");
		Main game = new Main();
		window.add(game);
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		window.setVisible(true);
		
		game.addMouseListener(game);
		game.addMouseMotionListener(game);
		
	}
	public Dimension getPreferredSize() {
		return new Dimension(WIDTH, HEIGHT);
	}
	
	
	//GRAPHICS
	protected void paintComponent(Graphics g) {
		
		//TITLE SCREEN
		if (showTitleScreen) {
			//Background
			g.setColor(new Color(244, 231, 129));
			g.fillRect(0, 0, WIDTH, HEIGHT);
			
			g.setColor(Color.BLACK);
			g.fillRect(50, 50, 700, 150);
			
			//Button
			g.drawImage(btnBeginState, (WIDTH - 150) / 2, 225, null);
			g.drawImage(btnHelpState, (WIDTH-150)/2, 280, null);
		}
		
		//PLAY SCREEN
		if (showPlayScreen) {
			g.setColor(Color.green);
			g.fillRect(0, 0, WIDTH, HEIGHT);
		}
		
	}

	
	//MouseListeners
	public void mousePressed(MouseEvent e) {
		if (showTitleScreen) {
			btnBeginState = btnBeginPress;
		}
		
		repaint();
	}
	public void mouseReleased(MouseEvent e) {
		if (showTitleScreen) {
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 225 && e.getY() <= 225 + 50) {
				showTitleScreen = false;
				showPlayScreen = true;
			}
			btnBeginState = btnBeginDef;
		}
		
		repaint();
	}
	public void mouseMoved(MouseEvent e) {
		if (showTitleScreen) {
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 225 && e.getY() <= 225 + 50)
				btnBeginState = btnBeginHov;
			else
				btnBeginState = btnBeginDef;
		}
		
		repaint();
	}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mouseDragged(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
	
}
