package com.terracore.storages;

import java.util.Random;

import com.terracore.cards.CreatureCard;

public class Cards {

	private static int CardNum = 3;

	static Random r = new Random();

	static CreatureCard BlankCreature = new CreatureCard(0, 0, 0, 0, 0, 0, 0, 0, "null", "blank",
			Textures.blankCreatureCard);
	static CreatureCard BlankSpell = new CreatureCard(1, 0, 0, 0, 0, 0, 0, 0, "null", "blank",
			Textures.blankSpellCard);
	static CreatureCard Firetruck = new CreatureCard(2, 100, 10, 10, 10, 10, 9, 7, "Water", "Firetruck",
			Textures.creatureCardFireTruck);
	

	public static CreatureCard getCard() {
		switch (r.nextInt(CardNum)) {
		case (0):
			return BlankCreature;
		case (1):
			return BlankSpell;
		case (2):
			return Firetruck;
		}
		return null;
	}


}
