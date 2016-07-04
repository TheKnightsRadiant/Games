package com.wizards.main;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;

import javax.imageio.*;
import javax.swing.*;

public class Main extends JComponent implements MouseListener, MouseMotionListener {

	// VARIABLES
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

	BufferedImage btnSettingsDef;
	BufferedImage btnSettingsPress;
	BufferedImage btnSettingsHov;
	BufferedImage btnSettingsState;

	BufferedImage btnVolumeDef;
	BufferedImage btnVolumeHov;
	BufferedImage btnVolumeMute;
	BufferedImage btnVolumeMuteHov;
	BufferedImage btnVolumeState;

	BufferedImage btnMusicDef;
	BufferedImage btnMusicHov;
	BufferedImage btnMusicMute;
	BufferedImage btnMusicMuteHov;
	BufferedImage btnMusicState;

	// CONSTRUCTOR
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

		// btnSettingsDef =
		// ImageIO.read(getClass().getResource("res/buttonsettings/ButtonSettingsDefault.png"));
		// btnSettingsHov =
		// ImageIO.read(getClass().getResource("res/buttonmusic/ButtonSettingsHovered.png"));
		// btnSettingsPress =
		// ImageIO.read(getClass().getResource("res/buttonmusic/ButtonSettingsPressed.png"));
		// btnSettingsState = btnSettingsDef;

		btnVolumeDef = ImageIO.read(getClass().getResource("res/buttonvolume/ButtonVolumeDefault.png"));
		btnVolumeHov = ImageIO.read(getClass().getResource("res/buttonvolume/ButtonVolumeHovered.png"));
		btnVolumeMute = ImageIO.read(getClass().getResource("res/buttonvolume/ButtonVolumeMuted.png"));
		btnVolumeMuteHov = ImageIO.read(getClass().getResource("res/buttonvolume/ButtonVolumeMutedHovered.png"));
		btnVolumeState = btnVolumeDef;

