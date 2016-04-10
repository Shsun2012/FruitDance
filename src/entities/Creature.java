package entities;

import hw4.Handler;

public abstract class Creature extends Entity{
	protected int health;
	protected float speed;
	protected float moves;
	
	public static final float DEFAULT_SPEED = 3.0f;
	public static final int DEFAULT_HEALTH= 10;
	public static final int DEFAULT_CREATURE_WIDTH=110;
	public static final int DEFAULT_CREATURE_HEIGHT=128;
	
	public Creature(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y,width, height);
		health = DEFAULT_HEALTH;
		speed = DEFAULT_SPEED;
		moves = 0;
	}
	
	public void move(){
		
	}
	
	//getters and setters
	
	public float getMoves() {
		return moves;
	}
	public void setMoves(float moves) {
		this.moves = moves;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}

}
