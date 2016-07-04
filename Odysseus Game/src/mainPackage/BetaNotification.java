package mainPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BetaNotification extends JFrame implements ActionListener {
	public BetaNotification() {
		super(Main.title);
		setBounds(265, 100, 1280, 800);
		getContentPane().setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel beta = new JLabel();
		beta.setFont(new Font("Baskerville Old Face", Font.BOLD, 37));
		beta.setText("This game is in");
		beta.setBounds(400, 175, 251, 39);
		
		JLabel betaWord = new JLabel();
		betaWord.setFont(new Font("Baskerville Old Face", Font.BOLD, 37));
		betaWord.setForeground(Color.RED);
		betaWord.setText("BETA");
		betaWord.setBounds(660, 175, 107, 39);
		
		JLabel betaTwo = new JLabel();
		betaTwo.setFont(new Font("Baskerville Old Face", Font.BOLD, 27));
		betaTwo.setText("Some features may be unavailable or prone to glitching.");
		betaTwo.setBounds(280, 230, 653, 25);
		
		JButton Continue = new JButton();
		Continue.setFont(new Font("Baskerville Old Face", Font.BOLD, 27));
		Continue.setText("Continue");
		Continue.setBounds(490, 290, 145, 40);
		Continue.setFocusable(false);
		Continue.addActionListener(this);
		Continue.setActionCommand("Continue");
		
		getContentPane().add(beta);
		getContentPane().add(betaWord);
		getContentPane().add(betaTwo);
		getContentPane().add(Continue);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "Continue") {
			StartFrame startFrame = new StartFrame();
			startFrame.setVisible(true);
			this.dispose();
		}
	}
}