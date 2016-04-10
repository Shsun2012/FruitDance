package entities;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import state.GameState;

public class HUD {
	
	public static int score = 0;
	public static int highScore = 0;
	private Font scoreFont;
	public static int judge;
	
	public HUD() {
		
	}
	
	public static int getScore() {
		return score;
	}

	public static void setScore(int score) {
		HUD.score = score;
	}

	public int getHighScore() {
		return highScore;
	}

	public static void setHighScore(int highScore) {
		highScore = highScore;
	}

	public void tick(){
	}
	
	public void render(Graphics graphics){
		Font font0 = new Font("arial", Font.BOLD, 50);
		graphics.setFont(font0);
		graphics.setColor(Color.white);
		graphics.drawString("Score: "+score, 400, 50);
		
		Font font = new Font("arial", Font.BOLD, 80);
		graphics.setFont(font);
		
		if (judge==0&&score!=0) {
			graphics.setColor(Color.pink);
			graphics.drawString("Perfect!", 340, 400);
		}else if (judge==1) {
			graphics.setColor(Color.orange);
			graphics.drawString("Good!", 350, 400);
		}else if (judge==2) {
			graphics.setColor(Color.green);
			graphics.drawString("Poor!", 350, 400);
		}
	}
}
