package entities;

import hw4.Handler;
import utils.Utils;

public class MusicSet {
	
	private Marks marks[];
	private Handler handler;
	public MusicSet(Handler handler) {
		marks = new Marks[200];
		this.handler= handler;
	}
	
	public void LoadFile(String path1, String path2){
		String xPos = Utils.loadFileAsString(path1);
		String yPos = Utils.loadFileAsString(path2);
		String[] xTokens = xPos.split("\\s+");
		String[] yTokens = yPos.split("\\s+");
		
	}
	
	public Marks[] setMarks(){
		return marks;
	}
}
