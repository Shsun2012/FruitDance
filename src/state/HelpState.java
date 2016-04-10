package state;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import gfx.Assets;
import hw4.Handler;
import music.Music;

public class HelpState extends State{

	public float mx;
	public float my;
	public boolean leftPressed;
	public boolean rightPressed;
	public boolean returnHover=false;
	public Rectangle returnButton = new Rectangle(400, 300, 180, 60);
	
	public HelpState(Handler handler) {
		super(handler);
	}

	@Override
	public void tick() {
		mx=handler.getMouseManager().getMouseX();
		my=handler.getMouseManager().getMouseY();
		leftPressed = handler.getMouseManager().isLeftPressed();
		if (mx>400 && mx< 580 && my>300 && my<360){
			returnHover=true;
		}else {
			returnHover=false;
		}	
		if (returnHover && leftPressed) {
			setState(handler.getGame().menuState);
		}
	}

	@Override
	public void render(Graphics graphics) {
		Graphics2D graphics2d = (Graphics2D) graphics;
		graphics.drawImage(Assets.instruction,0,0,null);
		
		Font font0 = new Font("arial", Font.BOLD, 50);
		graphics.setFont(font0);
		if (returnHover) {
			graphics.setColor(Color.blue);
		}else {
			graphics.setColor(Color.pink);
		}
		graphics.drawString("Return", returnButton.x, returnButton.y+50);
		//graphics2d.draw(returnButton);
		
	}

}
