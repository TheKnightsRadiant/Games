package mainPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;



public class PoseidonInterface extends JFrame implements ActionListener {
	
	JLabel distanceLeft = new JLabel("Distance From Ithaka: " + Main.distance + "m");
	JLabel crew = new JLabel("Crew Remaining: " + Main.crew + "Men");
	JLabel name = new JLabel("Poseidon");
	public static JLabel card1Title = new JLabel();
	public static JLabel card2Title = new JLabel();
	public static JLabel card3Title = new JLabel();
	JTextArea card1Area = new JTextArea();
	JTextArea card2Area = new JTextArea();
	JTextArea card3Area = new JTextArea();
	JTextArea notify = new JTextArea();
	
	public static int ismarosNotify;
	public static int lotosNotify;
	public static int kyklopsNotify;
	public static int aiolinNotify;
	public static int cannibalNotify;
	public static int kirkeNotify;
	public static int underworldNotify;
	public static int seirenesNotify;
	public static int skyllaNotify;
	public static int heliosNotify;
	public static int kalypsoNotify;
	public static int antinoosNotify;
	
	int usedSpy;
	
	public static int moveNumber;
	
	int card1Available;
	int card2Available;
	int card3Available;
	
	public static int zeusPassed;
	public static int zeusRedrew;
	
	public static int card1 = -1;
	public static int card2 = -1;
	public static int card3 = -1;
	
	public static boolean Earthquake;
	public static boolean Mutiny;
	public static boolean Headwind;
	public static boolean Scurvy;
	public static boolean spoiledFood;
	public static boolean workRelatedInjury;
	public static boolean tidalWaves;
	public static boolean rogueSeirenes;
	public static boolean hardcoreMutiny;
	public static boolean Whirlpool;
	public static boolean Iceberg;
	public static boolean Rats;
	
	public static boolean earthquakeNotify;
	public static boolean mutinyNotify;
	public static boolean headwindNotify;
	public static boolean scurvyNotify;
	public static boolean spoiledFoodNotify;
	public static boolean workRelatedInjuryNotify;
	public static boolean tidalWavesNotify;
	public static boolean rogueSeirenesNotify;
	public static boolean hardcoreMutinyNotify;
	public static boolean whirlpoolNotify;
	public static boolean icebergNotify;
	public static boolean ratsNotify;
	
