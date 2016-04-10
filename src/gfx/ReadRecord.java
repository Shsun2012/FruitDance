package gfx;

import entities.Marks;
import utils.Utils;

public class ReadRecord {

	private double interval[];
	public ReadRecord() {
	
	}
	
	public void loadRecord(String path){
		String file = Utils.loadFileAsString(path);
		
		String[] tokens = file.split("\\s+");
		interval=new double[tokens.length];
		double tempAll=758.258;	
		for (int i = 0; i < tokens.length; i++) {
			interval[i]=Double.parseDouble(tokens[i]);
			tempAll+=interval[i];
			System.out.println("marks = new Marks(handler, (float) 125*"+(int)(Math.random()*7)+"+15, (float)-"+tempAll
					+");  musicNotes["+i+"] = marks;");
		}
	}
}
