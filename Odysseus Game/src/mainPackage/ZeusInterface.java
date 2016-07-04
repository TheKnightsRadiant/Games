package mainPackage;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class ZeusInterface extends JFrame implements ActionListener {
	JLabel distanceLeft = new JLabel("Distance From Ithaka: " + Main.distance + "m");
	JLabel crew = new JLabel("Crew Remaining: " + Main.crew + "Men");
	JLabel name = new JLabel("Zeus");
	public static JLabel zeusCard1Title = new JLabel();
	public static JLabel zeusCard2Title = new JLabel();
	public static JLabel zeusCard3Title = new JLabel();
	JTextArea zeusCard1Area = new JTextArea();
	JTextArea zeusCard2Area = new JTextArea();
	JTextArea zeusCard3Area = new JTextArea();
	JTextArea notify = new JTextArea();
	
	int usedSpy;
	
	int zeusCard1Available;
	int zeusCard2Available;
	int zeusCard3Available;
	
	public static int poseidonPassed;
	public static int poseidonRedrew;
	
	public static int zeusCard1 = -1;
	public static int zeusCard2 = -1;
	public static int zeusCard3 = -1;
	
	public static boolean Tailwind;

	public ZeusInterface() {
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
		
		distanceLeft.setFont(new Font("Baskerville Old Face", Font.BOLD, 31));
		distanceLeft.setBounds(817, 20, 440, 27);
		
		crew.setFont(new Font("Baskerville Old Face", Font.BOLD, 31));
		crew.setBounds(888, 50, 400, 27);
		
		name.setFont(new Font("Baskerville Old Face", Font.BOLD, 31));
		name.setBounds(283, 25, 200, 27);
		
		zeusCard1Title.setFont(new Font("Baskerville Old Face", Font.BOLD, 21));
		zeusCard1Title.setBounds(475, 475, 300, 30);
		
		zeusCard2Title.setFont (new Font("Baskerville Old Face", Font.BOLD, 21));
		zeusCard2Title.setBounds(775, 475, 300, 30);
		
		zeusCard3Title.setFont (new Font("Baskerville Old Face", Font.BOLD, 21));
		zeusCard3Title.setBounds(1075, 475, 300, 30);
		
		JLabel notification = new JLabel("Notifications:");
		notification.setFont(new Font("Baskerville Old Face", Font.BOLD, 31));
		notification.setBounds(38, 15, 200, 30);
		
		JLabel hand = new JLabel("Hand:");
		hand.setFont (new Font("Baskerville Old Face", Font.BOLD, 31));
		hand.setBounds(285, 463, 88, 30);
		
		zeusCard1Area.setFont(new Font("Baskerville Old Face", Font.BOLD, 19));
		zeusCard1Area.setBounds(405, 503, 240, 65);
		zeusCard1Area.setWrapStyleWord(true);
		zeusCard1Area.setLineWrap(true);
		zeusCard1Area.setEditable(false);
		
		zeusCard2Area.setFont(new Font("Baskerville Old Face", Font.BOLD, 19));
		zeusCard2Area.setBounds(705, 503, 240, 65);
		zeusCard2Area.setWrapStyleWord(true);
		zeusCard2Area.setLineWrap(true);
		zeusCard2Area.setEditable(false);
		
		zeusCard3Area.setFont(new Font("Baskerville Old Face", Font.BOLD, 19));
		zeusCard3Area.setBounds(1005, 503, 240, 65);
		zeusCard3Area.setWrapStyleWord(true);
		zeusCard3Area.setLineWrap(true);
		zeusCard3Area.setEditable(false);
		
		notify.setFont (new Font("Baskerville Old Face", Font.BOLD, 16));
		notify.setBounds(10, 48, 255, 680);
		notify.setWrapStyleWord(true);
		notify.setLineWrap(true);
		notify.setEditable(false);
		
		JButton passButton = new JButton("Pass");
		passButton.setFont (new Font("Baskerville Old Face", Font.BOLD, 21));
		passButton.setBounds(277, 500, 115, 45);
		passButton.setFocusable(false);
		passButton.addActionListener(this);
		passButton.setActionCommand("pass");
		
		JButton redraw = new JButton("Redraw");
		redraw.setFont (new Font("Baskerville Old Face", Font.BOLD, 21));
		redraw.setBounds(277, 560, 115, 45);
		redraw.setFocusable(false);
		redraw.addActionListener(this);
		redraw.setActionCommand("redraw");
		
		JButton playCard1 = new JButton("Play Card");
		playCard1.setFont (new Font("Baskerville Old Face", Font.BOLD, 15));
		playCard1.setBounds(475, 685, 110, 35);
		playCard1.setFocusable(false);
		playCard1.addActionListener(this);
		playCard1.setActionCommand("playCard1");
		
		JButton playCard2 = new JButton("Play Card");
		playCard2.setFont (new Font("Baskerville Old Face", Font.BOLD, 15));
		playCard2.setBounds(775, 685, 110, 35);
		playCard2.setFocusable(false);
		playCard2.addActionListener(this);
		playCard2.setActionCommand("playCard2");
		
		JButton playCard3 = new JButton("Play Card");
		playCard3.setFont (new Font("Baskerville Old Face", Font.BOLD, 15));
		playCard3.setBounds(1075, 685, 110, 35);
		playCard3.setFocusable(false);
		playCard3.addActionListener(this);
		playCard3.setActionCommand("playCard3");
		
		getContentPane().add(distanceLeft);
		getContentPane().add(crew);
		getContentPane().add(name);
		getContentPane().add(notification);
		getContentPane().add(hand);
		getContentPane().add(notify);
		getContentPane().add(passButton);
		getContentPane().add(redraw);
		getContentPane().add(playCard1);
		getContentPane().add(playCard2);
		getContentPane().add(playCard3);
		
		if (PoseidonInterface.ismarosNotify == 1) {
			notify.append("Odysseus arrives at Ismaros. His crew, however, is mutinous. 'Sheep after sheep they butchered... while fugitives went inland, running to call to arms their main force... Six benches were left empty in every ship,'");
			PoseidonInterface.ismarosNotify = 0;
		}
		if (PoseidonInterface.lotosNotify == 1) {
			notify.append("Odysseus arrives at an island inhabited by peaceful lotos eaters. However, 'those who ate the lotos longed to stay forever.' Two crewmen are lost.");
			PoseidonInterface.lotosNotify = 0;
		}
		if (PoseidonInterface.kyklopsNotify == 1) {
			notify.append("Odysseus arrives at an island inhabited by giant Kyklops. His men attempt to steal sheep from Polyphemos. Polyphemos takes Odysseus's crewmates in his hands 'like squirming puppies to beat their brains out.");
			PoseidonInterface.kyklopsNotify = 0;
		}
		if (PoseidonInterface.aiolinNotify == 1) {
			notify.append("Odysseus reaches Ailoi island. Here he is a given a bag of winds, and receives twenty crewmen before being sent on his way. However, 'temptation had its way with his companions and they untied the bag of winds.' Odysseus moves back 10000 spaces.");
			PoseidonInterface.aiolinNotify = 0;
		}
		if (PoseidonInterface.cannibalNotify == 1) {
			notify.append("Odysseus finds land, but soon discovers it is inhabited by cannibals. The king 'seizes a man... and makes a meal of him.' Odysseus loses ten crewmen.");
			PoseidonInterface.cannibalNotify = 0;
		}
		if (PoseidonInterface.kirkeNotify == 1) {
			notify.append("Odysseus arrives at an island. He sends scouts to investigate. They discover Kirke, who magically turns them into pigs and 'flew after them with her long stick and shut them in a pigsty.' With the help of Hermes, Odysseus freed his men and convinced Kirke to help him. Before leaving, however, a drunk crewman, who was sitting on the roof, 'missed his footing and fell that height headlong.' One crewman dies.");
			PoseidonInterface.kirkeNotify = 0;
		}
		if (PoseidonInterface.underworldNotify == 1) {
			notify.append("After being told he must go by Kirke, Odysseus has traveled to the underworld. There, he speaks with Teiresias, a prince of Thebes, and his mother, among others.");
			PoseidonInterface.underworldNotify = 0;
		}
		if (PoseidonInterface.seirenesNotify == 1) {
			notify.append("Odysseus passes the territory of the Seirenes, but being forewarned of them by Kirke, everyone survives the encounter.");
			PoseidonInterface.seirenesNotify = 0;
		}
		if (PoseidonInterface.skyllaNotify == 1) {
			notify.append("Odysseus encounters Skylla, the sea witch. 'She made her strike, whisking six of Odysseus's best men from the ship.");
			PoseidonInterface.skyllaNotify = 0;
		}
		if (PoseidonInterface.heliosNotify == 1) {
			notify.append("Odysseus reaches an island with cattle owned by Helios. His men, desparate for food, take and eat the cattle. In retribution, 'Zeus let fly a bolt against the ship.' Odysseus's crew is decimated.");
			PoseidonInterface.heliosNotify = 0;
		}
		if (PoseidonInterface.kalypsoNotify == 1) {
			notify.append("Odysseus reaches the island of Kalypso. There, he is held as a sex slave for eight years. So... that was a thing.");
			PoseidonInterface.kalypsoNotify = 0;
		}
		if (PoseidonInterface.antinoosNotify == 1) {
			notify.append("Odysseus, after being nearly drowned in a hurricane caused by Poseidon, finds himself on the island of Antinoos. There, he is treated very well. He gains 100 crewmen for the final part of his journey.");
			PoseidonInterface.antinoosNotify = 0;
		}
		
		if (usedSpy == 1) {
			notify.append("Poseidon's hand currently consists of the cards: " + PoseidonInterface.card1Title + " " + PoseidonInterface.card2Title + " " + PoseidonInterface.card3Title);
			usedSpy = 0;
		}
		
		notify.append("Odysseus moved forward " + PoseidonInterface.moveNumber + " spaces.");
		
		if (PoseidonInterface.earthquakeNotify == true) {
			notify.append("An earthquake kills five crewmen.");
			crew.setText("Crew Remaining" + Main.crew + "Men");
			distanceLeft.setText("Distance From Ithaka: " + Main.distance + "m");
			SwingUtilities.updateComponentTreeUI(this);
			PoseidonInterface.earthquakeNotify = false;
		}
		if (PoseidonInterface.mutinyNotify == true) {
			notify.append("Odysseus' crew mutinied, sending him back forty spaces.");
			crew.setText("Crew Remaining" + Main.crew + "Men");
			distanceLeft.setText("Distance From Ithaka: " + Main.distance + "m");
			SwingUtilities.updateComponentTreeUI(this);
			PoseidonInterface.mutinyNotify = false;
		}
		if (PoseidonInterface.headwindNotify == true) {
			notify.append("A strong headwind pushes Odysseus back sixteen spaces.");
			crew.setText("Crew Remaining" + Main.crew + "Men");
			distanceLeft.setText("Distance From Ithaka: " + Main.distance + "m");
			SwingUtilities.updateComponentTreeUI(this);
			PoseidonInterface.headwindNotify = false;
		}
		if (PoseidonInterface.scurvyNotify == true) {
			notify.append("Scurvy kills off five crewmen.");
			crew.setText("Crew Remaining" + Main.crew + "Men");
			distanceLeft.setText("Distance From Ithaka: " + Main.distance + "m");
			SwingUtilities.updateComponentTreeUI(this);
			PoseidonInterface.scurvyNotify = false;
		}
		if (PoseidonInterface.spoiledFoodNotify == true) {
			notify.append("Three crewmen have died of starvation.");
			crew.setText("Crew Remaining" + Main.crew + "Men");
			distanceLeft.setText("Distance From Ithaka: " + Main.distance + "m");
			SwingUtilities.updateComponentTreeUI(this);
			PoseidonInterface.spoiledFoodNotify = false;
		}
		if (PoseidonInterface.workRelatedInjuryNotify == true) {
			notify.append("Some idiot fell off the ship. He was promptly and savagely devoured by sharks.");
			crew.setText("Crew Remaining" + Main.crew + "Men");
			distanceLeft.setText("Distance From Ithaka: " + Main.distance + "m");
			SwingUtilities.updateComponentTreeUI(this);
			PoseidonInterface.workRelatedInjuryNotify = false;
		}
		if (PoseidonInterface.tidalWavesNotify == true) {
			notify.append("A massive tidal wave kills five crewmen.");
			crew.setText("Crew Remaining" + Main.crew + "Men");
			distanceLeft.setText("Distance From Ithaka: " + Main.distance + "m");
			SwingUtilities.updateComponentTreeUI(this);
			PoseidonInterface.tidalWavesNotify = false;
		}
		if (PoseidonInterface.rogueSeirenesNotify == true) {
			notify.append("Seirenes have killed fifteen crewmen, and sent Odysseus back twenty spaces.");
			crew.setText("Crew Remaining" + Main.crew + "Men");
			distanceLeft.setText("Distance From Ithaka: " + Main.distance + "m");
			SwingUtilities.updateComponentTreeUI(this);
			PoseidonInterface.rogueSeirenesNotify = false;
		}
		if (PoseidonInterface.hardcoreMutinyNotify == true) {
			Random random = new Random();
			int r = random.nextInt(11);
			switch (r) {
			case 0:
				notify.append("The crew mutinied, but failed to kill Odysseus.");
				SwingUtilities.updateComponentTreeUI(this);
				break;
			case 1:
				notify.append("The crew mutinied, but failed to kill Odysseus.");
				SwingUtilities.updateComponentTreeUI(this);
				break;
			case 2:
				notify.append("The crew mutinied, but failed to kill Odysseus.");
				SwingUtilities.updateComponentTreeUI(this);
				break;
			case 3:
				notify.append("The crew mutinied, but failed to kill Odysseus.");
				SwingUtilities.updateComponentTreeUI(this);
				break;
			case 4:
				notify.append("The crew mutinied, but failed to kill Odysseus.");
				SwingUtilities.updateComponentTreeUI(this);
				break;
			case 5:
				notify.append("The crew mutinied, but failed to kill Odysseus.");
				SwingUtilities.updateComponentTreeUI(this);
				break;
			case 6:
				notify.append("The crew mutinied, but failed to kill Odysseus.");
				SwingUtilities.updateComponentTreeUI(this);
				break;
			case 7:
				notify.append("The crew mutinied, but failed to kill Odysseus.");
				SwingUtilities.updateComponentTreeUI(this);
				break;
			case 8:
				notify.append("The crew mutinied, but failed to kill Odysseus.");
				SwingUtilities.updateComponentTreeUI(this);
				break;
			case 9:
				notify.append("The crew mutinied, but failed to kill Odysseus.");
				SwingUtilities.updateComponentTreeUI(this);
				break;
			case 10:
				notify.append("The crew mutinied, but failed to kill Odysseus.");
				SwingUtilities.updateComponentTreeUI(this);
				break;
			case 11:
				//Poseidon Wins
				break;
			}
			PoseidonInterface.hardcoreMutinyNotify = false;
		}
		if (PoseidonInterface.whirlpoolNotify == true) {
			notify.append("A whirlpool killed three crewmen, and sent Odysseus back ten spaces.");
			crew.setText("Crew Remaining" + Main.crew + "Men");
			distanceLeft.setText("Distance From Ithaka: " + Main.distance + "m");
			SwingUtilities.updateComponentTreeUI(this);
			PoseidonInterface.whirlpoolNotify = false;
		}
		if (PoseidonInterface.Iceberg == true) {
			notify.append("An iceberg kills ten crewmen.");
			crew.setText("Crew Remaining" + Main.crew + "Men");
			distanceLeft.setText("Distance From Ithaka: " + Main.distance + "m");
			SwingUtilities.updateComponentTreeUI(this);
			PoseidonInterface.icebergNotify = false;
		}
		if (PoseidonInterface.Rats == true) {
			notify.append("Rats bring disease, killing five crewmen.");
			crew.setText("Crew Remaining" + Main.crew + "Men");
			distanceLeft.setText("Distance From Ithaka: " + Main.distance + "m");
			SwingUtilities.updateComponentTreeUI(this);
			PoseidonInterface.ratsNotify = false;
		}
		
		if (Main.zeusCard1Played == 0) {
			Random random = new Random();
			int rCard1 = random.nextInt(7);
			switch (rCard1) {
			case 0:
				Main.zeusCard1Choice = 0;
				break;
			case 1:
				Main.zeusCard1Choice = 1;
				break;
			case 2:
				Main.zeusCard1Choice = 2;
				break;
			case 3:
				Main.zeusCard1Choice = 3;
				break;
			case 4:
				Main.zeusCard1Choice = 4;
				break;
			case 5:
				Main.zeusCard1Choice = 5;		
				break;
			case 6:
				Main.zeusCard1Choice = 6;
				break;
			case 7:
				Main.zeusCard1Choice = 7;
				break;
			}
			Main.zeusCard1Played = 1;
		}
			switch (Main.zeusCard1Choice) {
			case 0:
				zeusCard1Available = 0;
				zeusCard1Title.setText("Miracle");
				zeusCard1Area.setText("Counters: Earthquake, Tidal Wave");
				break;
			case 1:
				zeusCard1Available = 1;
				zeusCard1Title.setText("Fear-Factor");
				zeusCard1Area.setText("Counters: Mutiny, Hardcore Mutiny");
				break;
			case 2:
				zeusCard1Available = 2;
				zeusCard1Title.setText("Tailwind");
				zeusCard1Area.setText("Effect: Sends Odysseus forward sixteen spaces.");
				break;
			case 3:
				zeusCard1Available = 3;
				zeusCard1Title.setText("Medicine");
				zeusCard1Area.setText("Counters: Scurvy, Rats");
				break;
			case 4:
				zeusCard1Available = 4;
				zeusCard1Title.setText("Fishing Nets");
				zeusCard1Area.setText("Counters: Spoiled Food");
				break;
			case 5:
				zeusCard1Available = 5;
				zeusCard1Title.setText("Fishing Nets");
				zeusCard1Area.setText("Counters: Spoiled Food");
				break;
			case 6:
				zeusCard1Available = 6;
				zeusCard1Title.setText("Tailwind");
				zeusCard1Title.setBounds(440, 475, 300, 30);
				zeusCard1Area.setText("Effect: Sends Odysseus forward sixteen spaces.");
				break;
			case 7:
				zeusCard1Available = 7;
				zeusCard1Title.setText("Tailwind");
				zeusCard1Area.setText("Effect: Sends Odysseus forward sixteen spaces.");
				break;
			}
		if (Main.zeusCard2Played == 0) {
			Random random = new Random();	
			int rCard2 = random.nextInt(7);
				switch (rCard2) {
				case 0:
					Main.zeusCard2Choice = 0;
					break;
				case 1:
					Main.zeusCard2Choice = 1;
					break;
				case 2:
					Main.zeusCard2Choice = 2;
					break;
				case 3:
					Main.zeusCard2Choice = 3;
					break;
				case 4:
					Main.zeusCard2Choice = 4;
					break;
				case 5:
					Main.zeusCard2Choice = 5;
					break;
				case 6:
					Main.zeusCard2Choice = 6;
					break;
				case 7:
					Main.zeusCard2Choice = 7;
					break;
				}
				Main.zeusCard2Played = 1;
		}
			switch (Main.zeusCard2Choice) {
			case 0:
				zeusCard2Available = 0;
				zeusCard2Title.setText("Really Great Sailing");
				zeusCard2Area.setText("Counters: Tidal Wave, Whirlpool");
			break;
			case 1:
				zeusCard2Available = 1;
				zeusCard2Title.setText("Miracle");
				zeusCard2Area.setText("Counters: Earthquake, Tidal Wave");
				break;
			case 2:
				zeusCard2Available = 2;
				zeusCard2Title.setText("Earplugs");
				zeusCard2Area.setText("Counters: Rogue Seirenes");
				break;
			case 3:
				zeusCard2Available = 3;
				zeusCard2Title.setText("Fear-Factor");
				zeusCard2Area.setText("Counters: Mutiny, Hardcore Mutiny");
				break;
			case 4:
				zeusCard2Available = 4;
				zeusCard2Title.setText("Medicine");
				zeusCard2Area.setText("Counters: Scurvy, Rats");
				break;
			case 5:
				zeusCard2Available = 5;
				zeusCard2Title.setText("Cats");
				zeusCard2Title.setBounds(740, 475, 300, 30);
				zeusCard2Area.setText("Counters: Rats");
				break;
			case 6:
				zeusCard2Available = 6;
				zeusCard2Title.setText("Really Great Sailing");
				zeusCard2Area.setText("Counters: Tidal Wave, Whirlpool");
				break;
			case 7:
				zeusCard2Available = 7;
				zeusCard2Title.setText("Decent Sailing");
				zeusCard2Area.setText("Counters: Whirlpool");
				break;
			}
		if (Main.zeusCard3Played == 0) {
			Random random = new Random();
			int rCard3 = random.nextInt(7);
			switch (rCard3) {
			case 0:
				Main.zeusCard3Choice = 0;
				break;
			case 1:
				Main.zeusCard3Choice = 1;
				break;
			case 2:
				Main.zeusCard3Choice = 2;
				break;
			case 3:
				Main.zeusCard3Choice = 3;
				break;
			case 4:
				Main.zeusCard3Choice = 4;
				break;
			case 5:
				Main.zeusCard3Choice = 5;
				break;
			case 6:
				Main.zeusCard3Choice = 6;
				break;
			case 7:
				Main.zeusCard3Choice = 7;
			break;
			}
			Main.zeusCard3Played = 1;
		}
		switch (Main.zeusCard3Choice) {
		case 0:
			zeusCard3Available = 0;
			zeusCard3Title.setText("Tailwind");
			zeusCard3Area.setText("Effect: Sends Odysseus forward sixteen spaces.");
			break;
		case 1:
			zeusCard3Available = 1;
			zeusCard3Title.setText("Fishing Nets");
			zeusCard3Area.setText("Counters: Spoiled Food");
			break;
		case 2:
			zeusCard3Available = 2;
			zeusCard3Title.setText("A Favor From Helios");
			zeusCard3Title.setBounds(1050, 475, 300, 30);
			zeusCard3Area.setText("Counters: Iceberg");
			break;
		case 3:
			zeusCard3Available = 3;
			zeusCard3Title.setText("Cats");
			zeusCard3Area.setText("Counters: Rats");
			break;
		case 4:
			zeusCard3Available = 4;
			zeusCard3Title.setText("Spy");
			zeusCard3Area.setText("Effect: Allows you to see Poseidon's current hand.");
			break;
		case 5:
			zeusCard3Available = 5;
			zeusCard3Title.setText("Cats");
			zeusCard3Area.setText("Counters: Rats");
			break;
		case 6:
			zeusCard3Available = 6;
			zeusCard3Title.setText("Really Great Sailing");
			zeusCard3Area.setText("Counters: Tidal Wave, Whirlpool");
			break;
		case 7:
			zeusCard3Available = 7;
			zeusCard3Title.setText("Medicine");
			zeusCard3Area.setText("Counters: Scurvy, Rats");
			break;
		}
		
		getContentPane().add(zeusCard1Title);
		getContentPane().add(zeusCard2Title);
		getContentPane().add(zeusCard3Title);
		getContentPane().add(zeusCard1Area);
		getContentPane().add(zeusCard2Area);
		getContentPane().add(zeusCard3Area);
		
		if (PoseidonInterface.card1 == 0 || PoseidonInterface.card2 == 1) {
			notify.append("Poseidon used Earthquake. Counter it, or five crewmen will die.");
		}
		
		if (PoseidonInterface.card1 == 1) {
			notify.append("Poseidon used Mutiny. Counter it, or Odysseus will be sent back forty spaces.");
		}
		
		if (PoseidonInterface.card1 == 2 || PoseidonInterface.card1 == 7 || PoseidonInterface.card3 == 0) {
			notify.append("Poseidon summoned a headwind. Counter it, or Odysseus will be sent back sixteen spaces.");
		}
		
		if (PoseidonInterface.card1 == 3 || PoseidonInterface.card2 == 4 || PoseidonInterface.card3 == 7) {
			notify.append("Poseidon brought scurvy to the crew. Counter it, or five crewmen will die.");
		}
		
		if (PoseidonInterface.card1 == 4 || PoseidonInterface.card1 == 5 || PoseidonInterface.card3 == 1) {
			notify.append("Poseidon spoiled the crew's food. Counter it, or three crewmen will die.");
		}
		
		if (PoseidonInterface.card1 == 6 || PoseidonInterface.card2 == 5) {
			notify.append("Poseidon has cursed thine crewman with a work-related injury. There is no counter. One crewman dies. Tell them to wear hard hats in the future.");
		}
		
		if (PoseidonInterface.card2 == 0) {
			notify.append("Poseidon summons a tidal wave. Counter it, or five crewmen will die.");
		}
		
		if (PoseidonInterface.card2 == 2) {
			notify.append("Odysseus has stumbled upon rogue seirenes. Counter them, or fifteen crewmen will die, and Odysseus will be sent back twenty spaces.");
		}
		
		if (PoseidonInterface.card2 == 3) {
			notify.append("The crew is in the process of mutiny. Counter it, or Odysseus will have a chance of dying.");
		}
		
		if (PoseidonInterface.card2 == 6 || PoseidonInterface.card2 == 7 || PoseidonInterface.card3 == 6) {
			notify.append("Poseidon summons a whirlpool. Counter it, or three crewmen will die, and Odysseus will be sent back ten spaces.");
		}
		
		if (PoseidonInterface.card3 == 2) {
			notify.append("Poseidon summons an ice-berg. Counter it, or ten crewmen will die.");
		}
		
		if (PoseidonInterface.card3 == 3 || PoseidonInterface.card3 == 5) {
			notify.append("Rats plague Odysseus's ship. Counter them, or five crewmen will die");
		}
		
		if (PoseidonInterface.card3 == 4) {
			notify.append("Poseidon skipped his turn.");
		}
		
		if (poseidonPassed == 1) {
			notify.append("Poseidon skipped his turn.");
			poseidonPassed = 0;
		}
		if (poseidonRedrew == 1) {
			notify.append("Poseidon redrew his hand, costing him a turn.");
			poseidonRedrew = 0;
		}
	}
	
	void drawLines(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
 
        g2d.drawLine(275, 500, 1280, 500);
        //Horizontal hand line
        g2d.drawLine(275, 55, 275, 800);
        //Vertical notifications line
        g2d.drawRect(400, 520, 255, 265);
        //First card
        g2d.drawRect(700, 520, 255, 265);
        //Second card
        g2d.drawRect(1000, 520, 255, 265);
        //Third card
	}
	
	public void paint(Graphics g) {
        super.paint(g);
        drawLines(g);
    }
	
	public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
            }
        });
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "playCard1") {
			switch (zeusCard1Available) {
			case 0:
				zeusCard1 = 0;
				PoseidonInterface.Earthquake = false;
				PoseidonInterface.tidalWaves = false;
				break;
			case 1:
				zeusCard1 = 1;
				PoseidonInterface.Mutiny = false;
				PoseidonInterface.hardcoreMutiny = false;
				break;
			case 2:
				zeusCard1 = 2;
				Tailwind = true;
				break;
			case 3:
				zeusCard1 = 3;
				PoseidonInterface.Scurvy = false;
				PoseidonInterface.Rats = false;
				break;
			case 4:
				zeusCard1 = 4;
				PoseidonInterface.spoiledFood = false;
				break;
			case 5:
				zeusCard1 = 5;
				PoseidonInterface.spoiledFood = false;
				break;
			case 6:
				zeusCard1 = 6;
				Tailwind = true;
				break;
			case 7:
				zeusCard1 = 7;
				Tailwind = true;
				break;
			}
			zeusCard2 = -1;
			zeusCard3 = -1;
				Main.zeusCard1Played = 0;
				PoseidonStartTurn poseidonStartTurn = new PoseidonStartTurn();
				poseidonStartTurn.setVisible(true);
				SwingUtilities.updateComponentTreeUI(this);
				this.setVisible(false);
		}
		if (e.getActionCommand() == "playCard2") {
			switch (zeusCard2Available) {
			case 0:
				zeusCard2 = 0;
				PoseidonInterface.tidalWaves = false;
				PoseidonInterface.Whirlpool = false;
				break;
			case 1:
				zeusCard2 = 1;
				PoseidonInterface.Earthquake = false;
				PoseidonInterface.tidalWaves = false;
				break;
			case 2:
				zeusCard2 = 2;
				PoseidonInterface.rogueSeirenes = false;
				break;
			case 3:
				zeusCard2 = 3;
				PoseidonInterface.Mutiny = false;
				PoseidonInterface.hardcoreMutiny = false;
				break;
			case 4:
				zeusCard2 = 4;
				PoseidonInterface.Scurvy = false;
				PoseidonInterface.Rats = false;
				break;
			case 5:
				zeusCard2 = 5;
				PoseidonInterface.Rats = false;
				break;
			case 6:
				zeusCard2 = 6;
				PoseidonInterface.tidalWaves = false;
				PoseidonInterface.Whirlpool = false;
				break;
			case 7:
				zeusCard2 = 7;
				PoseidonInterface.Whirlpool = false;
				break;
			}
			zeusCard1 = -1;
			zeusCard3 = -1;
			Main.zeusCard2Played = 0;
			PoseidonStartTurn poseidonStartTurn = new PoseidonStartTurn();
			poseidonStartTurn.setVisible(true);
			SwingUtilities.updateComponentTreeUI(this);
			this.setVisible(false);
		}
		if (e.getActionCommand() == "playCard3") {
			switch (zeusCard3Available) {
			case 0:
				zeusCard3 = 0;
				Tailwind = true;
				break;
			case 1:
				zeusCard3 = 1;
				PoseidonInterface.spoiledFood = false;
				break;
			case 2:
				zeusCard3 = 2;
				PoseidonInterface.Iceberg = false;
				break;
			case 3:
				zeusCard3 = 3;
				PoseidonInterface.Rats = false;
				break;
			case 4:
				zeusCard3 = 4;
				usedSpy = 1;
				break;
			case 5:
				zeusCard3 = 5;
				PoseidonInterface.Rats = false;
				break;
			case 6:
				zeusCard3 = 6;
				PoseidonInterface.tidalWaves = false;
				PoseidonInterface.Whirlpool = false;
				break;
			case 7:
				zeusCard3 = 7;
				PoseidonInterface.Scurvy = false;
				PoseidonInterface.Rats = false;
				break;
			}
			zeusCard1 = -1;
			zeusCard2 = -1;
			Main.zeusCard3Played = 0;
			PoseidonStartTurn poseidonStartTurn = new PoseidonStartTurn();
			poseidonStartTurn.setVisible(true);
			SwingUtilities.updateComponentTreeUI(this);
			this.setVisible(false);
		}
		if (e.getActionCommand() == "pass") {
			zeusCard1 = -1;
			zeusCard2 = -1;
			zeusCard3 = -1;
			PoseidonInterface.zeusPassed = 1;
			PoseidonStartTurn poseidonStartTurn = new PoseidonStartTurn();
			poseidonStartTurn.setVisible(true);
			this.setVisible(false);
		}
		if (e.getActionCommand() == "redraw") {
			zeusCard1 = -1;
			zeusCard2 = -1;
			zeusCard3 = -1;
			PoseidonInterface.zeusRedrew = 1;
			Main.zeusCard1Played = 0;
			Main.zeusCard2Played = 0;
			Main.zeusCard3Played = 0;
			PoseidonStartTurn poseidonStartTurn = new PoseidonStartTurn();
			poseidonStartTurn.setVisible(true);
			this.setVisible(false);
		}
	}
}
