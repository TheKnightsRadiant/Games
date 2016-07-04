package mainPackage;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PoseidonStartTurn extends JFrame implements ActionListener {
	public PoseidonStartTurn() {
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
		
		JLabel poseidon = new JLabel("Player 1 (Poseidon), it is your turn.");
		poseidon.setFont(new Font("Baskerville Old Face", Font.BOLD, 27));
		poseidon.setBounds(465, 100, 500, 27);
		
		JButton poseidonStart = new JButton("Start Turn");
		poseidonStart.setFont(new Font("Baskerville Old Face", Font.BOLD, 27));
		poseidonStart.setBounds(573, 140, 165, 45);
		poseidonStart.setFocusable(false);
		poseidonStart.addActionListener(this);
		poseidonStart.setActionCommand("poseidonStart");
		
		getContentPane().add(poseidon);
		getContentPane().add(poseidonStart);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "poseidonStart") {
			PoseidonInterface poseidonInterface = new PoseidonInterface();
			poseidonInterface.setVisible(true);
			this.dispose();
		}
	}
}