	public PoseidonInterface() {
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
		
		card1Title.setFont(new Font("Baskerville Old Face", Font.BOLD, 21));
		card1Title.setBounds(475, 475, 300, 30);
		
		card2Title.setFont (new Font("Baskerville Old Face", Font.BOLD, 21));
		card2Title.setBounds(775, 475, 300, 30);
		
		card3Title.setFont (new Font("Baskerville Old Face", Font.BOLD, 21));
		card3Title.setBounds(1075, 475, 300, 30);
		
		JLabel notification = new JLabel("Notifications:");
		notification.setFont(new Font("Baskerville Old Face", Font.BOLD, 31));
		notification.setBounds(38, 15, 200, 30);
		
		JLabel hand = new JLabel("Hand:");
		hand.setFont (new Font("Baskerville Old Face", Font.BOLD, 31));
		hand.setBounds(285, 463, 88, 30);
		
		card1Area.setFont(new Font("Baskerville Old Face", Font.BOLD, 19));
		card1Area.setBounds(405, 503, 240, 65);
		card1Area.setWrapStyleWord(true);
		card1Area.setLineWrap(true);
		card1Area.setEditable(false);
		
		card2Area.setFont(new Font("Baskerville Old Face", Font.BOLD, 19));
		card2Area.setBounds(705, 503, 240, 65);
		card2Area.setWrapStyleWord(true);
		card2Area.setLineWrap(true);
		card2Area.setEditable(false);
		
		card3Area.setFont(new Font("Baskerville Old Face", Font.BOLD, 19));
		card3Area.setBounds(1005, 503, 240, 65);
		card3Area.setWrapStyleWord(true);
		card3Area.setLineWrap(true);
		card3Area.setEditable(false);
		
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
		
		if (usedSpy == 1) {
			notify.append("Zeus's hand currently consists of the cards: " + ZeusInterface.zeusCard1Title + " " + ZeusInterface.zeusCard2Title + " " + ZeusInterface.zeusCard3Title);
			usedSpy = 0;
		}
		
		Random moveRandom = new Random();
		int movement = moveRandom.nextInt(12);
		movement = movement * Main.crew;
		
		Main.distance = Main.distance - movement;
		
		moveNumber = movement;
		
		distanceLeft.setText("Distance From Ithaka: " + Main.distance + "m");
		SwingUtilities.updateComponentTreeUI(this);
		
		notify.append("Odysseus moved forward " + moveNumber + "spaces.");
		
		if (zeusPassed == 1) {
			notify.append("Zeus skipped his turn.");
			zeusPassed = 0;
		}
		if (zeusRedrew == 1) {
			notify.append("Zeus redrew his hand, costing him a turn.");
			zeusRedrew = 0;
		}
		
		if (ZeusInterface.zeusCard1 == 0 || ZeusInterface.zeusCard2 == 1) {
			notify.append("Zeus uses a miracle, countering Earthquake and Tidal Wave.");
		}
		if (ZeusInterface.zeusCard1 == 1 || ZeusInterface.zeusCard2 == 3) {
			notify.append("Zeus uses Fear-Factor, preventing a mutiny.");
		}
		if (ZeusInterface.zeusCard1 == 2 || ZeusInterface.zeusCard1 == 6 || ZeusInterface.zeusCard1 == 7 || ZeusInterface.zeusCard3 == 0) {
			//null
		}
		if (ZeusInterface.zeusCard1 == 3 || ZeusInterface.zeusCard2 == 4 || ZeusInterface.zeusCard3 == 7) {
			notify.append("Zeus lends the crew medicine, countering Scurvy and Rats.");
		}
		if (ZeusInterface.zeusCard1 == 4 || ZeusInterface.zeusCard1 == 5 || ZeusInterface.zeusCard3 == 1) {
			notify.append("Zeus lends the crew fishing nets, countering Spoiled Food.");
		}
		if (ZeusInterface.zeusCard2 == 0 || ZeusInterface.zeusCard2 == 6 || ZeusInterface.zeusCard3 == 6) {
			notify.append("The sailors become great at their jobs, countering Whirlpool and Tidal Wave.");
		}
		if (ZeusInterface.zeusCard2 == 2) {
			notify.append("Zeus advises the sailors to wear earplugs, countering Rogue Seirenes.");
		}
		if (ZeusInterface.zeusCard2 == 5 || ZeusInterface.zeusCard3 == 3 || ZeusInterface.zeusCard3 ==5) {
			notify.append("The crew discovers they have stowaway cats, countering Rats.");
		}
		if (ZeusInterface.zeusCard2 == 7) {
			notify.append("The sailors are decent at their jobs, countering Whirlpool.");
		}
		if (ZeusInterface.zeusCard3 == 2) {
			notify.append("Zeus asks Helios to melt some stuff for him, countering Iceberg.");
		}
		if (ZeusInterface.zeusCard3 == 4) {
			notify.append("Zeus skipped his turn.");
		}
		
		if (Earthquake == true) {
			notify.append("An earthquake kills five crewmen.");
			Main.crew = Main.crew - 5;
			crew.setText("Crew Remaining" + Main.crew + "Men");
			distanceLeft.setText("Distance From Ithaka: " + Main.distance + "m");
			SwingUtilities.updateComponentTreeUI(this);
			Earthquake = false;
			earthquakeNotify = true;
		}
		if (Mutiny == true) {
			notify.append("Odysseus' crew mutinied, sending him back forty spaces.");
			Main.distance = Main.distance + 40;
			crew.setText("Crew Remaining" + Main.crew + "Men");
			distanceLeft.setText("Distance From Ithaka: " + Main.distance + "m");
			SwingUtilities.updateComponentTreeUI(this);
			Mutiny = false;
			mutinyNotify = true;
		}
		if (Headwind == true) {
			notify.append("A strong headwind pushes Odysseus back sixteen spaces.");
			Main.distance = Main.distance + 16;
			crew.setText("Crew Remaining" + Main.crew + "Men");
			distanceLeft.setText("Distance From Ithaka: " + Main.distance + "m");
			SwingUtilities.updateComponentTreeUI(this);
			Headwind = false;
			headwindNotify = true;
		}
		if (Scurvy == true) {
			notify.append("Scurvy kills off five crewmen.");
			Main.crew = Main.crew - 5;
			crew.setText("Crew Remaining" + Main.crew + "Men");
			distanceLeft.setText("Distance From Ithaka: " + Main.distance + "m");
			SwingUtilities.updateComponentTreeUI(this);
			Scurvy = false;
			scurvyNotify = true;
		}
		if (spoiledFood == true) {
			notify.append("Three crewmen have died of starvation.");
			Main.crew = Main.crew -3;
			crew.setText("Crew Remaining" + Main.crew + "Men");
			distanceLeft.setText("Distance From Ithaka: " + Main.distance + "m");
			SwingUtilities.updateComponentTreeUI(this);
			spoiledFood = false;
			spoiledFoodNotify = true;
		}
		if (workRelatedInjury == true) {
			notify.append("Some idiot fell off the ship. He was promptly and savagely devoured by sharks.");
			Main.crew = Main.crew - 1;
			crew.setText("Crew Remaining" + Main.crew + "Men");
			distanceLeft.setText("Distance From Ithaka: " + Main.distance + "m");
			SwingUtilities.updateComponentTreeUI(this);
			workRelatedInjury = false;
			workRelatedInjuryNotify = true;
		}
		if (tidalWaves == true) {
			notify.append("A massive tidal wave kills five crewmen.");
			Main.crew = Main.crew - 5;
			crew.setText("Crew Remaining" + Main.crew + "Men");
			distanceLeft.setText("Distance From Ithaka: " + Main.distance + "m");
			SwingUtilities.updateComponentTreeUI(this);
			tidalWaves = false;
			tidalWavesNotify = true;
		}
		if (rogueSeirenes == true) {
			notify.append("Seirenes have killed fifteen crewmen, and sent Odysseus back twenty spaces.");
			Main.crew = Main.crew - 15;
			Main.distance = Main.distance + 20;
			crew.setText("Crew Remaining" + Main.crew + "Men");
			distanceLeft.setText("Distance From Ithaka: " + Main.distance + "m");
			SwingUtilities.updateComponentTreeUI(this);
			rogueSeirenes = false;
			rogueSeirenesNotify = true;
		}
		if (hardcoreMutiny == true) {
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
				PoseidonWins poseidonWins = new PoseidonWins();
				poseidonWins.setVisible(true);
				ZeusInterface zeusInterface = new ZeusInterface();
				zeusInterface.dispose();
				this.dispose();
				break;
			}
			hardcoreMutiny = false;
			hardcoreMutinyNotify = true;
		}
		if (Whirlpool == true) {
			notify.append("A whirlpool killed three crewmen, and sent Odysseus back ten spaces.");
			Main.crew = Main.crew - 3;
			Main.distance = Main.distance + 10;
			crew.setText("Crew Remaining" + Main.crew + "Men");
			distanceLeft.setText("Distance From Ithaka: " + Main.distance + "m");
			SwingUtilities.updateComponentTreeUI(this);
			Whirlpool = false;
			whirlpoolNotify = true;
		}
		if (Iceberg == true) {
			notify.append("An iceberg kills ten crewmen.");
			Main.crew = Main.crew - 10;
			crew.setText("Crew Remaining" + Main.crew + "Men");
			distanceLeft.setText("Distance From Ithaka: " + Main.distance + "m");
			SwingUtilities.updateComponentTreeUI(this);
			Iceberg = false;
			icebergNotify = true;
		}
		if (Rats == true) {
			notify.append("Rats bring disease, killing five crewmen.");
			Main.crew = Main.crew - 5;
			crew.setText("Crew Remaining" + Main.crew + "Men");
			distanceLeft.setText("Distance From Ithaka: " + Main.distance + "m");
			SwingUtilities.updateComponentTreeUI(this);
			Rats = false;
			ratsNotify = true;
		}
		if (ZeusInterface.Tailwind == true) {
			notify.append("A strong tailwind pushes Odysseus forward sixteen spaces.");
			Main.distance = Main.distance - 16;
			crew.setText("Crew Remaining" + Main.crew + "Men");
			distanceLeft.setText("Distance From Ithaka: " + Main.distance + "m");
			ZeusInterface.Tailwind = false;
		}
		
