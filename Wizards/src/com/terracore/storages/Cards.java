package com.terracore.storages;

import java.util.Random;

import com.terracore.cards.CreatureCard;
import com.terracore.cards.SpellCard;

public class Cards {

	private static final int CreatureCardNum = 1;
	private static final int SpellCardNum = 2;

	static Random r = new Random();

	static CreatureCard Firetruck = new CreatureCard(0, 100, 10, 10, 5, 10, 9, 7, 4, "Soak", "Water", "Firetruck",
			Textures.creatureCardFireTruck);

	static SpellCard Fireball = new SpellCard(1, 8, 12, 10, 9, 10, 8, 3, 2, "Fire", "Fire", "Fireball",
			Textures.spellCardFireball);

	static SpellCard Lightning = new SpellCard(2, 15, 17, 10, 8, 10, 5, 7, 3, "Paralyze", "Dark", "Lightning",
			Textures.spellCardLightning);

	public static CreatureCard getCardCreature() {
		switch (r.nextInt(CreatureCardNum)) {
		case (0):
			return Firetruck;
		case (1):
			return Firetruck;
		default:
			return null;
		}
	}

	public static SpellCard getCardSpell() {
		switch (r.nextInt(SpellCardNum)) {
		case (0):
			return Fireball;
		case (1):
			return Lightning;
		default:
			return null;
		}
	}

}
