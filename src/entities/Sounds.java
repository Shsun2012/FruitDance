package entities;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

import gfx.Assets;
import hw4.Handler;
import music.Sound;
import tiles.Tile;

public class Sounds{
	
	protected Handler handler;
	
	public Sounds(Handler handler) {
		this.handler=handler;
	}
	public void tick(){
		this.play();
	}
	
	public void play(){
		if (handler.getKeyManager().move1) {
			Assets.sound1.play();
		}
		if (handler.getKeyManager().move2) {
			Assets.sound2.play();
		}
		if (handler.getKeyManager().move3) {
			Assets.sound2.play();
		}
	}
	
	
}
