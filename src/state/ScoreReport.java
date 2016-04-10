package state;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Menu;
import java.awt.Rectangle;

import entities.HUD;
import hw4.Handler;
import music.Music;

public class ScoreReport extends State {

	public float mx;
	public float my;
	public boolean leftPressed;
	public boolean rightPressed;
	public boolean returnHover=false;
	public Rectangle returnButton = new Rectangle(400, 400, 180, 60);
	public boolean restart;
	
	public ScoreReport(Handler handler) {
		super(handler);
	}

	@Override
	public void tick() {
		mx=handler.getMouseManager().getMouseX();
		my=handler.getMouseManager().getMouseY();
		leftPressed = handler.getMouseManager().isLeftPressed();
		if (mx>400 && mx< 580 && my>400 && my<460){
			returnHover=true;
		}else {
			returnHover=false;
		}	
		if (returnHover && leftPressed) {
			restart=true;
			setState(handler.getGame().menuState);
			handler.getGame().bgMusic.stop();
			if (HUD.score>HUD.highScore) {
				HUD.setHighScore(HUD.score);
			}					
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
		graphics.drawString("Your Score is: "+HUD.score, 253, 100);
		graphics.drawString("Highest Scrore: "+HUD.highScore, 253, 300);
		
		Font font1 = new Font("arial", Font.BOLD, 50);
		graphics.setFont(font1);
		if (returnHover) {
			graphics.setColor(Color.blue);
		}else {
			graphics.setColor(Color.white);
		}
		graphics.drawString("Return", returnButton.x, returnButton.y+50);

	}

}
