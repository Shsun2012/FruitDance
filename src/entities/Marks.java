package entities;

import java.awt.Graphics;

import gfx.Assets;
import hw4.Handler;
import music.Sound;
import tiles.Tile;

public class Marks extends Entity{
	
	public boolean show;

	public Marks(Handler handler, float x, float y) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		show=true;
	}

	public void tick() {
		
		
	}

	public void render(Graphics graphics) {		
		if (y<=450 && y>400) {
			if (handler.getKeyManager().move1 && x<125) {
				int tempScore=HUD.getScore();
				
				
				if (y>400 && y<420) {
					HUD.judge=0;
					tempScore+=100;
					
				}else{
					HUD.judge=1;
					tempScore+=50;
					
				}
				HUD.setScore(tempScore);
				Assets.sound1.play();
				y=-30000;
				show=false;
			}
			if (handler.getKeyManager().move2 && x>125 && x<250) {
				int tempScore=HUD.getScore();
				
				
				if (y>400 && y<420) {
					tempScore+=100;
					
					HUD.judge=0;
				}else{
					HUD.judge=1;
					tempScore+=50;
					
				}
				HUD.setScore(tempScore);
				Assets.sound2.play();
				y=-30000;
				show=false;
			}
			if (handler.getKeyManager().move3 && x>250 && x<375) {
				int tempScore=HUD.getScore();
				
				
				if (y>400 && y<420) {
					tempScore+=100;
					HUD.judge=0;
					
				}else{
					HUD.judge=1;
					tempScore+=50;
					
				}
				HUD.setScore(tempScore);
				Assets.sound1.play();
				y=-30000;
				show=false;
			}
			if (handler.getKeyManager().move4 && x>375 && x <500) {
				int tempScore=HUD.getScore();
				
				
				if (y>400 && y<420) {
					tempScore+=100;
					HUD.judge=0;
					
				}else{
					HUD.judge=1;
					tempScore+=50;
					
				}
				HUD.setScore(tempScore);
				Assets.sound1.play();
				y=-30000;
				show=false;
			}
			if (handler.getKeyManager().move5 && x>500 && x <625) {
				int tempScore=HUD.getScore();
			
				
				if (y>400 && y<420) {
					tempScore+=100;
					HUD.judge=0;
					
				}else{
					HUD.judge=1;
					tempScore+=50;
					
				}
				HUD.setScore(tempScore);
				Assets.sound2.play();
				
				y=-30000;
				show=false;
			}
			if (handler.getKeyManager().move6 && x>625 && x <750) {
				int tempScore=HUD.getScore();
				
				
				if (y>400 && y<420) {
					tempScore+=100;
					
					HUD.judge=0;
				}else{
					HUD.judge=1;
					tempScore+=50;
					
				}
				HUD.setScore(tempScore);
				Assets.sound1.play();
				y=-30000;
				show=false;
			}
			if (handler.getKeyManager().move7 && x>750 && x <875) {
				int tempScore=HUD.getScore();
				
				
				if (y>400 && y<420) {
					tempScore+=100;
					HUD.judge=0;
					
				}else{
					HUD.judge=1;
					tempScore+=50;
					
				}
				HUD.setScore(tempScore);
				Assets.sound1.play();
				y=-30000;
				show=false;
			}
			if (handler.getKeyManager().move8 && x>875 && x <1000) {
				int tempScore=HUD.getScore();
				
				
				if (y>400 && y<420) {
					tempScore+=100;
					HUD.judge=0;
					
				}else{
					HUD.judge=1;
					tempScore+=50;
					
				}
				HUD.setScore(tempScore);
				Assets.sound2.play();
				y=-30000;
				show=false;
			}
		}
		if (y>450) {
			HUD.judge=2;
		}
		if (y>500) {
			y=-30000;
			show=false;
		}
		
		graphics.drawImage(Assets.note1, (int) x, (int) y, width, height, null); 
	
		y+=2;
	
		
	}
	
}
