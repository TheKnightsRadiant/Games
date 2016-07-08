package com.terracore.wizards;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

import com.terracore.handlers.MouseHandler;

public class Wizards extends Canvas implements Runnable {

	public static final String TITLE = "Wizards";
	public static final int WIDTH = 800;
	public static final int HEIGHT = WIDTH / 4 * 3;

	private static boolean running;

	public static boolean showTitleScreen = true;
	public static boolean showBeginScreen = false;
	public static boolean showPlayScreen = false;
	public static boolean showBuildScreen = false;
	public static boolean showHelpScreen = false;
	public static boolean showCreditsScreen = false;
	public static boolean showSettingsScreen = false;

	public static boolean volumeOn = true;
	public static boolean musicOn = true;

	TitleScreen titleScreen = new TitleScreen();
	BeginScreen beginScreen = new BeginScreen();
	PlayScreen playScreen = new PlayScreen();
	BuildScreen buildScreen = new BuildScreen();
	HelpScreen helpScreen = new HelpScreen();
	CreditsScreen creditsScreen = new CreditsScreen();

	static MouseHandler mouseHandler = new MouseHandler();

	public Wizards() {

	}

	private void render() {
		BufferStrategy bs = getBufferStrategy();
		if (bs == null) {
			createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		///////////////////////////////////////////

		// TITLE SCREEN
		if (showTitleScreen) {
			titleScreen.paint(g);
		}

		// BEGIN SCREEN
		if (showBeginScreen) {
			beginScreen.paint(g);
		}

		// PLAY SCREEN
		if (showPlayScreen) {
			playScreen.paint(g);
		}

		// BUILD SCREEN
		if (showBuildScreen) {
			buildScreen.paint(g);
		}

		// HELP SCREEN
		if (showHelpScreen) {
			helpScreen.paint(g);
		}

		// CREDITS SCREEN
		if (showCreditsScreen) {
			creditsScreen.paint(g);
		}

		///////////////////////////////////////////
		g.dispose();
		bs.show();
	}

	private void tick() {

	}

	private void start() {
		if (running)
			return;
		running = true;
		new Thread(this, "Thread-WizardsMain").start();
	}

	public static void stop() {
		if (!running) {
			return;
		}
		running = false;
		System.exit(0);
		///////// STOP THREADSSSSS
	}

	@Override
	public void run() {
		double targetFPS = 60.0;
		double nsPerTick = 1000000000.0 / targetFPS;
		long previousTime = System.nanoTime();
		long timer = System.currentTimeMillis();
		double unprocessed = 0.0;
		int FPS = 0;
		int TPS = 0;
		boolean canRender = false;
		while (running) {
			long now = System.nanoTime();
			unprocessed += (now - previousTime) / nsPerTick;
			previousTime = now;

			if (unprocessed >= 1.0) {
				tick();
				unprocessed--;
				TPS++;
				canRender = true;
			} else
				canRender = false;

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if (canRender) {
				render();
				FPS++;
			}

			if (System.currentTimeMillis() - 1000 > timer) {
				timer += 1000;
				System.out.printf("FPS: %d | TPS: %d\n", FPS, TPS);
				FPS = 0;
				TPS = 0;
			}
		}

		stop();
	}

	public static void main(String[] args) {
		Wizards game = new Wizards();
		JFrame frame = new JFrame(TITLE);
		frame.add(game);
		frame.setSize(WIDTH, HEIGHT);
		frame.setResizable(false);
		frame.setFocusable(true);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.err.println("Exiting Game");
				// stop threads
				game.stop();
			}
		});

		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.requestFocus();

		game.addMouseListener(mouseHandler);
		game.addMouseMotionListener(mouseHandler);

		game.start();
	}

}
