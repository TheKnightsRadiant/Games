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
	public boolean showHelpScreen = false;
	public boolean showCreditScreen = false;
	public boolean showPlayScreen = false;
	
	public boolean volumeOn = true;
	public boolean musicOn = true;
	
	static HelpScreen helpScreen = new HelpScreen();;
	
	BufferedImage titleImage;
	
	BufferedImage btnBeginDef;
	BufferedImage btnBeginPress;
	BufferedImage btnBeginHov;
	BufferedImage btnBeginState;
	
	BufferedImage btnHelpDef;
	BufferedImage btnHelpPress;
	BufferedImage btnHelpHov;
	BufferedImage btnHelpState;
	
	BufferedImage btnBuildDef;
	BufferedImage btnBuildPress;
	BufferedImage btnBuildHov;
	BufferedImage btnBuildState;
	
	BufferedImage btnCreditDef;
	BufferedImage btnCreditPress;
	BufferedImage btnCreditHov;
	BufferedImage btnCreditState;
	
	BufferedImage btnExitDef;
	BufferedImage btnExitPress;
	BufferedImage btnExitHov;
	BufferedImage btnExitState;
	
	BufferedImage btnVolumeDef;
	BufferedImage btnVolumePress;
	BufferedImage btnVolumeHov;
	BufferedImage btnVolumeState;
	
	
	//CONSTRUCTOR
	public Main() throws IOException {
		titleImage = ImageIO.read(getClass().getResource("res/WizardTitle.png"));
		
		btnBeginDef = ImageIO.read(getClass().getResource("res/buttonbegin/ButtonBeginDefault.png"));
		btnBeginHov = ImageIO.read(getClass().getResource("res/buttonbegin/ButtonBeginHovered.png"));
		btnBeginPress = ImageIO.read(getClass().getResource("res/buttonbegin/ButtonBeginPressed.png"));
		btnBeginState = btnBeginDef;
		
		btnHelpDef = ImageIO.read(getClass().getResource("res/buttonhelp/ButtonHelpDefault.png"));
		btnHelpHov = ImageIO.read(getClass().getResource("res/buttonhelp/ButtonHelpHovered.png"));
		btnHelpPress = ImageIO.read(getClass().getResource("res/buttonhelp/ButtonHelpPressed.png"));
		btnHelpState = btnHelpDef;
		
		btnBuildDef = ImageIO.read(getClass().getResource("res/buttonbuild/ButtonBuildDefault.png"));
		btnBuildHov = ImageIO.read(getClass().getResource("res/buttonbuild/ButtonBuildHovered.png"));
		btnBuildPress = ImageIO.read(getClass().getResource("res/buttonbuild/ButtonBuildPressed.png"));
		btnBuildState = btnBuildDef;
		
		btnCreditDef = ImageIO.read(getClass().getResource("res/buttoncredits/ButtonCreditsDefault.png"));
		btnCreditHov = ImageIO.read(getClass().getResource("res/buttoncredits/ButtonCreditsHovered.png"));
		btnCreditPress = ImageIO.read(getClass().getResource("res/buttoncredits/ButtonCreditsPressed.png"));
		btnCreditState = btnCreditDef;
		
		btnExitDef = ImageIO.read(getClass().getResource("res/buttonexit/ButtonExitDefault.png"));
		btnExitHov = ImageIO.read(getClass().getResource("res/buttonexit/ButtonExitHovered.png"));
		btnExitPress = ImageIO.read(getClass().getResource("res/buttonexit/ButtonExitPressed.png"));
		btnExitState = btnExitDef;
		
		btnVolumeDef = ImageIO.red
		
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
		game.addMouseListener(helpScreen);
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
			g.fillRect(0, 0, WIDTH + 10, HEIGHT + 10);
			

			//Title Image

			g.drawImage(titleImage, 50, 50, null);
			
			//Button
			g.drawImage(btnBeginState, (WIDTH - 150) / 2, 225, null);
			g.drawImage(btnBuildState, (WIDTH - 150) / 2, 280, null);
			g.drawImage(btnHelpState, (WIDTH-150)/2, 335, null);
			g.drawImage(btnCreditState, (WIDTH - 150) / 2, 390, null);
			g.drawImage(btnExitState, (WIDTH - 150) / 2, 445, null);
			
			g.setColor(Color.BLACK);
			g.fillRoundRect(730, 530, 40, 40, 5, 5);
			g.fillRoundRect(680, 530, 40, 40, 5, 5);
			g.fillRoundRect(630, 530, 40, 40, 5, 5);
		}
		
		//PLAY SCREEN
		if (showPlayScreen) {
			g.setColor(Color.green);
			g.fillRect(0, 0, WIDTH, HEIGHT);
		}
		
		//HELP SCREEN
		if (showHelpScreen) {
			helpScreen.paint(g);
		}
		
		//BUILD SCREEN
		if (showBuildScreen) {
			g.setColor(Color.red);
			g.fillRect(0, 0, WIDTH, HEIGHT);
		}
		
		//CREDIT SCREEN
		if (showCreditScreen) {
			g.setColor(Color.black);
			g.fillRect(0, 0, WIDTH, HEIGHT);
		}
	}

	
	//MouseListeners
	public void mousePressed(MouseEvent e) {
		if (showTitleScreen) {
			
			//System.out.println(Double.toString(e.getX()) + ", " + Double.toString(e.getY()));
			
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 225 && e.getY() <= 225 + 50) {
				btnBeginState = btnBeginPress;
			}
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 280 && e.getY() <= 280 + 50) {
				btnBuildState = btnBuildPress;
			}
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 335 && e.getY() <= 335 + 50) {
				btnHelpState = btnHelpPress;
			}
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 390 && e.getY() <= 390 + 50) {
				btnCreditState = btnCreditPress;
			}
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 445 && e.getY() <= 445 + 50) {
				btnExitState = btnExitPress;
			}
			if (e.getX() >= 730 && e.getX() <= 730 + 40 &&e.getY() >= 530 && e.getY() <= 530 + 40){
				System.out.println("Settings");
			}
			if (e.getX() >= 680 && e.getX() <= 680 + 40 &&e.getY() >= 530 && e.getY() <= 530 + 40){
				if(volumeOn){
					
				} else {
					
				}
			}
			if (e.getX() >= 630 && e.getX() <= 630 + 40 &&e.getY() >= 530 && e.getY() <= 530 + 40){
				if(musicOn){
					
				} else {
					
				}
			}
			
		}
		
		repaint();
	}
	public void mouseReleased(MouseEvent e) {
		if (showTitleScreen) {
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 225 && e.getY() <= 225 + 50) {
				showTitleScreen = false;
				showPlayScreen = true;
			}
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 280 && e.getY() <= 280 + 50) {
				showTitleScreen = false;
				showBuildScreen = true;
			}
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 335 && e.getY() <= 335 + 50) {
				showTitleScreen = false;
				showHelpScreen = true;
			}
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 390 && e.getY() <= 390 + 50) {
				showTitleScreen = false;
				showCreditScreen = true;
			}
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 445 && e.getY() <= 445 + 50) {
				System.exit(0);
			}
			btnBeginState = btnBeginDef;
			btnBuildState = btnBuildDef;
			btnHelpState = btnHelpDef;
			btnCreditState = btnCreditDef;
			btnExitState = btnExitDef;
		}
		
		repaint();
	}
	public void mouseMoved(MouseEvent e) {
		if (showTitleScreen) {
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 225 && e.getY() <= 225 + 50)
				btnBeginState = btnBeginHov;
			else
				btnBeginState = btnBeginDef;
			
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 280 && e.getY() <= 280 + 50)
				btnBuildState = btnBuildHov;
			else
				btnBuildState = btnBuildDef;
			
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 335 && e.getY() <= 335 + 50)
				btnHelpState = btnHelpHov;
			else
				btnHelpState = btnHelpDef;
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 390 && e.getY() <= 390 + 50)
				btnCreditState = btnCreditHov;
			else
				btnCreditState = btnCreditDef;
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 445 && e.getY() <= 445 + 50)
				btnExitState = btnExitHov;
			else
				btnExitState = btnExitDef;
		}
		
		repaint();
	}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mouseDragged(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
	
}