		if (Main.poseidonCard1Played == 0) {
			Random random = new Random();
			int rCard1 = random.nextInt(7);
			switch (rCard1) {
			case 0:
				Main.poseidonCard1Choice = 0;
				break;
			case 1:
				Main.poseidonCard1Choice = 1;
				break;
			case 2:
				Main.poseidonCard1Choice = 2;
				break;
			case 3:
				Main.poseidonCard1Choice = 3;
				break;
			case 4:
				Main.poseidonCard1Choice = 4;
				break;
			case 5:
				Main.poseidonCard1Choice = 5;		
				break;
			case 6:
				Main.poseidonCard1Choice = 6;
				break;
			case 7:
				Main.poseidonCard1Choice = 7;
				break;
			}
			Main.poseidonCard1Played = 1;
		}
			switch (Main.poseidonCard1Choice) {
			case 0:
				card1Available = 0;
				card1Title.setText("EarthQuake");
				card1Area.setText("Effect: Kills 5 crewmen.");
				break;
			case 1:
				card1Available = 1;
				card1Title.setText("Mutiny");
				card1Area.setText("Effect: Sends Odysseus back forty spaces.");
				break;
			case 2:
				card1Available = 2;
				card1Title.setText("Headwind");
				card1Area.setText("Effect: Sends Odysseus back sixteen spaces.");
				break;
			case 3:
				card1Available = 3;
				card1Title.setText("Scurvy");
				card1Area.setText("Effect: Kills 5 crewmen.");
				break;
			case 4:
				card1Available = 4;
				card1Title.setText("Spoiled Food");
				card1Area.setText("Effect: Kills three crewmen.");
				break;
			case 5:
				card1Available = 5;
				card1Title.setText("Spoiled Food");
				card1Area.setText("Effect: Kills three crewmen.");
				break;
			case 6:
				card1Available = 6;
				card1Title.setText("Work-Related Injury");
				card1Title.setBounds(440, 475, 300, 30);
				card1Area.setText("Effect: Kills one crewman.");
				break;
			case 7:
				card1Available = 7;
				card1Title.setText("Headwind");
				card1Area.setText("Effect: Sends Odysseus back sixteen spaces.");
				break;
			}
		if (Main.poseidonCard2Played == 0) {
			Random random = new Random();	
			int rCard2 = random.nextInt(7);
				switch (rCard2) {
				case 0:
					Main.poseidonCard2Choice = 0;
					break;
				case 1:
					Main.poseidonCard2Choice = 1;
					break;
				case 2:
					Main.poseidonCard2Choice = 2;
					break;
				case 3:
					Main.poseidonCard2Choice = 3;
					break;
				case 4:
					Main.poseidonCard2Choice = 4;
					break;
				case 5:
					Main.poseidonCard2Choice = 5;
					break;
				case 6:
					Main.poseidonCard2Choice = 6;
					break;
				case 7:
					Main.poseidonCard2Choice = 7;
					break;
				}
				Main.poseidonCard2Played = 1;
		}
			switch (Main.poseidonCard2Choice) {
			case 0:
				card2Available = 0;
				card2Title.setText("Tidal Waves");
				card2Area.setText("Effect: Kills five crewmen.");
			break;
			case 1:
				card2Available = 1;
				card2Title.setText("Earthquake");
				card2Area.setText("Effect: Kills five crewmen.");
				break;
			case 2:
				card2Available = 2;
				card2Title.setText("Rogue Seirenes");
				card2Area.setText("Effect: Kills fifteen crewmen, sends Odysseus back twenty spaces.");
				break;
			case 3:
				card2Available = 3;
				card2Title.setText("Hardcore Mutiny");
				card2Area.setText("Effect: 1/12 chance of killing Odysseus.");
				break;
			case 4:
				card2Available = 4;
				card2Title.setText("Scurvy");
				card2Area.setText("Effect: Kills five crewmen.");
				break;
			case 5:
				card2Available = 5;
				card2Title.setText("Work-Related Injury");
				card2Title.setBounds(740, 475, 300, 30);
				card2Area.setText("Effect: Kills one crewman.");
				break;
			case 6:
				card2Available = 6;
				card2Title.setText("Whirlpool");
				card2Area.setText("Effect: Kills three crewmen, sends Odysseus back ten spaces.");
				break;
			case 7:
				card2Available = 7;
				card2Title.setText("Whirlpool");
				card2Area.setText("Effect: Kills three crewmen, sends Odysseus back ten spaces.");
				break;
			}
		if (Main.poseidonCard3Played == 0) {
			Random random = new Random();
			int rCard3 = random.nextInt(7);
			switch (rCard3) {
			case 0:
				Main.poseidonCard3Choice = 0;
				break;
			case 1:
				Main.poseidonCard3Choice = 1;
				break;
			case 2:
				Main.poseidonCard3Choice = 2;
				card3 = 2;
				break;
			case 3:
				Main.poseidonCard3Choice = 3;
				card3 = 3;
				break;
			case 4:
				Main.poseidonCard3Choice = 4;
				card3 = 4;
				break;
			case 5:
				Main.poseidonCard3Choice = 5;
				card3 = 5;
				break;
			case 6:
				Main.poseidonCard3Choice = 6;
				card3 = 6;
				break;
			case 7:
				Main.poseidonCard3Choice = 7;
				card3 = 7;
			break;
			}
			Main.poseidonCard3Played = 1;
		}
		switch (Main.poseidonCard3Choice) {
		case 0:
			card3Available = 0;
			card3Title.setText("Headwind");
			card3Area.setText("Effect: Sends Odysseus back sixteen spaces.");
			break;
		case 1:
			card3Available = 1;
			card3Title.setText("Spoiled Food");
			card3Area.setText("Effect: Kills three crewmen.");
			break;
		case 2:
			card3Available = 2;
			card3Title.setText("A Friggin Ice-berg");
			card3Area.setText("Effect: Kills ten crewmen.");
			break;
		case 3:
			card3Available = 3;
			card3Title.setText("Rats");
			card3Area.setText("Effect: Kills 5 crewmen.");
			break;
		case 4:
			card3Available = 4;
			card3Title.setText("Spy");
			card3Area.setText("Effect: Allows you to see Zeus's current hand.");
			break;
		case 5:
			card3Available = 5;
			card3Title.setText("Rats");
			card3Area.setText("Effect: Kills 5 crewmen.");
			break;
		case 6:
			card3Available = 6;
			card3Title.setText("Whirlpool");
			card3Area.setText("Effect: Kills three crewmen, sends Odysseus back ten spaces.");
			break;
		case 7:
			card3Available = 7;
			card3Title.setText("Scurvy");
			card3Area.setText("Effect: Kills five crewmen.");
			break;
		}
		getContentPane().add(card1Title);
		getContentPane().add(card2Title);
		getContentPane().add(card3Title);
		getContentPane().add(card1Area);
		getContentPane().add(card2Area);
		getContentPane().add(card3Area);
		
