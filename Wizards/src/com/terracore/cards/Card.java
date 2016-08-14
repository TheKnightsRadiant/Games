package com.terracore.cards;

import java.util.Random;

import com.terracore.handlers.Texture;

public class Card {

	private static int CardID;
	private static int DMGMin;
	private static int DMGMax;
	private static int HRMaxNum;
	private static int HRMinHit;
	private static int MPCost;
	private static String Effect;
	private static String Element;
	private static String Name;
	private static Texture Texture;

	Random r = new Random();

	////////////////////////////////////////////////////////////

	public class SpellCard {

		private int SRMaxNum;
		private int SRMinSuccess;

		public SpellCard(int CardID, int DMGMin, int DMGMax, int HRMaxNum, int HRMinHit, int SRMaxNum, int SRMinSuccess,
				int MPCost, String Effect, String Element, String Name, Texture Texture) {
			Card.CardID = CardID;
			Card.DMGMin = DMGMin;
			Card.DMGMax = DMGMax;
			Card.HRMaxNum = HRMaxNum;
			Card.HRMinHit = HRMinHit;
			Card.MPCost = MPCost;
			Card.Effect = Effect;
			Card.Element = Element;
			Card.Name = Name;
			Card.Texture = Texture;
			this.SRMaxNum = SRMaxNum;
			this.SRMinSuccess = SRMinSuccess;
		}

		public int getSR() {
			return SRMaxNum / SRMinSuccess;
		}

		public boolean hit() {
			int hit = r.nextInt(HRMaxNum + 1);
			int success = r.nextInt(SRMaxNum + 1);
			if (hit <= HRMinHit && success <= SRMinSuccess) {
				return true;
			}
			return false;
		}

	}

	////////////////////////////////////////////////////////////

	public class CreatureCard {

		private int HP;
		private int AG;
		private int Attack;

		Random r = new Random();

		public CreatureCard(int CardID, int HP, int DMGMin, int DMGMax, int AG, int HRMaxNum, int HRMinHit, int MPCost,
				String Effect, String Element, String Name, Texture Texture) {
			Card.CardID = CardID;
			Card.DMGMin = DMGMin;
			Card.DMGMax = DMGMax;
			Card.HRMaxNum = HRMaxNum;
			Card.HRMinHit = HRMinHit;
			Card.MPCost = MPCost;
			Card.Effect = Effect;
			Card.Element = Element;
			Card.Name = Name;
			Card.Texture = Texture;
			this.AG = AG;
			this.HP = HP;
		}

		public int getHP() {
			return HP;
		}

		public int getAG() {
			return AG;
		}

		public boolean hit() {
			int hit = r.nextInt(HRMaxNum + 1);
			if (hit <= HRMinHit) {
				return true;
			}
			return false;
		}
	}

	////////////////////////////////////////////////////////////

	public int getCardID() {
		return CardID;
	}

	public int getDMG() {
		return r.nextInt(DMGMax - DMGMin + 1) + DMGMin;
	}

	public int getHR() {
		return HRMaxNum / HRMinHit;
	}

	public int getMPCost() {
		return MPCost;
	}

	public String getEffect() {
		return Effect;
	}

	public String getElement() {
		return Element;
	}

	public String getName() {
		return Name;
	}

	public Texture getTexture() {
		return Texture;
	}

}
