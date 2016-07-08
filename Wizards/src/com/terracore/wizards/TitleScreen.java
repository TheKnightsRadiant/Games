package com.terracore.wizards;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import com.terracore.handlers.Texture;

public class TitleScreen {
	
	private int fontSizeTitle = 18;

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
		
		fontSizeTitle = fontSizeTitle * Wizards.WIDTH / 800;

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
		TitleImage.render(g, (Wizards.WIDTH - 800) / 2, Wizards.HEIGHT * 10 / 600);

		// Title Screen Buttons
		btnBeginState.render(g, (Wizards.WIDTH - 150) / 2, Wizards.HEIGHT * 225 / 600);
		btnBuildState.render(g, (Wizards.WIDTH - 150) / 2, Wizards.HEIGHT * 280 / 600);
		btnHelpState.render(g, (Wizards.WIDTH - 150) / 2, Wizards.HEIGHT * 335 / 600);
		btnCreditState.render(g, (Wizards.WIDTH - 150) / 2, Wizards.HEIGHT * 390 / 600);
		btnExitState.render(g, (Wizards.WIDTH - 150) / 2, Wizards.HEIGHT * 445 / 600);

		// Title Screen Settings Buttons
		btnSettingsState.render(g, Wizards.WIDTH * 730 / 800, Wizards.HEIGHT * 510 / 600);
		btnVolumeState.render(g, Wizards.WIDTH * 680 / 800, Wizards.HEIGHT * 510 / 600);
		btnMusicState.render(g, Wizards.WIDTH * 630 / 800, Wizards.HEIGHT * 510 / 600);

		if (Wizards.showSettingsScreen) {

			// Background & Title
			g.setColor(new Color(200, 175, 75));
			g.fillRect(Wizards.WIDTH * 550 / 800, Wizards.HEIGHT * 220 / 600, Wizards.WIDTH * 230 / 800,
					Wizards.HEIGHT * 280 / 600);

			g.setColor(new Color(255, 250, 150));
			g.fillRect(Wizards.WIDTH * 555 / 800, Wizards.HEIGHT * 225 / 600, Wizards.WIDTH * 220 / 800,
					Wizards.HEIGHT * 30 / 600);

			g.setColor(new Color(192, 143, 38));
			g.setFont(new Font("ZapfDingbats", Font.BOLD, fontSizeTitle));
			g.drawString("Settings", Wizards.WIDTH * 625 / 800, Wizards.HEIGHT * 245 / 600);
		}
	}

}
