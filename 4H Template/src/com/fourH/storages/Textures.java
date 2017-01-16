package com.fourH.storages;

import com.fourH.handlers.Texture;
import com.fourH.template.LoadingScreen;

public class Textures {

	public static Texture TitleImage;

	public static Texture btnAgendaDef, btnAgendaPress, btnAgendaHov, btnAgendaState;
	public static Texture btnMembersDef, btnMembersPress, btnMembersHov, btnMembersState;
	
	public Textures() {
		// Create Textures

		btnAgendaDef = new Texture("buttons/buttonagenda/AgendaDefault");
		btnAgendaPress = new Texture("buttons/buttonagenda/AgendaClicked");
		btnAgendaHov = new Texture("buttons/buttonagenda/AgendaHovered");
		btnAgendaState = btnAgendaDef;
		
		btnMembersDef = new Texture("buttons/buttonmembers/MembersDefault");
		btnMembersPress = new Texture("buttons/buttonmembers/MembersClicked");
		btnMembersHov = new Texture("buttons/buttonmembers/MembersHovered");
		btnMembersState = btnMembersDef;

		LoadingScreen.isDone = true;
	}
}
