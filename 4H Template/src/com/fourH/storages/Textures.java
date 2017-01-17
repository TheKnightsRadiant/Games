package com.fourH.storages;

import com.fourH.handlers.Texture;
import com.fourH.template.LoadingScreen;

public class Textures {
	
	public static Texture titleScreenBackground, titleScreenLogo;
	public static Texture pledgeScreenBackground;
	public static Texture fourHClover;

	public static Texture btnAgendaDef, btnAgendaPress, btnAgendaHov, btnAgendaState;
	public static Texture btnPledgeDef, btnPledgePress, btnPledgeHov, btnPledgeState;
	public static Texture btnExitDef, btnExitPress, btnExitHov, btnExitState;
	public static Texture btnBackDef, btnBackPress, btnBackHov, btnBackState;
	
	public static Texture btnNewBDef, btnNewBPress, btnNewBHov, btnNewBState;
	public static Texture btnOldBDef, btnOldBPress, btnOldBHov, btnOldBState;
	public static Texture btnAnnounceDef, btnAnnouncePress, btnAnnounceHov, btnAnnounceState;
	
	public Textures() {
		// Create Textures

		titleScreenBackground = new Texture("background/titleScreenBackground/background");
		titleScreenLogo = new Texture("background/titleScreenBackground/Logo");
		pledgeScreenBackground = new Texture("background/pledgeScreenBackground/4hpledge");
		fourHClover = new Texture("background/4hClover");
		
		btnAgendaDef = new Texture("buttons/buttonagenda/AgendaDefault");
		btnAgendaPress = new Texture("buttons/buttonagenda/AgendaClicked");
		btnAgendaHov = new Texture("buttons/buttonagenda/AgendaHovered");
		btnAgendaState = btnAgendaDef;
		
		btnPledgeDef = new Texture("buttons/buttonpledge/PledgeDefault");
		btnPledgePress = new Texture("buttons/buttonpledge/PledgeClicked");
		btnPledgeHov = new Texture("buttons/buttonpledge/PledgeHovered");
		btnPledgeState = btnPledgeDef;
		
		btnExitDef = new Texture("buttons/buttonexit/ExitDefault");
		btnExitPress = new Texture("buttons/buttonexit/ExitClicked");
		btnExitHov = new Texture("buttons/buttonexit/ExitHovered");
		btnExitState = btnExitDef;
		
		btnBackDef = new Texture("buttons/buttonback/BackDefault");
		btnBackPress = new Texture("buttons/buttonback/BackClicked");
		btnBackHov = new Texture("buttons/buttonback/BackHovered");
		btnBackState = btnBackDef;

		btnNewBDef = new Texture("buttons/buttonnewb/NewBDefault");
		btnNewBPress = new Texture("buttons/buttonnewb/NewBClicked");
		btnNewBHov = new Texture("buttons/buttonnewb/NewBHovered");
		btnNewBState = btnNewBDef;
		
		btnOldBDef = new Texture("buttons/buttonoldb/OldBDefault");
		btnOldBPress = new Texture("buttons/buttonoldb/OldBClicked");
		btnOldBHov = new Texture("buttons/buttonoldb/OldBHovered");
		btnOldBState = btnOldBDef;
		
		btnAnnounceDef = new Texture("buttons/buttonannouncements/AnnouncementsDefault");
		btnAnnouncePress = new Texture("buttons/buttonannouncements/AnnouncementsClicked");
		btnAnnounceHov = new Texture("buttons/buttonannouncements/AnnouncementsHovered");
		btnAnnounceState = btnAnnounceDef;
		
		LoadingScreen.isDone = true;
	}
}
