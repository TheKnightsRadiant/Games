package com.terracore.cards;

import java.util.Random;

public class CreatureCard {

	private int cardID;
	private int HP;
	private int DMGMin;
	private int DMGMax;
	private int AG;
	private int HRMaxNum;
	private int HRMinHit;
	private int MPCost;
	private int Attack;
	private String Element;
	private String Name;

	Random r = new Random();

	public CreatureCard(int cardID, int HP, int DMGMin, int DMGMax, int AG, int HRMaxNum, int HRMinHit, int MPCost,
			String Element, String Name) {
		this.cardID = cardID;
		this.HP = HP;
		this.DMGMin = DMGMin;
		this.DMGMax = DMGMax;
		this.AG = AG;
		this.MPCost = MPCost;
		this.Element = Element;
		this.Name = Name;
	}

	public int getCardID() {
		return cardID;
	}

	public int getHP() {
		return HP;
	}

	public int getDMG() {
		return r.nextInt(DMGMax - DMGMin + 1) + DMGMin;
	}

	public int getAG() {
		return AG;
	}

	public int getMPCost() {
		return MPCost;
	}

	public int getHR() {
		return HRMaxNum / HRMinHit;
	}

	public String getElement() {
		return Element;
	}

	public String getName() {
		return Name;
	}

	public boolean hit() {
		int hit = r.nextInt(HRMaxNum + 1);
		if (hit <= HRMinHit) {
			return true;
		}
		return false;
	}
}
