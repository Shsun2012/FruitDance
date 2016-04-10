package hw4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.RenderingHints.Key;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.naming.InitialContext;
import javax.swing.text.Keymap;

import display.Display;
import gfx.Assets;
import input.KeyManager;
import input.MouseManger;
import music.Music;
import state.GameState;
import state.HelpState;
import state.MenuState;
import state.ScoreReport;
import state.State;

/*
 * main part of the game
 */

public class Game implements Runnable{
	
	private Display display;
	public int width, height;
	public String title;
	
	public Thread thread;
	//public Thread musicThread;
		
	public Music bgMusic;
	
	private boolean running;
	private BufferStrategy bStrategy;
	private Graphics graphics;
	
	//states
	public State gameState;
	public State menuState;
	public State helpState;
	public State scoreState;

	//input
	private KeyManager keyManager;
	private MouseManger mouseManger;
	
	//handler
	private Handler handler;
	
	public Game(String title, int width, int height) {
		this.width = width;
		this.height = height;
		this.title = title;
		keyManager = new KeyManager();
		mouseManger = new MouseManger();
		
	}
	
	public void init() {
		display = new Display(title, width, height);
		display.getFrame().addKeyListener(keyManager); //access to keyboard
		display.getFrame().addMouseListener(mouseManger);
		display.getFrame().addMouseMotionListener(mouseManger);
		display.getCanvas().addMouseListener(mouseManger);
		display.getCanvas().addMouseMotionListener(mouseManger);
		
		Assets.init();
	
		handler = new Handler(this);
		gameState = new GameState(handler);
		menuState = new MenuState(handler);
		helpState = new HelpState(handler);
		scoreState= new ScoreReport(handler);
		//musicThread=new Thread(new Music("/East of Eden"));
		//getClass().getResourceAsStream("resource/East of Eden.mp3");
		
		bgMusic=new Music("/East of Eden");
		State.setState(menuState);	
	}
	
	public void run(){
		running=true;
		init();		
		
		int fps = 60; //frames per second
		double timePerTick = 1000000000/fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime(); //return the amount of time in nano seconds
		long timer = 0;
		int ticks = 0;
		while(running){
			now = System.nanoTime();
			delta +=(now-lastTime)/timePerTick;
			timer += now-lastTime;
			lastTime = now;
			
			if (delta >=1) { 
				tick();
				render();
				ticks++;
				delta--;
			}
			
			if (timer>=1000000000) {
				ticks = 0;
				timer = 0;
			}
		
		}
		stop();
	}

	public synchronized void start(){
		if (running) {
			return;
		}
		running= true;
		thread = new Thread(this);
		thread.start(); //call the run method	
		
	}

	public void tick(){
		keyManager.tick();
		if (State.getState()!=null) {
			State.getState().tick();
		}
	
	}

	public void render(){
		bStrategy=display.getCanvas().getBufferStrategy();
		if (bStrategy==null) {
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		graphics = bStrategy.getDrawGraphics();
		
		//clear screen
		graphics.clearRect(0, 0, width, height);	
		
		//draw here
		
		if (State.getState()!=null) {
			State.getState().render(graphics);
		}
		
		//end drawing
		bStrategy.show();
		graphics.dispose();
			
	}
	
	public KeyManager getKeyMangater() {
		return keyManager;
	}
	
	public MouseManger getMouseManater(){
		return mouseManger;
	}
	public synchronized void stop(){
		if (!running) {
			return;
		}
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
