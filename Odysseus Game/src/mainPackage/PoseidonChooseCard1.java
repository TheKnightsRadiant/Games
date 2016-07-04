package mainPackage;

import java.util.Random;

import javax.swing.JLabel;

public class PoseidonChooseCard1 {
	
	int poseidonCard1;
	int n = 2;
	JLabel card1Title = new JLabel();
	
	public PoseidonChooseCard1() {
		Random random = new Random();
		int rCard1 = random.nextInt(7);
		switch (n) {
		case 0:
			poseidonCard1 = 0;
			card1Title.setText("EarthQuake");
			break;
		case 1:
			poseidonCard1 = 1;
			card1Title.setText("Mutiny");
			break;
		case 2:
			poseidonCard1 = 2;
			card1Title.setText("Headwind");
			break;
		case 3:
			poseidonCard1 = 3;
			card1Title.setText("Scurvy");
			break;
		case 4:
			poseidonCard1 = 4;
			card1Title.setText("Spoiled Food");
			break;
		case 5:
			poseidonCard1 = 5;
			card1Title.setText("Spoiled Food");
			break;
		case 6:
			poseidonCard1 = 6;
			card1Title.setText("Work-Related Injury");
			break;
		case 7:
			poseidonCard1 = 7;
			card1Title.setText("Headwind");
		}
	}
}