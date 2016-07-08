package com.terracore.handlers;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import com.terracore.wizards.CreditsScreen;
import com.terracore.wizards.HelpScreen;
import com.terracore.wizards.TitleScreen;
import com.terracore.wizards.Wizards;

public class MouseHandler implements MouseListener, MouseMotionListener {

	String currentButton;

	private boolean btnBeginHover = false;
	private boolean btnHelpHover = false;
	private boolean btnBuildHover = false;
	private boolean btnCreditHover = false;
	private boolean btnExitHover = false;
	private boolean btnSettingsHover = false;
	private boolean btnVolumeHover = false;
	private boolean btnMusicHover = false;
	private boolean btnBackHover = false;
	private boolean btnPrevHover = false;
	private boolean btnNextHover = false;

	AudioHandler audioHandler = new AudioHandler();

	@Override
	public void mousePressed(MouseEvent e) {
		if (Wizards.showTitleScreen) {

			// TITLESCREEN BUTTONS
			// Button Begin
			if (e.getX() >= (Wizards.WIDTH - 150) / 2 && e.getX() <= (Wizards.WIDTH - 150) / 2 + 150
					&& e.getY() >= Wizards.HEIGHT * 225 / 600 && e.getY() <= Wizards.HEIGHT * 225 / 600 + 50) {
				TitleScreen.btnBeginState = TitleScreen.btnBeginPress;
				currentButton = "Begin";
			}

			// Button Build
			if (e.getX() >= (Wizards.WIDTH - 150) / 2 && e.getX() <= (Wizards.WIDTH - 150) / 2 + 150
					&& e.getY() >= Wizards.HEIGHT * 280 / 600 && e.getY() <= Wizards.HEIGHT * 280 / 600 + 50) {
				TitleScreen.btnBuildState = TitleScreen.btnBuildPress;
				currentButton = "Build";
			}

			// Button Help
			if (e.getX() >= (Wizards.WIDTH - 150) / 2 && e.getX() <= (Wizards.WIDTH - 150) / 2 + 150
					&& e.getY() >= Wizards.HEIGHT * 335 / 600 && e.getY() <= Wizards.HEIGHT * 335 / 600 + 50) {
				TitleScreen.btnHelpState = TitleScreen.btnHelpPress;
				currentButton = "Help";
			}

			// Button Credits
			if (e.getX() >= (Wizards.WIDTH - 150) / 2 && e.getX() <= (Wizards.WIDTH - 150) / 2 + 150
					&& e.getY() >= Wizards.HEIGHT * 390 / 600 && e.getY() <= Wizards.HEIGHT * 390 / 600 + 50) {
				TitleScreen.btnCreditState = TitleScreen.btnCreditPress;
				currentButton = "Credits";
			}

			// Button Exit
			if (e.getX() >= (Wizards.WIDTH - 150) / 2 && e.getX() <= (Wizards.WIDTH - 150) / 2 + 150
					&& e.getY() >= Wizards.HEIGHT * 445 / 600 && e.getY() <= Wizards.HEIGHT * 445 / 600 + 50) {
				TitleScreen.btnExitState = TitleScreen.btnExitPress;
				currentButton = "Exit";
			}

			// TITLE SETTING BUTTONS
			// Button Settings
			if (e.getX() >= 730 && e.getX() <= 730 + 40 && e.getY() >= 510 && e.getY() <= 510 + 40) {
				TitleScreen.btnSettingsState = TitleScreen.btnSettingsPress;
				currentButton = "Settings";
			}

			// Button Volume
			if (e.getX() >= Wizards.WIDTH * 680 / 800 && e.getX() <= Wizards.WIDTH * 680 / 800 + 40
					&& e.getY() >= Wizards.HEIGHT * 510 / 600 && e.getY() <= Wizards.HEIGHT * 510 / 600 + 40) {
				currentButton = "Volume";
			}

			// Button Music
			if (e.getX() >= Wizards.WIDTH * 630 / 800 && e.getX() <= Wizards.WIDTH * 630 / 800 + 40
					&& e.getY() >= Wizards.HEIGHT * 510 / 600 && e.getY() <= Wizards.HEIGHT * 510 / 600 + 40) {
				currentButton = "Music";
			}

			// HELP BUTTONS
		} else if (Wizards.showHelpScreen) {

			// Button Back
			if (e.getX() >= Wizards.WIDTH * 20 / 800 && e.getX() <= Wizards.WIDTH * 20 / 800 + 150
					&& e.getY() >= Wizards.HEIGHT * 40 / 600 && e.getY() <= Wizards.HEIGHT * 40 / 600 + 50) {
				HelpScreen.btnBackState = HelpScreen.btnBackPress;
				currentButton = "Back";
			}

			// Button Previous
			if (e.getX() >= Wizards.WIDTH * 550 / 800 && e.getX() <= Wizards.WIDTH * 550 / 800 + 40
					&& e.getY() >= Wizards.HEIGHT * 50 / 600 && e.getY() <= Wizards.HEIGHT * 50 / 600 + 40) {
				if (HelpScreen.pageNumber > 1) {
					HelpScreen.btnPrevState = HelpScreen.btnPrevPress;
				} else {
					HelpScreen.btnPrevState = HelpScreen.btnPrevPress;
				}
				currentButton = "Previous";
			}

			// Button Next
			if (e.getX() >= Wizards.WIDTH * 650 / 800 && e.getX() <= Wizards.WIDTH * 650 / 800 + 40
					&& e.getY() >= Wizards.HEIGHT * 50 / 600 && e.getY() <= Wizards.HEIGHT * 50 / 600 + 40) {
				if (HelpScreen.pageNumber < HelpScreen.maxPages) {
					HelpScreen.btnNextState = HelpScreen.btnNextPress;
				} else {
					HelpScreen.btnNextState = HelpScreen.btnNextPress;
				}
				currentButton = "Next";
			}
		} else if (Wizards.showCreditsScreen) {
			// Button Back
			if (e.getX() >= Wizards.WIDTH * 20 / 800 && e.getX() <= Wizards.WIDTH * 20 / 800 + 150
					&& e.getY() >= Wizards.HEIGHT * 40 / 600 && e.getY() <= Wizards.HEIGHT * 40 / 600 + 50) {
				CreditsScreen.btnBackState = CreditsScreen.btnBackPress;
				currentButton = "Back";
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {

		// TITLESCREEN BUTTONS
		if (Wizards.showTitleScreen) {

			// Settings Unclick (Checks if you click outside of the settings
			// box, exempts title settings buttons)
			if (Wizards.showSettingsScreen
					&& !(e.getX() >= Wizards.WIDTH * 550 / 800 && e.getY() >= Wizards.HEIGHT * 220 / 600
							&& e.getX() <= Wizards.WIDTH * 550 / 800 + Wizards.WIDTH * 230 / 800
							&& e.getY() <= Wizards.HEIGHT * 220 / 600 + Wizards.HEIGHT * 280 / 600)
					&& !(e.getX() >= Wizards.WIDTH * 730 / 800 && e.getX() <= Wizards.WIDTH * 730 / 800 + 40
							&& e.getY() >= Wizards.HEIGHT * 510 / 600 && e.getY() <= Wizards.HEIGHT * 510 / 600 + 40)
					&& !(e.getX() >= Wizards.WIDTH * 680 / 800 && e.getX() <= Wizards.WIDTH * 680 / 800 + 40
							&& e.getY() >= Wizards.HEIGHT * 510 / 600 && e.getY() <= Wizards.HEIGHT * 510 / 600 + 40)
					&& !(e.getX() >= Wizards.WIDTH * 630 / 800 && e.getX() <= Wizards.WIDTH * 630 / 800 + 40
							&& e.getY() >= Wizards.HEIGHT * 510 / 600 && e.getY() <= Wizards.HEIGHT * 510 / 600 + 40)) {
				Wizards.showSettingsScreen = false;
				TitleScreen.btnSettingsState = TitleScreen.btnSettingsDef;
			}

			// Button Begin
			if (currentButton == "Begin" && e.getX() >= (Wizards.WIDTH - 150) / 2
					&& e.getX() <= (Wizards.WIDTH - 150) / 2 + 150 && e.getY() >= Wizards.HEIGHT * 225 / 600
					&& e.getY() <= Wizards.HEIGHT * 225 / 600 + 50) {
				Wizards.showTitleScreen = false;
				Wizards.showBeginScreen = true;
				TitleScreen.btnBeginState = TitleScreen.btnBeginDef;
				audioHandler.playButtonClickSound();
			}

			// Button Build
			if (currentButton == "Build" && e.getX() >= (Wizards.WIDTH - 150) / 2 && e.getX() <= (Wizards.WIDTH - 150) / 2 + 150
					&& e.getY() >= Wizards.HEIGHT * 280 / 600 && e.getY() <= Wizards.HEIGHT * 280 / 600 + 50) {
				Wizards.showTitleScreen = false;
				Wizards.showBuildScreen = true;
				TitleScreen.btnBuildState = TitleScreen.btnBuildDef;
				audioHandler.playButtonClickSound();
			}

			// Button Help
			if (currentButton == "Help" && e.getX() >= (Wizards.WIDTH - 150) / 2 && e.getX() <= (Wizards.WIDTH - 150) / 2 + 150
					&& e.getY() >= Wizards.HEIGHT * 335 / 600 && e.getY() <= Wizards.HEIGHT * 335 / 600 + 50) {
				Wizards.showTitleScreen = false;
				Wizards.showHelpScreen = true;
				TitleScreen.btnHelpState = TitleScreen.btnHelpDef;
				audioHandler.playButtonClickSound();
			}

			// Button Credits
			if (currentButton == "Credits" && e.getX() >= (Wizards.WIDTH - 150) / 2 && e.getX() <= (Wizards.WIDTH - 150) / 2 + 150
					&& e.getY() >= Wizards.HEIGHT * 390 / 600 && e.getY() <= Wizards.HEIGHT * 390 / 600 + 50) {
				Wizards.showTitleScreen = false;
				Wizards.showCreditsScreen = true;
				TitleScreen.btnCreditState = TitleScreen.btnCreditDef;
				audioHandler.playButtonClickSound();
			}

			// Button Exit
			if (currentButton == "Exit" && e.getX() >= (Wizards.WIDTH - 150) / 2 && e.getX() <= (Wizards.WIDTH - 150) / 2 + 150
					&& e.getY() >= Wizards.HEIGHT * 445 / 600 && e.getY() <= Wizards.HEIGHT * 445 / 600 + 50) {
				TitleScreen.btnExitState = TitleScreen.btnExitDef;
				audioHandler.playButtonClickSound();
				Wizards.stop();
			}

			// Button Settings
			if (currentButton == "Settings" && e.getX() >= Wizards.WIDTH * 730 / 800 && e.getX() <= Wizards.WIDTH * 730 / 800 + 40
					&& e.getY() >= Wizards.HEIGHT * 510 / 600 && e.getY() <= Wizards.HEIGHT * 510 / 600 + 40) {
				Wizards.showSettingsScreen = !Wizards.showSettingsScreen;
				audioHandler.playButtonClickSound();
				if (Wizards.showSettingsScreen) {
					TitleScreen.btnSettingsState = TitleScreen.btnSettingsPressHov;
				} else {
					TitleScreen.btnSettingsState = TitleScreen.btnSettingsHov;
				}
			}

			// Button Volume
			if (currentButton == "Volume" && e.getX() >= Wizards.WIDTH * 680 / 800 && e.getX() <= Wizards.WIDTH * 680 / 800 + 40
					&& e.getY() >= Wizards.HEIGHT * 510 / 600 && e.getY() <= Wizards.HEIGHT * 510 / 600 + 40) {
				if (Wizards.volumeOn) {
					TitleScreen.btnVolumeState = TitleScreen.btnVolumeMuteHov;
				} else {
					TitleScreen.btnVolumeState = TitleScreen.btnVolumeHov;
				}
				Wizards.volumeOn = !Wizards.volumeOn;
				audioHandler.playButtonClickSound();
			}

			// Button Music
			if (currentButton == "Music" && e.getX() >= Wizards.WIDTH * 630 / 800 && e.getX() <= Wizards.WIDTH * 630 / 800 + 40
					&& e.getY() >= Wizards.HEIGHT * 510 / 600 && e.getY() <= Wizards.HEIGHT * 510 / 600 + 40) {
				if (Wizards.musicOn) {
					TitleScreen.btnMusicState = TitleScreen.btnMusicMuteHov;
				} else {
					TitleScreen.btnMusicState = TitleScreen.btnMusicHov;
				}
				Wizards.musicOn = !Wizards.musicOn;
				audioHandler.playButtonClickSound();

			}
		} else if (Wizards.showHelpScreen) {

			// Button Back
			if (currentButton == "Back" && e.getX() >= Wizards.WIDTH * 20 / 800 && e.getX() <= Wizards.WIDTH * 20 / 800 + 150
					&& e.getY() >= Wizards.HEIGHT * 40 / 600 && e.getY() <= Wizards.HEIGHT * 40 / 600 + 50) {
				HelpScreen.btnPrevState = HelpScreen.btnPrevPress;
				HelpScreen.btnNextState = HelpScreen.btnNextDef;
				HelpScreen.pageNumber = 1;
				Wizards.showHelpScreen = false;
				Wizards.showTitleScreen = true;
				HelpScreen.btnBackState = HelpScreen.btnBackDef;
				audioHandler.playButtonClickSound();
			}

			// Button Previous
			if (currentButton == "Previous" && e.getX() >= Wizards.WIDTH * 550 / 800 && e.getX() <= Wizards.WIDTH * 550 / 800 + 40
					&& e.getY() >= Wizards.HEIGHT * 50 / 600 && e.getY() <= Wizards.HEIGHT * 50 / 600 + 40) {
				if (HelpScreen.pageNumber > 1) {
					HelpScreen.btnNextState = HelpScreen.btnNextDef;
					HelpScreen.pageNumber--;
					audioHandler.playButtonClickSound();
				}
				if (HelpScreen.pageNumber > 1) {
					HelpScreen.btnPrevState = HelpScreen.btnPrevHov;
				}
			}

			// Button Next
			if (currentButton == "Next" && e.getX() >= Wizards.WIDTH * 650 / 800 && e.getX() <= Wizards.WIDTH * 650 / 800 + 40
					&& e.getY() >= Wizards.HEIGHT * 50 / 600 && e.getY() <= Wizards.HEIGHT * 50 / 600 + 40) {
				if (HelpScreen.pageNumber < HelpScreen.maxPages) {
					HelpScreen.btnPrevState = HelpScreen.btnPrevDef;
					HelpScreen.pageNumber++;
					audioHandler.playButtonClickSound();
				}
				if (HelpScreen.pageNumber < HelpScreen.maxPages) {
					HelpScreen.btnNextState = HelpScreen.btnNextHov;
				}
			}
		} else if (Wizards.showCreditsScreen) {
			// Button Back
			if (currentButton == "Back" && e.getX() >= Wizards.WIDTH * 20 / 800 && e.getX() <= Wizards.WIDTH * 20 / 800 + 150
					&& e.getY() >= Wizards.HEIGHT * 40 / 600 && e.getY() <= Wizards.HEIGHT * 40 / 600 + 50) {
				Wizards.showCreditsScreen = false;
				Wizards.showTitleScreen = true;
				CreditsScreen.btnBackState = CreditsScreen.btnBackDef;
				CreditsScreen.y = CreditsScreen.startY;
				audioHandler.playButtonClickSound();
			}
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {

		// TITLE SCREEN BUTTONS
		if (Wizards.showTitleScreen) {
			// Button Begin
			if (e.getX() >= (Wizards.WIDTH - 150) / 2 && e.getX() <= (Wizards.WIDTH - 150) / 2 + 150
					&& e.getY() >= Wizards.HEIGHT * 225 / 600 && e.getY() <= Wizards.HEIGHT * 225 / 600 + 50) {
				TitleScreen.btnBeginState = TitleScreen.btnBeginHov;
				if (!btnBeginHover) {
					audioHandler.playButtonHoverSound();
					btnBeginHover = true;
				}
			} else {
				TitleScreen.btnBeginState = TitleScreen.btnBeginDef;
				btnBeginHover = false;
			}

			// Button Build
			if (e.getX() >= (Wizards.WIDTH - 150) / 2 && e.getX() <= (Wizards.WIDTH - 150) / 2 + 150
					&& e.getY() >= Wizards.HEIGHT * 280 / 600 && e.getY() <= Wizards.HEIGHT * 280 / 600 + 50) {
				TitleScreen.btnBuildState = TitleScreen.btnBuildHov;
				if (!btnBuildHover) {
					audioHandler.playButtonHoverSound();
					btnBuildHover = true;
				}
			} else {
				TitleScreen.btnBuildState = TitleScreen.btnBuildDef;
				btnBuildHover = false;
			}

			// Button Help
			if (e.getX() >= (Wizards.WIDTH - 150) / 2 && e.getX() <= (Wizards.WIDTH - 150) / 2 + 150
					&& e.getY() >= Wizards.HEIGHT * 335 / 600 && e.getY() <= Wizards.HEIGHT * 335 / 600 + 50) {
				TitleScreen.btnHelpState = TitleScreen.btnHelpHov;
				if (!btnHelpHover) {
					audioHandler.playButtonHoverSound();
					btnHelpHover = true;
				}
			} else {
				TitleScreen.btnHelpState = TitleScreen.btnHelpDef;
				btnHelpHover = false;
			}

			// Button Credit
			if (e.getX() >= (Wizards.WIDTH - 150) / 2 && e.getX() <= (Wizards.WIDTH - 150) / 2 + 150
					&& e.getY() >= Wizards.HEIGHT * 390 / 600 && e.getY() <= Wizards.HEIGHT * 390 / 600 + 50) {
				TitleScreen.btnCreditState = TitleScreen.btnCreditHov;
				if (!btnCreditHover) {
					audioHandler.playButtonHoverSound();
					btnCreditHover = true;
				}
			} else {
				TitleScreen.btnCreditState = TitleScreen.btnCreditDef;
				btnCreditHover = false;
			}

			// Button Exit
			if (e.getX() >= (Wizards.WIDTH - 150) / 2 && e.getX() <= (Wizards.WIDTH - 150) / 2 + 150
					&& e.getY() >= Wizards.HEIGHT * 445 / 600 && e.getY() <= Wizards.HEIGHT * 445 / 600 + 50) {
				TitleScreen.btnExitState = TitleScreen.btnExitHov;
				if (!btnExitHover) {
					audioHandler.playButtonHoverSound();
					btnExitHover = true;
				}
			} else {
				TitleScreen.btnExitState = TitleScreen.btnExitDef;
				btnExitHover = false;
			}

			// TITLE SETTINGS BUTTONS
			// Button Settings
			if (e.getX() >= Wizards.WIDTH * 730 / 800 && e.getX() <= Wizards.WIDTH * 730 / 800 + 40
					&& e.getY() >= Wizards.HEIGHT * 510 / 600 && e.getY() <= Wizards.HEIGHT * 510 / 600 + 40) {

				if (Wizards.showSettingsScreen) {
					TitleScreen.btnSettingsState = TitleScreen.btnSettingsPressHov;
				} else {
					TitleScreen.btnSettingsState = TitleScreen.btnSettingsHov;
				}
				if (!btnSettingsHover) {
					audioHandler.playButtonHoverSound();
					btnSettingsHover = true;
				}
			} else {
				if (Wizards.showSettingsScreen) {
					TitleScreen.btnSettingsState = TitleScreen.btnSettingsPress;
				} else {
					TitleScreen.btnSettingsState = TitleScreen.btnSettingsDef;
				}
				btnSettingsHover = false;
			}

			// Button Volume
			if (e.getX() >= Wizards.WIDTH * 680 / 800 && e.getX() <= Wizards.WIDTH * 680 / 800 + 40
					&& e.getY() >= Wizards.HEIGHT * 510 / 600 && e.getY() <= Wizards.HEIGHT * 510 / 600 + 40) {

				if (!btnVolumeHover) {
					audioHandler.playButtonHoverSound();
					btnVolumeHover = true;
				}

				if (Wizards.volumeOn) {
					TitleScreen.btnVolumeState = TitleScreen.btnVolumeHov;
				} else {
					TitleScreen.btnVolumeState = TitleScreen.btnVolumeMuteHov;
				}
			} else {
				if (Wizards.volumeOn) {
					TitleScreen.btnVolumeState = TitleScreen.btnVolumeDef;
				} else {
					TitleScreen.btnVolumeState = TitleScreen.btnVolumeMute;
				}
				btnVolumeHover = false;
			}

			// Button Music
			if (e.getX() >= Wizards.WIDTH * 630 / 800 && e.getX() <= Wizards.WIDTH * 630 / 800 + 40
					&& e.getY() >= Wizards.HEIGHT * 510 / 600 && e.getY() <= Wizards.HEIGHT * 510 / 600 + 40) {

				if (!btnMusicHover) {
					audioHandler.playButtonHoverSound();
					btnMusicHover = true;
				}

				if (Wizards.musicOn) {
					TitleScreen.btnMusicState = TitleScreen.btnMusicHov;
				} else {
					TitleScreen.btnMusicState = TitleScreen.btnMusicMuteHov;
				}
			} else {
				if (Wizards.musicOn) {
					TitleScreen.btnMusicState = TitleScreen.btnMusicDef;
				} else {
					TitleScreen.btnMusicState = TitleScreen.btnMusicMute;
				}
				btnMusicHover = false;
			}

		} else if (Wizards.showHelpScreen) {

			// Button Back
			if (e.getX() >= Wizards.WIDTH * 20 / 800 && e.getX() <= Wizards.WIDTH * 20 / 800 + 150
					&& e.getY() >= Wizards.HEIGHT * 40 / 600 && e.getY() <= Wizards.HEIGHT * 40 / 600 + 50) {
				HelpScreen.btnBackState = HelpScreen.btnBackHov;
				if (!btnBackHover) {
					audioHandler.playButtonHoverSound();
					btnBackHover = true;
				}
			} else {
				HelpScreen.btnBackState = HelpScreen.btnBackDef;
				btnBackHover = false;
			}

			// Button Previous
			if (HelpScreen.pageNumber > 1) {
				if (e.getX() >= Wizards.WIDTH * 550 / 800 && e.getX() <= Wizards.WIDTH * 550 / 800 + 40
						&& e.getY() >= Wizards.HEIGHT * 50 / 600 && e.getY() <= Wizards.HEIGHT * 50 / 600 + 40) {
					HelpScreen.btnPrevState = HelpScreen.btnPrevHov;
					if (!btnPrevHover) {
						audioHandler.playButtonHoverSound();
						btnPrevHover = true;
					}
				} else {
					btnPrevHover = false;
					HelpScreen.btnPrevState = HelpScreen.btnPrevDef;
				}
			} else {
				HelpScreen.btnPrevState = HelpScreen.btnPrevPress;
			}

			// Button Next
			if (HelpScreen.pageNumber < HelpScreen.maxPages) {
				if (e.getX() >= Wizards.WIDTH * 650 / 800 && e.getX() <= Wizards.WIDTH * 650 / 800 + 40
						&& e.getY() >= Wizards.HEIGHT * 50 / 600 && e.getY() <= Wizards.HEIGHT * 50 / 600 + 40) {
					HelpScreen.btnNextState = HelpScreen.btnNextHov;
					if (!btnNextHover) {
						audioHandler.playButtonHoverSound();
						btnNextHover = true;
					}
				} else {
					btnNextHover = false;
					HelpScreen.btnNextState = HelpScreen.btnNextDef;
				}
			} else {
				HelpScreen.btnNextState = HelpScreen.btnNextPress;
			}

		} else if (Wizards.showCreditsScreen) {
			// Button Back
			if (e.getX() >= Wizards.WIDTH * 20 / 800 && e.getX() <= Wizards.WIDTH * 20 / 800 + 150
					&& e.getY() >= Wizards.HEIGHT * 40 / 600 && e.getY() <= Wizards.HEIGHT * 40 / 600 + 50) {
				CreditsScreen.btnBackState = CreditsScreen.btnBackHov;
				if (!btnBackHover) {
					audioHandler.playButtonHoverSound();
					btnBackHover = true;
				}
			} else {
				CreditsScreen.btnBackState = CreditsScreen.btnBackDef;
				btnBackHover = false;
			}
		}

	}

	@Override
	public void mouseDragged(MouseEvent e) {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

}
