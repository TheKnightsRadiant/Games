package mainPackage;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PoseidonWins extends JFrame implements ActionListener {
	public PoseidonWins() {
		super(Main.title);
		setBounds(265, 100, 1280, 800);
		getContentPane().setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		
		JMenu file = new JMenu("File");
		file.setFocusable(false);
		
		JMenu edit = new JMenu("Edit");
		edit.setFocusable(false);
		
		JMenu help = new JMenu("Help");
		help.setFocusable(false);
		
		JMenu view = new JMenu("View");
		view.setFocusable(false);
		
		menuBar.add(file);
		menuBar.add(edit);
		menuBar.add(help);
		menuBar.add(view);
		
		JLabel poseidonWins = new JLabel("Poseidon Wins");
		poseidonWins.setFont(new Font("Baskerville Old Face", Font.BOLD, 31));
		poseidonWins.setBounds(600, 100, 300, 40);
		
		JButton playAgain = new JButton("Play Again");
		playAgain.setFont(new Font("Baskerville Old Face", Font.BOLD, 27));
		playAgain.setBounds(600, 300, 160, 50);
		playAgain.setFocusable(false);
		playAgain.addActionListener(this);
		playAgain.setActionCommand("playAgain");
		
		getContentPane().add(poseidonWins);
		getContentPane().add(playAgain);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "playAgain") {
			Main.poseidonCard1Played = 0;
			Main.poseidonCard2Played = 0;
			Main.poseidonCard3Played = 0;
			
			Main.zeusCard1Played = 0;
			Main.zeusCard2Played = 0;
			Main.zeusCard3Played = 0;
			
			Main.poseidonCard1Choice = 0;
			Main.poseidonCard2Choice = 0;
			Main.poseidonCard3Choice = 0;
			
			Main.zeusCard1Choice = 0;
			Main.zeusCard2Choice = 0;
			Main.zeusCard3Choice= 0;
			
			Main.Ismaros = 0;
			Main.Lotos = 0;
			Main.Kyklops = 0;
			Main.Aiolin = 0;
			Main.Cannibal = 1;
			Main.Kirke = 1;
			Main.Underworld = 1;
			Main.Seirenes = 1;
			Main.Skylla = 1;
			Main.Helios = 1;
			Main.Kalypso = 1;
			Main.Antinoos = 1;
			
			StartFrame startFrame = new StartFrame();
			startFrame.setVisible(true);
			this.dispose();
		}
	}

}