		if (Main.distance < 17000 && Main.Ismaros == 0) {
			notify.append("Odysseus arrives at Ismaros. His crew, however, is mutinous. 'Sheep after sheep they butchered... while fugitives went inland, running to call to arms their main force... Six benches were left empty in every ship,'");
			Main.crew = Main.crew - 18;
			Main.Ismaros = 1;
			ismarosNotify = 1;
		}
		if (Main.distance <13000 && Main.Lotos == 0) {
			notify.append("Odysseus arrives at an island inhabited by peaceful lotos eaters. However, 'those who ate the lotos longed to stay forever.' Two crewmen are lost.");
			Main.crew = Main.crew - 2;
			Main.Lotos = 1;
			lotosNotify = 1;
		}
		if (Main.distance < 8000 && Main.Kyklops == 0) {
			notify.append("Odysseus arrives at an island inhabited by giant Kyklops. His men attempt to steal sheep from Polyphemos. Polyphemos takes Odysseus's crewmates in his hands 'like squirming puppies to beat their brains out.");
			Main.crew = Main.crew - 6;
			Main.Kyklops = 1;
			kyklopsNotify = 1;
		}
		if (Main.distance < 5000 && Main.Aiolin == 0) {
			notify.append("Odysseus reaches Ailoi island. Here he is a given a bag of winds, and receives twenty crewmen before being sent on his way. However, 'temptation had its way with his companions and they untied the bag of winds.' Odysseus moves back 10000 spaces.");
			Main.crew = Main.crew + 20;
			Main.distance = Main.distance + 10000;
			Main.Aiolin = 1;
			aiolinNotify = 1;
			Main.Cannibal = 0;
			Main.Kirke = 0;
			Main.Underworld = 0;
			Main.Seirenes = 0;
			Main.Skylla = 0;
			Main.Helios = 0;
			Main.Kalypso = 0;
			Main.Antinoos = 0;
		}
		if (Main.distance < 12000 && Main.Cannibal == 0) {
			notify.append("Odysseus finds land, but soon discovers it is inhabited by cannibals. The king 'seizes a man... and makes a meal of him.' Odysseus loses ten crewmen.");
			Main.crew = Main.crew - 10;
			Main.Cannibal = 1;
			cannibalNotify = 1;
		}
		if (Main.distance < 9000 && Main.Kirke == 0) {
			notify.append("Odysseus arrives at an island. He sends scouts to investigate. They discover Kirke, who magically turns them into pigs and 'flew after them with her long stick and shut them in a pigsty.' With the help of Hermes, Odysseus freed his men and convinced Kirke to help him. Before leaving, however, a drunk crewman, who was sitting on the roof, 'missed his footing and fell that height headlong.' One crewman dies.");
			Main.crew = Main.crew - 1;
			Main.Kirke = 1;
			kirkeNotify = 1;
		}
		if (Main.distance < 7500 && Main.Underworld == 0) {
			notify.append("After being told he must go by Kirke, Odysseus has traveled to the underworld. There, he speaks with Teiresias, a prince of Thebes, and his mother, among others.");
			Main.Underworld = 1;
			underworldNotify = 1;
		}
		if (Main.distance < 5000 && Main.Seirenes == 0) {
			notify.append("Odysseus passes the territory of the Seirenes, but being forewarned of them by Kirke, everyone survives the encounter.");
			Main.Seirenes = 1;
			seirenesNotify = 1;
		}
		if (Main.distance < 4000 && Main.Skylla == 0) {
			notify.append("Odysseus encounters Skylla, the sea witch. 'She made her strike, whisking six of Odysseus's best men from the ship.");
			Main.crew = Main.crew - 6;
			Main.Skylla = 1;
			skyllaNotify = 1;
		}
		if (Main.distance < 3000 && Main.Helios == 0) {
			notify.append("Odysseus reaches an island with cattle owned by Helios. His men, desparate for food, take and eat the cattle. In retribution, 'Zeus let fly a bolt against the ship.' Odysseus's crew is decimated.");
			Main.crew = 1;
			Main.Helios = 1;
			heliosNotify = 1;
		}
		if (Main.distance < 2995 && Main.Kalypso == 0) {
			notify.append("Odysseus reaches the island of Kalypso. There, he is held as a sex slave for eight years. So... that was a thing.");
			Main.Kalypso = 1;
			kalypsoNotify = 1;
		}
		if (Main.distance <= 2990 && Main.Antinoos == 0) {
			notify.append("Odysseus, after being nearly drowned in a hurricane caused by Poseidon, finds himself on the island of Antinoos. There, he is treated very well. He gains 100 crewmen for the final part of his journey.");
			Main.crew = Main.crew + 100;
			Main.Antinoos = 1;
			antinoosNotify = 1;
		}
		
