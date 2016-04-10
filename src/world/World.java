package world;

import java.awt.Graphics;

import javax.rmi.CORBA.Util;

import entities.EntityManager;
import entities.Player;
import hw4.Game;
import hw4.Handler;
import tiles.Tile;
import utils.Utils;

public class World {
	private Game game;
	private int width, height;
	private int spawnX, spawnY;
	private Handler handler;
	private int[][] tiles;
	
	//entities
	private EntityManager entityManager;
	
	public World(Handler handler, String path) {
		this.handler=handler;
		entityManager = new EntityManager(handler, new Player(handler, 100, 100));
		loadworld(path);
		
		entityManager.getPlayer().setX(spawnX);
		entityManager.getPlayer().setY(spawnY);
		
	}
	
	private void loadworld(String path){
		String file = Utils.loadFileAsString(path);
		String[] tokens = file.split("\\s+");
		width = Utils.parseInt(tokens[0]);
		height = Utils.parseInt(tokens[1]);
		spawnX = Utils.parseInt(tokens[2]);
		spawnY = Utils.parseInt(tokens[3]);
		
		tiles = new int[width][height];
		
		for(int y=0;y<height;y++){
			for (int x = 0; x < width; x++) {
				tiles[x][y]=Utils.parseInt(tokens[(x+y*width)+4]);
			}
		}
	}
	
	public void tick() {
		entityManager.tick();
	}
	
	public void render(Graphics graphics) {
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				getTile(x, y).render(graphics, x*Tile.TILEWIDTH, y*Tile.TILEHEIGHT);
			}
		}
		
		//entities
		entityManager.render(graphics);
	}
	
	public Tile getTile(int x, int y) {
		Tile tile = Tile.tiles[tiles[x][y]];
		if (tile ==null) {
			return Tile.musicalNote;
		}
		return tile;
		
	}
	
}
