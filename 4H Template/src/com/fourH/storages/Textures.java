package com.fourH.storages;

import com.fourH.handlers.Texture;
import com.fourH.template.LoadingScreen;

public class Textures {
	
	public static Texture titleScreenBackground, titleScreenLogo;

	public static Texture btnAgendaDef, btnAgendaPress, btnAgendaHov, btnAgendaState;
	public static Texture btnPledgeDef, btnPledgePress, btnPledgeHov, btnPledgeState;
	public static Texture btnExitDef, btnExitPress, btnExitHov, btnExitState;
	
	public Textures() {
		// Create Textures

		titleScreenBackground = new Texture("background/titleScreenBackground/background");
		titleScreenLogo = new Texture("background/titleScreenBackground/Logo");
		
		btnAgendaDef = new Texture("buttons/buttonagenda/AgendaDefault");
		btnAgendaPress = new Texture("buttons/buttonagenda/AgendaClicked");
		btnAgendaHov = new Texture("buttons/buttonagenda/AgendaHovered");
		btnAgendaState = btnAgendaDef;
		
		btnPledgeDef = new Texture("buttons/buttonpledge/PledgeDefault");
		btnPledgePress = new Texture("buttons/buttonpledge/PledgeClicked");
		btnPledgeHov = new Texture("buttons/buttonpledge/PledgeHovered");
		btnPledgeState = btnPledgeDef;
		
		btnExitDef = new Texture("buttons/buttonexit/ExitDefault");
		btnExitPress = new Texture("buttons/buttonexit/ExitClicket");
		btnExitHov = new Texture("buttons/buttonexit/ExitHovered");
		btnExitState = btnExitDef;

		LoadingScreen.isDone = true;
	}
}
