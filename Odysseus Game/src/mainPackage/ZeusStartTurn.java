package mainPackage;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ZeusStartTurn extends JFrame implements ActionListener {
	public ZeusStartTurn() {
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
		
		JLabel zeus = new JLabel("Player 2 (Zeus), it is your turn.");
		zeus.setFont(new Font("Baskerville Old Face", Font.BOLD, 27));
		zeus.setBounds(465, 100, 500, 27);
		
		JButton zeusStart = new JButton("Start Turn");
		zeusStart.setFont(new Font("Baskerville Old Face", Font.BOLD, 27));
		zeusStart.setBounds(573, 140, 165, 45);
		zeusStart.setFocusable(false);
		zeusStart.addActionListener(this);
		zeusStart.setActionCommand("zeusStart");
		
		getContentPane().add(zeus);
		getContentPane().add(zeusStart);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "zeusStart") {
			ZeusInterface zeusInterface = new ZeusInterface();
			zeusInterface.setVisible(true);
			this.dispose();
		}
	}
}