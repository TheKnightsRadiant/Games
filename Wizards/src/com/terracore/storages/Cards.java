package com.terracore.storages;

import java.util.Random;

import com.terracore.cards.CreatureCard;

public class Cards {

	private static int CardNum = 1;

	static Random r = new Random();

	static CreatureCard Firetruck = new CreatureCard(0, 100, 10, 10, 10, 10, 9, 7, "Water", "Firetruck",
			Textures.creatureCardFireTruck);

	public static CreatureCard getCard() {
		switch (r.nextInt(CardNum)) {
		case (0):
			return Firetruck;
		//case (1):
		}
		return null;
	}


}
