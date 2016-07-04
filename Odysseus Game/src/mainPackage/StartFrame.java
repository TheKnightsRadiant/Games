package mainPackage;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class StartFrame extends JFrame implements ActionListener {
	
	JRadioButton playerVsPlayer = new JRadioButton("Player vs. Player");
	
	public StartFrame() {
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
		
		JButton rules = new JButton("Rules");
		rules.setFont(new Font("Baskerville Old Face", Font.BOLD, 21));
		rules.setBounds(1173, 8, 93, 45);
		rules.setFocusable(false);
		rules.addActionListener(this);
		rules.setActionCommand("rules");
		
		JButton play = new JButton("Play Game");
		play.setFont(new Font("Baskerville Old Face", Font.BOLD, 21));
		play.setBounds(555, 175, 150, 45);
		play.setFocusable(false);
		play.addActionListener(this);
		play.setActionCommand("play");
		
		ButtonGroup players = new ButtonGroup();
		
		playerVsPlayer.setFont(new Font("Baskerville Old Face", Font.BOLD, 21));
		playerVsPlayer.setBounds(539, 237, 175, 20);
		playerVsPlayer.setFocusable(false);
		
		JRadioButton playerVsAI = new JRadioButton("Player vs. AI");
		playerVsAI.setFont(new Font("Baskerville Old Face", Font.BOLD, 21));
		playerVsAI.setBounds(553, 265, 175, 20);
		playerVsAI.setFocusable(false);
		playerVsAI.setEnabled(false);
		
		players.add(playerVsPlayer);
		players.add(playerVsAI);
		
		JLabel copyright = new JLabel("© 2016 Terra Cor. All Rights Reserved");
		copyright.setFont(new Font("Arial", Font.BOLD, 12));
		copyright.setBounds(500, 690, 213, 11);
		
		getContentPane().add(rules);
		getContentPane().add(play);
		getContentPane().add(playerVsPlayer);
		getContentPane().add(playerVsAI);
		getContentPane().add(copyright);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "rules") {
			RulesFrame rulesFrame = new RulesFrame();
			rulesFrame.setVisible(true);
		}
		if (e.getActionCommand() == "play" && playerVsPlayer.isSelected()) {
			PoseidonStartTurn poseidonStart = new PoseidonStartTurn();
			poseidonStart.setVisible(true);
			this.dispose();
		}
	}
}