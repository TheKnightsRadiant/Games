package mainPackage;

import javax.swing.JLabel;

public class Main {
	
	public static String title = "The Journey of Odysseus v1.1.2";
	
	public static int distance = 20000;
	public static int crew = 200;
	
	public static int Ismaros = 0;
	public static int Lotos = 0;
	public static int Kyklops = 0;
	public static int Aiolin = 0;
	public static int Cannibal = 1;
	public static int Kirke = 1;
	public static int Underworld = 1;
	public static int Seirenes = 1;
	public static int Skylla = 1;
	public static int Helios = 1;
	public static int Kalypso = 1;
	public static int Antinoos = 1;
	
	public static int poseidonCard1Played = 0;
	public static int poseidonCard2Played = 0;
	public static int poseidonCard3Played = 0;
	
	public static int zeusCard1Played = 0;
	public static int zeusCard2Played = 0;
	public static int zeusCard3Played = 0;
	
	public static int poseidonCard1Choice;
	public static int poseidonCard2Choice;
	public static int poseidonCard3Choice;
	
	public static int zeusCard1Choice;
	public static int zeusCard2Choice;
	public static int zeusCard3Choice;
	
	public static void main(String[] args) {
		BetaNotification betaNotification = new BetaNotification();
		betaNotification.setVisible(true);
	}
}
