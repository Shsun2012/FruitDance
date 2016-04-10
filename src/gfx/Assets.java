package gfx;
/*
 * Any sound, picture, etc.
 * Load only once
 */

import java.awt.Image;
import java.awt.image.BufferedImage;

import music.Sound;

public class Assets {
	
	private static final int width=110, height=128;
	
	//player
	public static BufferedImage[] player_move0;
	public static BufferedImage[] player_move1;
	public static BufferedImage[] player_move2;
	public static BufferedImage[] player_move3;
	public static BufferedImage[] player_move4;
	public static BufferedImage[] player_move5;
	public static BufferedImage[] player_move6;
	public static BufferedImage[] player_move7;
	public static BufferedImage[] player_move8;
	public static BufferedImage[] player_move9;
	
	//musical note
	public static BufferedImage note1;
	public static BufferedImage note2;
	public static BufferedImage note3;
	public static BufferedImage note4;
	
	//background
	public static BufferedImage background1;
	public static BufferedImage instruction;
	
	//sound effects
	public static Sound sound1;
	public static Sound sound2;
	public static Sound sound3;
	
	
	public static void init(){
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/Dance.png"));
		SpriteSheet musicalNote = new SpriteSheet(ImageLoader.loadImage("/musicNote.png"));
		SpriteSheet bgSheet = new SpriteSheet(ImageLoader.loadImage("/testbgm.png"));
		SpriteSheet bgSheet2= new SpriteSheet(ImageLoader.loadImage("/instruction.png"));
		
		background1=bgSheet.crop(0, 0, 1000, 600);
		instruction=bgSheet2.crop(0, 0, 1000, 600);
		
		
		player_move0 = new BufferedImage[8];
		player_move1 = new BufferedImage[8];
		player_move2 = new BufferedImage[8];
		player_move3 = new BufferedImage[8];
		player_move4 = new BufferedImage[8];
		player_move5 = new BufferedImage[8];
		player_move6 = new BufferedImage[8];
		player_move7 = new BufferedImage[8];
		player_move8 = new BufferedImage[8];
		player_move9 = new BufferedImage[8];
		
		for(int i=0;i<8;i++){
			player_move0[i]=sheet.crop(i*width, 0, width, height);
			player_move1[i]=sheet.crop(i*width, 1*height, width, height);
			player_move2[i]=sheet.crop(i*width, 2*height, width, height);
			player_move3[i]=sheet.crop(i*width, 3*height, width, height);
			player_move4[i]=sheet.crop(i*width, 4*height, width, height);
			player_move5[i]=sheet.crop(i*width, 5*height, width, height);
			player_move6[i]=sheet.crop(i*width, 6*height, width, height);
			player_move7[i]=sheet.crop(i*width, 7*height, width, height);
			player_move8[i]=sheet.crop(i*width, 8*height, width, height);
			player_move9[i]=sheet.crop(i*width, 9*height, width, height);
		}
		
		note1 = musicalNote.crop(0, 0, 100, 100);
		note2 = musicalNote.crop(100, 0, 100, 100);
		note3 = musicalNote.crop(200, 0, 100, 100);
		note4 = musicalNote.crop(300, 0, 100, 100);
		
		
		sound1 = new Sound("/CB_Clap.wav");
		sound2 = new Sound("/Clap Basic.wav");
		//sound3 = new Sound("resource/Filtered Kick.wav");
		
	}
}
