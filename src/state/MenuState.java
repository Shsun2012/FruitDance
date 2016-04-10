package state;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import entities.HUD;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import hw4.Handler;
import music.Music;

public class MenuState extends State {
	
	public Rectangle playButton = new Rectangle(420, 150, 130, 50);
	public Rectangle helpButton = new Rectangle(420, 250, 130, 50);
	public Rectangle quitButton = new Rectangle(420, 350, 130, 50);
	public float mx;
	public float my;
	public boolean leftPressed;
	public boolean rightPressed;
	public boolean startHover=false;
	public boolean helpHover=false;
	public boolean quitHover=false;
	public boolean setMusic=false;
	
	private GameState gameState;
	
	
	public MenuState(Handler handler) {
		super(handler);
	}
	
	@Override
	public void tick() {
		mx=handler.getMouseManager().getMouseX();
		my=handler.getMouseManager().getMouseY();
		leftPressed = handler.getMouseManager().isLeftPressed();
		rightPressed = handler.getMouseManager().isRightPressed();
		if (mx>420 && mx< 550 && my>150 && my<200){
			startHover=true;
		}else {
			startHover=false;
		}
		if (mx>420 && mx<550 && my>350 && my<400){
			quitHover = true;
		}else {
			quitHover = false;
		}
		if (mx >420 && mx<550 && my >250 && my<300) {
			helpHover=true;
		}else {
			helpHover=false;
		}
		if (startHover && leftPressed) {
			gameState=new GameState(handler);
			handler.getGame().gameState=gameState;	
			HUD.score=0;
			HUD.judge=3;
			setState(handler.getGame().gameState);
			handler.getGame().bgMusic.run();
		}
		if (quitHover && leftPressed) {
			System.exit(0);
		}
		if (helpHover && leftPressed) {
			setState(handler.getGame().helpState);
			
		}
	}
	
	@Override
	public void render(Graphics graphics) {
		Graphics2D graphics2d = (Graphics2D) graphics;
		
		graphics.setColor(Color.pink);
		graphics.fillRect(0, 0, 1000, 600);
		Font font0 = new Font("arial", Font.BOLD, 50);
		graphics.setFont(font0);
		graphics.setColor(Color.white);
		graphics.drawString("Fruit Dance", 360, 100);
		
		Font font1 = new Font("arial", Font.BOLD, 30);
		graphics.setFont(font1);
		
		if (startHover) {
			graphics.setColor(Color.blue);
		}else {
			graphics.setColor(Color.white);
		}
		graphics.drawString("Play", playButton.x+30, playButton.y+32);		
		graphics2d.draw(playButton);
		
		if (helpHover) {
			graphics.setColor(Color.blue);
		}else {
			graphics.setColor(Color.white);
		}
		graphics.drawString("Help", helpButton.x+30, helpButton.y+32);
		graphics2d.draw(helpButton);
		
		if (quitHover) {
			graphics.setColor(Color.blue);
		}else {
			graphics.setColor(Color.white);
		}
		graphics.drawString("Quit", quitButton.x+30, quitButton.y+32);
		graphics2d.draw(quitButton);
		
		
		
	}
}
