package hw4;

import java.io.InputStream;

import gfx.ReadRecord;
import gfx.Record;

public class Launch {
	public static void main(String[] args){
		
		Game game = new Game("Fruit Dance", 1000, 600);
		game.start();
		
	}
}
