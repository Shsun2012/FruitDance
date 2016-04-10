package tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Tile {
	
	//static stuff
	public static Tile[] tiles = new Tile[100];
	public static Tile musicalNote = new MusicNoteTile(0);
	
	
	//class
	protected BufferedImage texture;
	protected final int id;
	
	public static final int TILEWIDTH = 64, TILEHEIGHT = 64;
	
	public Tile(BufferedImage texture, int id) {
		this.texture = texture;
		this.id = id;
		
		tiles[id] = this;
	}
	
	public void tick(){
		
	}
	
	public void render(Graphics graphics, int x, int y){
		graphics.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT,null);
	}
	
	public boolean isSolid(){
		return false;
	}
	
	public int getID(){
		return id;
	}
}