		if (Main.distance <= 0) {
			ZeusWins zeusWins = new ZeusWins();
			zeusWins.setVisible(true);
			ZeusInterface zeusInterface = new ZeusInterface();
			zeusInterface.dispose();
			this.dispose();
		}
		if (Main.crew <= 0) {
			PoseidonWins poseidonWins = new PoseidonWins();
			poseidonWins.setVisible(true);
			ZeusInterface zeusInterface = new ZeusInterface();
			zeusInterface.dispose();
			this.dispose();
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
			switch (card1Available) {
			case 0:
				card1 = 0;
				Earthquake = true;
				break;
			case 1:
				card1 = 1;
				Mutiny = true;
				break;
			case 2:
				card1 = 2;
				Headwind = true;
				break;
			case 3:
				card1 = 3;
				Scurvy = true;
				break;
			case 4:
				card1 = 4;
				spoiledFood = true;
				break;
			case 5:
				card1 = 5;
				spoiledFood = true;
				break;
			case 6:
				card1 = 6;
				workRelatedInjury = true;
				break;
			case 7:
				card1 = 7;
				Headwind = true;
				break;
			}
			card2 = -1;
			card3 = -1;
				Main.poseidonCard1Played = 0;
				ZeusStartTurn zeusStartTurn = new ZeusStartTurn();
				zeusStartTurn.setVisible(true);
				SwingUtilities.updateComponentTreeUI(this);
				this.setVisible(false);
			}
		
