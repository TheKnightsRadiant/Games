package com.terracore.wizards;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import com.terracore.handlers.Texture;

public class TitleScreen {

	private int fontSizeSettingsTitle = 18;
	private int fontSizeSettingsText = 15;

	public static String currentResolutionText = Wizards.WIDTH + "X" + Wizards.HEIGHT;

	private Texture TitleImage;

	public static Texture btnBeginDef, btnBeginPress, btnBeginHov, btnBeginState;
	public static Texture btnBuildDef, btnBuildPress, btnBuildHov, btnBuildState;
	public static Texture btnHelpDef, btnHelpPress, btnHelpHov, btnHelpState;
	public static Texture btnCreditDef, btnCreditPress, btnCreditHov, btnCreditState;
	public static Texture btnExitDef, btnExitPress, btnExitHov, btnExitState;

	public static Texture btnSettingsDef, btnSettingsPress, btnSettingsHov, btnSettingsPressHov, btnSettingsState;
	public static Texture btnVolumeDef, btnVolumeMute, btnVolumeHov, btnVolumeMuteHov, btnVolumeState;
	public static Texture btnMusicDef, btnMusicMute, btnMusicHov, btnMusicMuteHov, btnMusicState;

	public TitleScreen() {

		fontSizeSettingsTitle = Wizards.compareToWidth(fontSizeSettingsTitle);
		fontSizeSettingsText = Wizards.compareToWidth(fontSizeSettingsText);

		// Create Textures
		TitleImage = new Texture("WizardTitle");

		btnBeginDef = new Texture("buttonbegin/ButtonBeginDefault");
		btnBeginPress = new Texture("buttonbegin/ButtonBeginPressed");
		btnBeginHov = new Texture("buttonbegin/ButtonBeginHovered");
		btnBeginState = btnBeginDef;

		btnBuildDef = new Texture("buttonbuild/ButtonBuildDefault");
		btnBuildPress = new Texture("buttonbuild/ButtonBuildPressed");
		btnBuildHov = new Texture("buttonbuild/ButtonBuildHovered");
		btnBuildState = btnBuildDef;

		btnHelpDef = new Texture("buttonhelp/ButtonHelpDefault");
		btnHelpPress = new Texture("buttonhelp/ButtonHelpPressed");
		btnHelpHov = new Texture("buttonhelp/ButtonHelpHovered");
		btnHelpState = btnHelpDef;

		btnCreditDef = new Texture("buttonCredits/ButtonCreditsDefault");
		btnCreditPress = new Texture("buttonCredits/ButtonCreditsPressed");
		btnCreditHov = new Texture("buttonCredits/ButtonCreditsHovered");
		btnCreditState = btnCreditDef;

		btnExitDef = new Texture("buttonexit/ButtonExitDefault");
		btnExitPress = new Texture("buttonexit/ButtonExitPressed");
		btnExitHov = new Texture("buttonexit/ButtonExitHovered");
		btnExitState = btnExitDef;

		btnSettingsDef = new Texture("buttonsettings/ButtonSettingsDefault");
		btnSettingsPress = new Texture("buttonsettings/ButtonSettingsPressed");
		btnSettingsHov = new Texture("buttonsettings/ButtonSettingsHovered");
		btnSettingsPressHov = new Texture("buttonsettings/ButtonSettingsPressedHovered");
		btnSettingsState = btnSettingsDef;

		btnVolumeDef = new Texture("buttonvolume/ButtonVolumeDefault");
		btnVolumeMute = new Texture("buttonvolume/ButtonVolumeMuted");
		btnVolumeHov = new Texture("buttonvolume/ButtonVolumeHovered");
		btnVolumeMuteHov = new Texture("buttonvolume/ButtonVolumeMutedHovered");
		btnVolumeState = btnVolumeDef;

		btnMusicDef = new Texture("buttonmusic/ButtonMusicDefault");
		btnMusicMute = new Texture("buttonmusic/ButtonMusicMuted");
		btnMusicHov = new Texture("buttonmusic/ButtonMusicHovered");
		btnMusicMuteHov = new Texture("buttonmusic/ButtonMusicMutedHovered");
		btnMusicState = btnMusicDef;
	}

	public void paint(Graphics g) {
		// Background
		g.setColor(new Color(244, 231, 129));
		g.fillRect(0, 0, Wizards.WIDTH, Wizards.HEIGHT);

		// Title Screen Image
		TitleImage.render(g, Wizards.centerToWidth(800), Wizards.compareToHeight(10));

		// Title Screen Buttons
		btnBeginState.render(g, Wizards.centerToWidth(150), Wizards.compareToHeight(225));
		btnBuildState.render(g, Wizards.centerToWidth(150), Wizards.compareToHeight(280));
		btnHelpState.render(g, Wizards.centerToWidth(150), Wizards.compareToHeight(335));
		btnCreditState.render(g, Wizards.centerToWidth(150), Wizards.compareToHeight(390));
		btnExitState.render(g, Wizards.centerToWidth(150), Wizards.compareToHeight(445));

		// Title Screen Settings Buttons
		btnSettingsState.render(g, Wizards.compareToWidth(730), Wizards.compareToHeight(510));
		btnVolumeState.render(g, Wizards.compareToWidth(680), Wizards.compareToHeight(510));
		btnMusicState.render(g, Wizards.compareToWidth(630), Wizards.compareToHeight(510));

		if (Wizards.showSettingsScreen) {

			// Background
			g.setColor(new Color(200, 175, 75));
			g.fillRect(Wizards.compareToWidth(550), Wizards.compareToHeight(220), Wizards.compareToWidth(230),
					Wizards.compareToHeight(280));

			// Top Bar
			g.setColor(new Color(255, 250, 150));
			g.fillRect(Wizards.compareToWidth(555), Wizards.compareToHeight(225), Wizards.compareToWidth(220),
					Wizards.compareToHeight(30));
			// Title
			g.setColor(new Color(192, 143, 38));
			g.setFont(new Font("ZapfDingbats", Font.BOLD, fontSizeSettingsTitle));
			g.drawString("Settings", Wizards.compareToWidth(625), Wizards.compareToHeight(245));

			// Resolution
			g.setColor(new Color(255, 250, 150));
			g.setFont(new Font("ZapfDingbats", Font.BOLD, fontSizeSettingsText));
			g.drawString("Resolution:", Wizards.compareToWidth(565), Wizards.compareToHeight(275));

			g.setColor(new Color(255, 250, 150));
			g.fillRoundRect(Wizards.compareToWidth(655), Wizards.compareToHeight(260), Wizards.compareToWidth(110),
					Wizards.compareToHeight(20), 5, 5);

			currentResolutionText = Wizards.WIDTH + "X" + Wizards.HEIGHT;

			g.setColor(new Color(192, 143, 38));
			g.setFont(new Font("ZapfDingbats", Font.BOLD, fontSizeSettingsText));
			g.drawString(currentResolutionText, Wizards.compareToWidth(660), Wizards.compareToHeight(275));

		}
	}

}