		// btnMusicDef =
		// ImageIO.read(getClass().getResource("res/buttonmusic/ButtonMusicDefault.png"));
		// btnMusicHov =
		// ImageIO.read(getClass().getResource("res/buttonmusic/ButtonMusicHovered.png"));
		// btnMusicMute =
		// ImageIO.read(getClass().getResource("res/buttonmusic/ButtonMusicMuted.png"));
		// btnMusicMuteHov =
		// ImageIO.read(getClass().getResource("res/buttonmusic/ButtonMusicMutedHovered.png"));
		// btnMusicState = btnMusicDef;

	}

	// MAIN METHOD
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

	// GRAPHICS
	protected void paintComponent(Graphics g) {

		// TITLE SCREEN
		if (showTitleScreen) {
			// Background
			g.setColor(new Color(244, 231, 129));
			g.fillRect(0, 0, WIDTH + 10, HEIGHT + 10);

			// Title Image

			g.drawImage(titleImage, 50, 50, null);

			// Title Buttons
			g.drawImage(btnBeginState, (WIDTH - 150) / 2, 225, null);
			g.drawImage(btnBuildState, (WIDTH - 150) / 2, 280, null);
			g.drawImage(btnHelpState, (WIDTH - 150) / 2, 335, null);
			g.drawImage(btnCreditState, (WIDTH - 150) / 2, 390, null);
			g.drawImage(btnExitState, (WIDTH - 150) / 2, 445, null);

			// Setting Buttons
			g.drawImage(btnSettingsState, 730, 530, null);
			g.drawImage(btnVolumeState, 680, 530, null);
			g.drawImage(btnMusicState, 630, 530, null);

		}

		// PLAY SCREEN
		if (showPlayScreen) {
			g.setColor(Color.green);
			g.fillRect(0, 0, WIDTH, HEIGHT);
		}

		// HELP SCREEN
		if (showHelpScreen) {
			helpScreen.paint(g);
		}

		// BUILD SCREEN
		if (showBuildScreen) {
			g.setColor(Color.red);
			g.fillRect(0, 0, WIDTH, HEIGHT);
		}

		// CREDIT SCREEN
		if (showCreditScreen) {
			g.setColor(Color.black);
			g.fillRect(0, 0, WIDTH, HEIGHT);
		}
	}

	// MouseListeners
	public void mousePressed(MouseEvent e) {
		if (showTitleScreen) {

			// System.out.println(Double.toString(e.getX()) + ", " +
			// Double.toString(e.getY()));

			// TITLESCREEN BUTTONS
			// Button Begin
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 225
					&& e.getY() <= 225 + 50)
				btnBeginState = btnBeginPress;

			// Button Build
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 280
					&& e.getY() <= 280 + 50) {
				btnBuildState = btnBuildPress;
			}

			// Button Help
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 335
					&& e.getY() <= 335 + 50) {
				btnHelpState = btnHelpPress;
			}

			// Button Credits
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 390
					&& e.getY() <= 390 + 50) {
				btnCreditState = btnCreditPress;
			}

			// Button Exit
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 445
					&& e.getY() <= 445 + 50) {
				btnExitState = btnExitPress;
			}

			// TITLE SETTING BUTTONS
			// Button Settings
			if (e.getX() >= 730 && e.getX() <= 730 + 40 && e.getY() >= 530 && e.getY() <= 530 + 40) {
				btnSettingsState = btnSettingsPress;
			}

			// Volume Button
			if (e.getX() >= 680 && e.getX() <= 680 + 40 && e.getY() >= 530 && e.getY() <= 530 + 40) {
				if (volumeOn) {
					btnVolumeState = btnVolumeMuteHov;
				} else {
					btnVolumeState = btnVolumeHov;
				}
				volumeOn = !volumeOn;
			}

			// Music Button
			if (e.getX() >= 680 && e.getX() <= 680 + 40 && e.getY() >= 530 && e.getY() <= 530 + 40) {
				if (volumeOn) {
					btnMusicState = btnMusicMuteHov;
				} else {
					btnMusicState = btnMusicHov;
				}
				musicOn = !musicOn;
			}
		}

		repaint();
	}

	public void mouseReleased(MouseEvent e) {
		if (showTitleScreen) {

			// TITLESCREEN BUTTONS
			// Button Begin
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 225
					&& e.getY() <= 225 + 50) {
				showTitleScreen = false;
				showPlayScreen = true;
			}

			// Button Build
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 280
					&& e.getY() <= 280 + 50) {
				showTitleScreen = false;
				showBuildScreen = true;
			}

			// Button Help
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 335
					&& e.getY() <= 335 + 50) {
				showTitleScreen = false;
				showHelpScreen = true;
			}

			// Button Credits
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 390
					&& e.getY() <= 390 + 50) {
				showTitleScreen = false;
				showCreditScreen = true;
			}

			// Button Exit
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 445
					&& e.getY() <= 445 + 50) {
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
			// TITLE SCREEN BUTTONS
			// Button Begin
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 225
					&& e.getY() <= 225 + 50) {
				btnBeginState = btnBeginHov;
			} else {
				btnBeginState = btnBeginDef;
			}

			// Button Build
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 280
					&& e.getY() <= 280 + 50) {
				btnBuildState = btnBuildHov;
			} else {
				btnBuildState = btnBuildDef;
			}

			// Button Help
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 335
					&& e.getY() <= 335 + 50) {
				btnHelpState = btnHelpHov;
			} else {
				btnHelpState = btnHelpDef;
			}

			// Button Credit
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 390
					&& e.getY() <= 390 + 50) {
				btnCreditState = btnCreditHov;
			} else {
				btnCreditState = btnCreditDef;
			}

			// Button Exit
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 445
					&& e.getY() <= 445 + 50) {
				btnExitState = btnExitHov;
			} else {
				btnExitState = btnExitDef;
			}

			// TITLE SETTINGS BUTTONS
			// Button Volume
			if (e.getX() >= 680 && e.getX() <= 680 + 40 && e.getY() >= 530 && e.getY() <= 530 + 40) {
				if (volumeOn) {
					btnVolumeState = btnVolumeHov;
				} else {
					btnVolumeState = btnVolumeMuteHov;
				}
			} else {
				if (volumeOn) {
					btnVolumeState = btnVolumeDef;
				} else {
					btnVolumeState = btnVolumeMute;
				}
			}

			// Button Music
			if (e.getX() >= 630 && e.getX() <= 630 + 40 && e.getY() >= 530 && e.getY() <= 530 + 40)
				if (musicOn) {
					btnMusicState = btnMusicHov;
				} else {
					btnMusicState = btnMusicMuteHov;
				}
		} else {
			if (volumeOn) {
				btnMusicState = btnMusicDef;
			} else {
				btnMusicState = btnMusicMute;
			}
		}
		repaint();
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mouseDragged(MouseEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
	}

}