		if (e.getActionCommand() == "playCard2") {
				switch (card2Available) {
				case 0:
					card2 = 0;
					tidalWaves = true;
					break;
				case 1:
					card2 = 1;
					Earthquake = true;
					break;
				case 2:
					card2 = 2;
					rogueSeirenes = true;
					break;
				case 3:
					card2 = 3;
					hardcoreMutiny = true;
					break;
				case 4:
					card2 = 4;
					Scurvy = true;
					break;
				case 5:
					card2 = 5;
					workRelatedInjury = true;
					break;
				case 6:
					card2 = 6;
					Whirlpool = true;
					break;
				case 7:
					card2 = 7;
					Whirlpool = true;
					break;
				}
				card1 = -1;
				card3 = -1;
				Main.poseidonCard2Played = 0;
				ZeusStartTurn zeusStartTurn = new ZeusStartTurn();
				zeusStartTurn.setVisible(true);
				SwingUtilities.updateComponentTreeUI(this);
				this.setVisible(false);
			}
		
		if (e.getActionCommand() == "playCard3") {
				switch (card3Available) {
				case 0:
					card3 = 0;
					Headwind = true;
					break;
				case 1:
					card3 = 1;
					spoiledFood = true;
					break;
				case 2:
					card3 = 2;
					Iceberg = true;
					break;
				case 3:
					card3 = 3;
					Rats = true;
					break;
				case 4:
					card3 = 4;
					usedSpy = 1;
					break;
				case 5:
					card3 = 5;
					Rats = true;
					break;
				case 6:
					card3 = 6;
					Whirlpool = true;
					break;
				case 7:
					card3 = 7;
					Scurvy = true;
					break;
				}
				card1 = -1;
				card2 = -1;
				Main.poseidonCard3Played = 0;
				ZeusStartTurn zeusStartTurn = new ZeusStartTurn();
				zeusStartTurn.setVisible(true);
				SwingUtilities.updateComponentTreeUI(this);
				this.setVisible(false);
			}
		if (e.getActionCommand() == "pass") {
			card1 = -1;
			card2 = -1;
			card3 = -1;
			ZeusInterface.poseidonPassed = 1;
			ZeusStartTurn zeusStartTurn = new ZeusStartTurn();
			zeusStartTurn.setVisible(true);
			this.setVisible(false);
		}
		
		if (e.getActionCommand() == "redraw") {
			card1 = -1;
			card2 = -1;
			card3 = -1;
			ZeusInterface.poseidonRedrew = 1;
			Main.poseidonCard1Played = 0;
			Main.poseidonCard2Played = 0;
			Main.poseidonCard3Played = 0;
			ZeusStartTurn zeusStartTurn = new ZeusStartTurn();
			zeusStartTurn.setVisible(true);
			this.setVisible(false);
		}
		}
	}