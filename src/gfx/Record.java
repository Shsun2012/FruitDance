package gfx;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.naming.InitialContext;

import display.Display;
import entities.Marks;
import input.KeyManager;

public class Record implements Runnable, KeyListener{

	private Display display;
	public boolean running;
	public Thread thread;
	double beatsInterval;
	long previous=0;
	long now=0;
	double interval;
	public Record() {
		System.out.println("Start:");
	}

	public void init(){
		display = new Display("record", 200, 200);
		display.getFrame().addKeyListener(this);
		display.getCanvas().addKeyListener(this);
	}
	@Override
	public void run() {
		running=true;
		init();
		stop();
	}
	
	public synchronized void start(){
		if (running) {
			return;
		}
		running=true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop(){
		if (!running) {
			return;
		}
		running=false;
		try {
			thread.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode()==KeyEvent.VK_J) {
			now = System.nanoTime();
			interval=(now-previous)/1000000000.0;
			beatsInterval=interval*120;
			System.out.println(beatsInterval);
			previous=now;

		}
			
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
