package com.terracore.storages;

import com.terracore.handlers.Texture;
import com.terracore.wizards.LoadingScreen;

public class Textures {

	public static Texture TitleImage;

	public static Texture btnBeginDef, btnBeginPress, btnBeginHov, btnBeginState;
	public static Texture btnBuildDef, btnBuildPress, btnBuildHov, btnBuildState;
	public static Texture btnHelpDef, btnHelpPress, btnHelpHov, btnHelpState;
	public static Texture btnCreditDef, btnCreditPress, btnCreditHov, btnCreditState;
	public static Texture btnExitDef, btnExitPress, btnExitHov, btnExitState;
	public static Texture btnSettingsDef, btnSettingsPress, btnSettingsHov, btnSettingsPressHov, btnSettingsState;
	public static Texture btnVolumeDef, btnVolumeMute, btnVolumeHov, btnVolumeMuteHov, btnVolumeState;
	public static Texture btnMusicDef, btnMusicMute, btnMusicHov, btnMusicMuteHov, btnMusicState;
	public static Texture btnBackDef, btnBackPress, btnBackHov, btnBackState;
	public static Texture btnPrevDef, btnPrevPress, btnPrevHov, btnPrevState;
	public static Texture btnNextDef, btnNextPress, btnNextHov, btnNextState;

	public static Texture chkBox, chkBoxChk, chkBoxHov, chkBoxChkHov, chkBoxState1, chkBoxState2, chkBoxState3, chkBoxState4;
	
	public static Texture blankSpellCard, blankCreatureCard;
	
	public static Texture spellCardFireball;

	public Textures() {
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

		btnBackDef = new Texture("buttonback/ButtonBackDefault");
		btnBackPress = new Texture("buttonback/ButtonBackPressed");
		btnBackHov = new Texture("buttonback/ButtonBackHovered");
		btnBackState = btnBackDef;

		btnPrevDef = new Texture("buttonprevious/ButtonPreviousDefault");
		btnPrevPress = new Texture("buttonprevious/ButtonPreviousPressed");
		btnPrevHov = new Texture("buttonprevious/ButtonPreviousHovered");
		btnPrevState = btnPrevPress;

		btnNextDef = new Texture("buttonnext/ButtonNextDefault");
		btnNextPress = new Texture("buttonnext/ButtonNextPressed");
		btnNextHov = new Texture("buttonnext/ButtonNextHovered");
		btnNextState = btnNextDef;
		
		chkBox = new Texture("checkbox/CheckBox");
		chkBoxChk = new Texture("checkbox/CheckBoxChecked");
		chkBoxHov = new Texture("checkbox/CheckBoxHovered");
		chkBoxChkHov = new Texture("checkbox/CheckBoxCheckedHovered");
		chkBoxState1 = chkBoxChk;
		chkBoxState2 = chkBox;
		chkBoxState3 = chkBox;
		chkBoxState4 = chkBox;
		
		blankSpellCard = new Texture("cards/BlankSpellCard");
		blankCreatureCard = new Texture("cards/BlankCreatureCard");
		
		spellCardFireball = new Texture("cards/spells/SpellFireball");

		LoadingScreen.isDone = true;
	}
}
