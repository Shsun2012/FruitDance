package hw4;

import input.KeyManager;
import input.MouseManger;
import world.World;

public class Handler {
	private Game game;
	private World world;
	public Handler(Game game) {
		this.game=game;
	}
	
	public KeyManager getKeyManager(){
		return game.getKeyMangater();
	}
	
	public MouseManger getMouseManager(){
		return game.getMouseManater();
	}

	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	
	public  World getWorld() {
		return world;
	}
	public void setWorld(World world) {
		this.world=world;
	}
}
