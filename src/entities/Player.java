package entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import gfx.Animation;
import gfx.Assets;
import hw4.Handler;
import music.Sound;

public class Player extends Creature{
	
	private Sound sound1 = new Sound("resource/CB_Clap.wav");
	
	
	
	//animation
	private Animation animMove0;
	private Animation animMove1;
	private Animation animMove2;
	private Animation animMove3;
	private Animation animMove4;
	private Animation animMove5;
	private Animation animMove6;
	private Animation animMove7;
	private Animation animMove8;
	private Animation animMove9;
	
	public Player(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		
		animMove0 = new Animation(100, Assets.player_move0);
		animMove1 = new Animation(50, Assets.player_move1);
		animMove2 = new Animation(50, Assets.player_move2);
		animMove3 = new Animation(50, Assets.player_move3);
		animMove4 = new Animation(50, Assets.player_move4);
		animMove5 = new Animation(50, Assets.player_move5);
		animMove6 = new Animation(50, Assets.player_move6);
		animMove7 = new Animation(50, Assets.player_move7);
		animMove8 = new Animation(50, Assets.player_move8);
		animMove9 = new Animation(50, Assets.player_move9);
	}

	private void getInput(){
		moves = 0;
		if (handler.getKeyManager().move0) {
			moves = 0;
		}
		if (handler.getKeyManager().move1) {
			moves = 1;
		}
		if (handler.getKeyManager().move2) {
			moves = 2;
		}
		if (handler.getKeyManager().move3) {
			moves = 3;
		}
		if (handler.getKeyManager().move4) {
			moves = 4;
		}
		if (handler.getKeyManager().move5) {
			moves = 5;
		}
		if (handler.getKeyManager().move6) {
			moves = 6;
		}
		if (handler.getKeyManager().move7) {
			moves = 7;
		}
		if (handler.getKeyManager().move8) {
			moves = 8;
		}
		if (handler.getKeyManager().move9) {
			moves = 9;
		}
		
		
	}
	@Override
	public void tick() {
		getInput();
		move();
		//animations
		animMove0.tick();
		animMove1.tick();
		animMove2.tick();
		animMove3.tick();
		animMove4.tick();
		animMove5.tick();
		animMove6.tick();
		animMove7.tick();
		animMove8.tick();
		animMove9.tick();

		//movement
	
	}

	@Override
	public void render(Graphics graphics) {
		graphics.drawImage(getCurrentAnimationFrame(), (int) x, (int) y, width, height,null);
		
	}
	
	private BufferedImage getCurrentAnimationFrame(){
		if (moves==0) {
			return animMove0.getCurrentFrame();
		}else if (moves ==1) {
			return animMove1.getCurrentFrame();
		}else if (moves ==2) {
			return animMove2.getCurrentFrame();
		}else if (moves ==3) {
			return animMove3.getCurrentFrame();
		}else if (moves ==4) {
			return animMove4.getCurrentFrame();
		}else if (moves ==5) {
			return animMove5.getCurrentFrame();
		}else if (moves ==6) {
			return animMove6.getCurrentFrame();
		}else if (moves ==7) {
			return animMove7.getCurrentFrame();
		}else if (moves ==8) {
			return animMove8.getCurrentFrame();
		}else if (moves ==9) {
			return animMove9.getCurrentFrame();
		}else {
			return animMove0.getCurrentFrame();
		}
	}

}
