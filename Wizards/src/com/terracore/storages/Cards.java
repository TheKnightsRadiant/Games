package com.terracore.storages;

import java.util.Random;

import com.terracore.cards.Card;
import com.terracore.cards.Card.CreatureCard;
import com.terracore.cards.Card.SpellCard;

public class Cards {

	private static int CardNum = 2;

	static Random r = new Random();

	static Card Firetruck = new Card();
	static CreatureCard FiretruckCard = Firetruck.new CreatureCard(0, 100, 10, 10, 10, 10, 9, 7, "Fire", "Fire",
			"Firetruck", Textures.creatureCardFireTruck);

	static Card Fireball = new Card();
	static SpellCard FireballCard = Fireball.new SpellCard(1, 8, 10, 10, 8, 10, 9, 3, "Fire", "Fire", "Fireball",
			Textures.spellCardFireball);

	public static Card getCard() {
		switch (r.nextInt(CardNum)) {
		case (0):
			return Firetruck;
		case (1):
			return Fireball;
		}
		return null;
	}

}
