package com.wizards.main;

import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Main extends JComponent implements ActionListener, MouseListener, MouseMotionListener {

	// VARIABLES
	public int WIDTH = 800;
	public int HEIGHT = 600;

	public boolean showTitleScreen = true;
	public boolean showBuildScreen = false;
	public boolean showHelpScreen = false;
	public boolean showCreditScreen = false;
	public boolean showPlayScreen = false;
	public boolean showSettingsScreen = false;

	public static boolean volumeOn = true;
	public boolean musicOn = true;

	public boolean btnBeginHover = false;
	public boolean btnHelpHover = false;
	public boolean btnBuildHover = false;
	public boolean btnCreditHover = false;
	public boolean btnExitHover = false;
	public boolean btnSettingsHover = false;
	public boolean btnVolumeHover = false;
	public boolean btnMusicHover = false;
	public boolean btnBackHover = false;
	public boolean btnPrevHover = false;
	public boolean btnNextHover = false;

	HelpScreen helpScreen = new HelpScreen();
	CreditsScreen creditScreen = new CreditsScreen();
	AudioHandler audioHandler = new AudioHandler();

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
	BufferedImage btnSettingsPressHov;
	BufferedImage btnSettingsState;

	BufferedImage btnVolumeDef;
	BufferedImage btnVolumeHov;
	BufferedImage btnVolumeMute;
	BufferedImage btnVolumeMuteHov;
	BufferedImage btnVolumeState;

	// Help Screen
	BufferedImage btnMusicDef;
	BufferedImage btnMusicHov;
	BufferedImage btnMusicMute;
	BufferedImage btnMusicMuteHov;
	BufferedImage btnMusicState;

	BufferedImage btnNextDef;
	BufferedImage btnNextHov;
	BufferedImage btnNextPress;
	BufferedImage btnNextState;

	BufferedImage btnPrevDef;
	BufferedImage btnPrevHov;
	BufferedImage btnPrevPress;
	BufferedImage btnPrevState;

	// Multiple Screens
	BufferedImage btnBackDef;
	BufferedImage btnBackPress;
	BufferedImage btnBackHov;
	BufferedImage btnBackState;

	// CONSTRUCTOR
	public Main() throws IOException {
		titleImage = ImageIO.read(getClass().getResource("res/images/WizardTitle.png"));

		btnBeginDef = ImageIO.read(getClass().getResource("res/images/buttonbegin/ButtonBeginDefault.png"));
		btnBeginHov = ImageIO.read(getClass().getResource("res/images/buttonbegin/ButtonBeginHovered.png"));
		btnBeginPress = ImageIO.read(getClass().getResource("res/images/buttonbegin/ButtonBeginPressed.png"));
		btnBeginState = btnBeginDef;

		btnHelpDef = ImageIO.read(getClass().getResource("res/images/buttonhelp/ButtonHelpDefault.png"));
		btnHelpHov = ImageIO.read(getClass().getResource("res/images/buttonhelp/ButtonHelpHovered.png"));
		btnHelpPress = ImageIO.read(getClass().getResource("res/images/buttonhelp/ButtonHelpPressed.png"));
		btnHelpState = btnHelpDef;

		btnBuildDef = ImageIO.read(getClass().getResource("res/images/buttonbuild/ButtonBuildDefault.png"));
		btnBuildHov = ImageIO.read(getClass().getResource("res/images/buttonbuild/ButtonBuildHovered.png"));
		btnBuildPress = ImageIO.read(getClass().getResource("res/images/buttonbuild/ButtonBuildPressed.png"));
		btnBuildState = btnBuildDef;

		btnCreditDef = ImageIO.read(getClass().getResource("res/images/buttoncredits/ButtonCreditsDefault.png"));
		btnCreditHov = ImageIO.read(getClass().getResource("res/images/buttoncredits/ButtonCreditsHovered.png"));
		btnCreditPress = ImageIO.read(getClass().getResource("res/images/buttoncredits/ButtonCreditsPressed.png"));
		btnCreditState = btnCreditDef;

		btnExitDef = ImageIO.read(getClass().getResource("res/images/buttonexit/ButtonExitDefault.png"));
		btnExitHov = ImageIO.read(getClass().getResource("res/images/buttonexit/ButtonExitHovered.png"));
		btnExitPress = ImageIO.read(getClass().getResource("res/images/buttonexit/ButtonExitPressed.png"));
		btnExitState = btnExitDef;

		btnSettingsDef = ImageIO.read(getClass().getResource("res/images/buttonsettings/ButtonSettingsDefault.png"));
		btnSettingsHov = ImageIO.read(getClass().getResource("res/images/buttonsettings/ButtonSettingsHovered.png"));
		btnSettingsPress = ImageIO.read(getClass().getResource("res/images/buttonsettings/ButtonSettingsPressed.png"));
		btnSettingsPressHov = ImageIO.read(getClass().getResource("res/images/buttonsettings/ButtonSettingsPressHovered.png"));
		btnSettingsState = btnSettingsDef;

		btnVolumeDef = ImageIO.read(getClass().getResource("res/images/buttonvolume/ButtonVolumeDefault.png"));
		btnVolumeHov = ImageIO.read(getClass().getResource("res/images/buttonvolume/ButtonVolumeHovered.png"));
		btnVolumeMute = ImageIO.read(getClass().getResource("res/images/buttonvolume/ButtonVolumeMuted.png"));
		btnVolumeMuteHov = ImageIO.read(getClass().getResource("res/images/buttonvolume/ButtonVolumeMutedHovered.png"));
		btnVolumeState = btnVolumeDef;

		// Help Screen
		btnMusicDef = ImageIO.read(getClass().getResource("res/images/buttonmusic/ButtonMusicDefault.png"));
		btnMusicHov = ImageIO.read(getClass().getResource("res/images/buttonmusic/ButtonMusicHovered.png"));
		btnMusicMute = ImageIO.read(getClass().getResource("res/images/buttonmusic/ButtonMusicMuted.png"));
		btnMusicMuteHov = ImageIO.read(getClass().getResource("res/images/buttonmusic/ButtonMusicMutedHovered.png"));
		btnMusicState = btnMusicDef;

		btnNextDef = ImageIO.read(getClass().getResource("res/images/buttonnext/ButtonNextDefault.png"));
		btnNextHov = ImageIO.read(getClass().getResource("res/images/buttonnext/ButtonNextHovered.png"));
		btnNextPress = ImageIO.read(getClass().getResource("res/images/buttonnext/ButtonNextPressed.png"));
		btnNextState = btnNextDef;

		btnPrevDef = ImageIO.read(getClass().getResource("res/images/buttonprev/ButtonPrevDefault.png"));
		btnPrevHov = ImageIO.read(getClass().getResource("res/images/buttonprev/ButtonPrevHovered.png"));
		btnPrevPress = ImageIO.read(getClass().getResource("res/images/buttonprev/ButtonPrevPressed.png"));
		btnPrevState = btnPrevPress;

		// Multiple Screens
		btnBackDef = ImageIO.read(getClass().getResource("res/images/buttonback/ButtonBackDefault.png"));
		btnBackHov = ImageIO.read(getClass().getResource("res/images/buttonback/ButtonBackHovered.png"));
		btnBackPress = ImageIO.read(getClass().getResource("res/images/buttonback/ButtonBackPressed.png"));
		btnBackState = btnBackDef;

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
		game.addMouseMotionListener(game);

		Timer t = new Timer(30, game);
		t.start();

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

		// SETTINGS SCREEN
		if (showSettingsScreen) {
			g.setColor(new Color(200, 175, 75));
			g.fillRect(550, 240, 230, 280);
			
			g.setColor(new Color(255, 250, 150));
			g.fillRect(555, 245, 220, 30);
			
			g.setColor(new Color(192, 143, 38));
			g.setFont(new Font("ZapfDingbats", Font.BOLD, 18));
			g.drawString("Settings", 625, 265);
		}
		
		// PLAY SCREEN
		if (showPlayScreen) {
			g.setColor(Color.green);
			g.fillRect(0, 0, WIDTH, HEIGHT);
		}

		// HELP SCREEN
		if (showHelpScreen) {
			helpScreen.paint(g);

			// Buttons
			g.drawImage(btnNextState, 650, 50, null);
			g.drawImage(btnPrevState, 550, 50, null);
			g.drawImage(btnBackState, 20, 40, null);
		}

		// BUILD SCREEN
		if (showBuildScreen) {
			g.setColor(Color.red);
			g.fillRect(0, 0, WIDTH, HEIGHT);
		}

		// CREDIT SCREEN
		if (showCreditScreen) {
			creditScreen.paint(g);

			// Buttons
			g.drawImage(btnBackState, 20, 40, null);
		}
	}

	// ActionListener
	public void actionPerformed(ActionEvent e) {
		creditScreen.y--;

		repaint();
	}

	// MouseListeners
	public void mousePressed(MouseEvent e) {

		// System.out.println(Double.toString(e.getX()) + ", " +
		// Double.toString(e.getY()));

		if (showTitleScreen) {

			// TITLESCREEN BUTTONS
			// Button Begin
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 225
					&& e.getY() <= 225 + 50) {
				btnBeginState = btnBeginPress;
			}

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

			// Button Music
			if (e.getX() >= 630 && e.getX() <= 630 + 40 && e.getY() >= 530 && e.getY() <= 530 + 40) {
				if (musicOn) {
					btnMusicState = btnMusicMuteHov;
				} else {
					btnMusicState = btnMusicHov;
				}
				musicOn = !musicOn;
			}

			// HELP BUTTONS
		} else if (showHelpScreen) {

			// Button Back
			if (e.getX() >= 20 && e.getX() <= 20 + 150 && e.getY() >= 40 && e.getY() <= 40 + 50) {
				btnBackState = btnBackPress;
			}

			// Button Previous
			if (e.getX() >= 550 && e.getX() <= 550 + 40 && e.getY() >= 50 && e.getY() <= 50 + 40) {
				if (helpScreen.pageNumber > 1) {
					btnPrevState = btnPrevPress;
					btnNextState = btnNextDef;
					helpScreen.pageNumber--;
				} else {
					btnPrevState = btnPrevPress;
				}
			}

			// Button Next
			if (e.getX() >= 650 && e.getX() <= 650 + 40 && e.getY() >= 50 && e.getY() <= 50 + 40) {
				if (helpScreen.pageNumber < helpScreen.maxPages) {
					btnNextState = btnNextPress;
					btnPrevState = btnPrevDef;
					helpScreen.pageNumber++;
				}
			}
		} else if (showCreditScreen) {

			// Button Back
			if (e.getX() >= 20 && e.getX() <= 20 + 150 && e.getY() >= 40 && e.getY() <= 40 + 50) {
				btnBackState = btnBackPress;
			}
		}

		repaint();
	}

	public void mouseReleased(MouseEvent e) {
		if (showTitleScreen) {

			// TITLESCREEN BUTTONS
			if (showTitleScreen) {
				// Button Begin
				if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 225
						&& e.getY() <= 225 + 50) {
					showTitleScreen = false;
					showPlayScreen = true;
					btnBeginState = btnBeginHov;
				}

				// Button Build
				if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 280
						&& e.getY() <= 280 + 50) {
					showTitleScreen = false;
					showBuildScreen = true;
					btnBuildState = btnBuildHov;
				}

				// Button Help
				if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 335
						&& e.getY() <= 335 + 50) {
					showTitleScreen = false;
					showHelpScreen = true;
					btnHelpState = btnHelpHov;
				}

				// Button Credits
				if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 390
						&& e.getY() <= 390 + 50) {
					showTitleScreen = false;
					showCreditScreen = true;
					creditScreen.y = 610;
					btnCreditState = btnCreditHov;
				}

				// Button Exit
				if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 445
						&& e.getY() <= 445 + 50) {
					btnExitState = btnExitHov;
					System.exit(0);
				}

				// Button Settings
				if (e.getX() >= 730 && e.getX() <= 730 + 40 && e.getY() >= 530 && e.getY() <= 530 + 40) {
					showSettingsScreen = !showSettingsScreen;
					if (showSettingsScreen) {
						btnSettingsState = btnSettingsPressHov;
					}
					else {
						btnSettingsState = btnSettingsHov;
					}
				}

			}
		} else if (showHelpScreen) {

			// Button Back
			if (e.getX() >= 20 && e.getX() <= 20 + 150 && e.getY() >= 40 && e.getY() <= 40 + 50) {
				showHelpScreen = false;
				showTitleScreen = true;
				btnBackState = btnBackDef;
			}

			// Button Previous
			if (e.getX() >= 550 && e.getX() <= 550 + 40 && e.getY() >= 50 && e.getY() <= 50 + 40) {
				if (helpScreen.pageNumber > 1) {
					btnPrevState = btnPrevHov;
				}
				audioHandler.playPageTurn();
			}

			// Button Next
			if (e.getX() >= 650 && e.getX() <= 650 + 40 && e.getY() >= 50 && e.getY() <= 50 + 40) {
				if (helpScreen.pageNumber < helpScreen.maxPages) {
					btnNextState = btnNextHov;
				}
				audioHandler.playPageTurn();
			}
		} else if (showCreditScreen) {

			// Button Back
			if (e.getX() >= 20 && e.getX() <= 20 + 150 && e.getY() >= 40 && e.getY() <= 40 + 50) {
				showCreditScreen = false;
				showTitleScreen = true;
				btnBackState = btnBackDef;
			}
		}

		repaint();
	}

	public void mouseMoved(MouseEvent e) {

		// TITLE SCREEN BUTTONS
		if (showTitleScreen) {
			// Button Begin
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 225
					&& e.getY() <= 225 + 50) {
				btnBeginState = btnBeginHov;
				if (!btnBeginHover) {
					audioHandler.playMenuHoverSound();
					btnBeginHover = true;
				}
			} else {
				btnBeginState = btnBeginDef;
				btnBeginHover = false;
			}

			// Button Build
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 280
					&& e.getY() <= 280 + 50) {
				btnBuildState = btnBuildHov;
				if (!btnBuildHover) {
					audioHandler.playMenuHoverSound();
					btnBuildHover = true;
				}
			} else {
				btnBuildState = btnBuildDef;
				btnBuildHover = false;
			}

			// Button Help
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 335
					&& e.getY() <= 335 + 50) {
				btnHelpState = btnHelpHov;
				if (!btnHelpHover) {
					audioHandler.playMenuHoverSound();
					btnHelpHover = true;
				}
			} else {
				btnHelpState = btnHelpDef;
				btnHelpHover = false;
			}

			// Button Credit
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 390
					&& e.getY() <= 390 + 50) {
				btnCreditState = btnCreditHov;
				if (!btnCreditHover) {
					audioHandler.playMenuHoverSound();
					btnCreditHover = true;
				}
			} else {
				btnCreditState = btnCreditDef;
				btnCreditHover = false;
			}

			// Button Exit
			if (e.getX() >= (WIDTH - 150) / 2 && e.getX() <= (WIDTH - 150) / 2 + 150 && e.getY() >= 445
					&& e.getY() <= 445 + 50) {
				btnExitState = btnExitHov;
				if (!btnExitHover) {
					audioHandler.playMenuHoverSound();
					btnExitHover = true;
				}
			} else {
				btnExitState = btnExitDef;
				btnExitHover = false;
			}

			// TITLE SETTINGS BUTTONS
			// Button Settings
			if (e.getX() >= 730 && e.getX() <= 730 + 40 && e.getY() >= 530 && e.getY() <= 530 + 40) {

				if (showSettingsScreen) {
					btnSettingsState = btnSettingsPressHov;
				}
				else {
					btnSettingsState = btnSettingsHov;
				}
				if (!btnSettingsHover) {
					audioHandler.playMenuHoverSound();
					btnSettingsHover = true;
				}
			} else {
				if (showSettingsScreen) {
					btnSettingsState = btnSettingsPress;
				}
				else {
					btnSettingsState = btnSettingsDef;
				}
				btnSettingsHover = false;
			}

			// Button Volume
			if (e.getX() >= 680 && e.getX() <= 680 + 40 && e.getY() >= 530 && e.getY() <= 530 + 40) {

				if (!btnVolumeHover) {
					audioHandler.playMenuHoverSound();
					btnVolumeHover = true;
				}

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
				btnVolumeHover = false;
			}

			// Button Music
			if (e.getX() >= 630 && e.getX() <= 630 + 40 && e.getY() >= 530 && e.getY() <= 530 + 40) {

				if (!btnMusicHover) {
					audioHandler.playMenuHoverSound();
					btnMusicHover = true;
				}

				if (musicOn) {
					btnMusicState = btnMusicHov;
				} else {
					btnMusicState = btnMusicMuteHov;
				}
			} else {
				if (musicOn) {
					btnMusicState = btnMusicDef;
				} else {
					btnMusicState = btnMusicMute;
				}
				btnMusicHover = false;
			}

		} else if (showHelpScreen) {

			// Button Back
			if (e.getX() >= 20 && e.getX() <= 20 + 150 && e.getY() >= 40 && e.getY() <= 40 + 50) {
				btnBackState = btnBackHov;
				if (!btnBackHover) {
					audioHandler.playMenuHoverSound();
					btnBackHover = true;
				}
			} else {
				btnBackState = btnBackDef;
				btnBackHover = false;
			}

			// Button Previous
			if (helpScreen.pageNumber > 1) {
				if (e.getX() >= 550 && e.getX() <= 550 + 40 && e.getY() >= 50 && e.getY() <= 50 + 40) {
					btnPrevState = btnPrevHov;
					if (!btnPrevHover) {
						audioHandler.playMenuHoverSound();
						btnPrevHover = true;
					}
				} else {
					btnPrevHover = false;
					btnPrevState = btnPrevDef;
				}
			} else {
				btnPrevState = btnPrevPress;
			}

			// Button Next
			if (helpScreen.pageNumber < helpScreen.maxPages) {
				if (e.getX() >= 650 && e.getX() <= 650 + 40 && e.getY() >= 50 && e.getY() <= 50 + 40) {
					btnNextState = btnNextHov;
					if (!btnNextHover) {
						audioHandler.playMenuHoverSound();
						;
						btnNextHover = true;
					}
				} else {
					btnNextHover = false;
					btnNextState = btnNextDef;
				}
			} else {
				btnNextState = btnNextPress;
			}

		} else if (showCreditScreen) {

			// Button Back
			if (e.getX() >= 20 && e.getX() <= 20 + 150 && e.getY() >= 40 && e.getY() <= 40 + 50) {
				btnBackState = btnBackHov;
				if (!btnBackHover) {
					if (volumeOn) {
						audioHandler.playMenuHoverSound();
					}
					btnBackHover = true;
				}
			} else {
				btnBackState = btnBackDef;
				btnBackHover = false;
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
