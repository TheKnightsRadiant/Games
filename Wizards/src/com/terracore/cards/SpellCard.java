package com.terracore.cards;

import java.util.Random;

import com.terracore.handlers.Texture;

public class SpellCard {

	private int CardID;
	private int DMGMin;
	private int DMGMax;
	private int HRMaxNum;
	private int HRMinHit;
	private int MPCost;
	private String Effect;
	private String Element;
	private String Name;
	private Texture Texture;
	private int SRMaxNum;
	private int SRMinSuccess;

	Random r = new Random();

	public SpellCard(int CardID, int DMGMin, int DMGMax, int HRMaxNum, int HRMinHit, int SRMaxNum, int SRMinSuccess,
			int MPCost, String Effect, String Element, String Name, Texture Texture) {
		this.CardID = CardID;
		this.DMGMin = DMGMin;
		this.DMGMax = DMGMax;
		this.HRMaxNum = HRMaxNum;
		this.HRMinHit = HRMinHit;
		this.MPCost = MPCost;
		this.Effect = Effect;
		this.Element = Element;
		this.Name = Name;
		this.Texture = Texture;
		this.SRMaxNum = SRMaxNum;
		this.SRMinSuccess = SRMinSuccess;
	}

	public int getSR() {
		return SRMaxNum / SRMinSuccess;
	}

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

	public boolean hit() {
		int hit = r.nextInt(HRMaxNum + 1);
		int success = r.nextInt(SRMaxNum + 1);
		if (hit <= HRMinHit && success <= SRMinSuccess) {
			return true;
		}
		return false;
	}

}
