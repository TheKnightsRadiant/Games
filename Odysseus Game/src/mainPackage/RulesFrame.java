package mainPackage;

import java.awt.Font;
import javax.swing.*;

public class RulesFrame extends JFrame {
	public RulesFrame() {
		super("");
		setBounds(265, 100, 640, 800);
		getContentPane().setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		JTextArea rulesText = new JTextArea();
		rulesText.setFont(new Font("Baskerville Old Face", Font.BOLD, 21));
		rulesText.setText("In this game, Odysseus is traveling from Troy back to his home in Ithaka. He moves a random number of spaces each turn. The larger his crew is, the further he moves. This game is played by two players: Zeus and Poseidon. Poseidon's goal is to kill Odysseus before he reaches Ithaka. Zeus's goal is to protect Odysseus along the way. Odysseus will have 200 crewmates at the beginning of the game. If they all die, the game will end, and Poseidon will win. Both players will always have three cards available to them each round. They can either play one card or pass, keeping their cards for a later time. They can also redraw, costing them one turn. Most of Poseidon's cards will be ways of hurting Odysseus, while Zeus's will focus on protecting Odysseus from Poseidon's attacks or helping him reach Ithaka more quickly.");
		rulesText.setBounds(12, 10, 610, 740);
		rulesText.setWrapStyleWord(true);
		rulesText.setLineWrap(true);
		rulesText.setEditable(false);
		
		getContentPane().add(rulesText);
	}
}