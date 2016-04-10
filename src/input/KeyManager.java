package input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener{
	private boolean[] keys;
	public boolean move0,move1,move2,move3,move4,move5,move6,move7,move8,move9;
	
	public KeyManager() {
		keys = new boolean[256];
	}
	public void tick() {
		move1 =keys[KeyEvent.VK_A];
		move2 =keys[KeyEvent.VK_S];
		move3 =keys[KeyEvent.VK_D];
		move4 =keys[KeyEvent.VK_F];
		move5 =keys[KeyEvent.VK_H];
		move6 =keys[KeyEvent.VK_J];
		move7 =keys[KeyEvent.VK_K];
		move8 =keys[KeyEvent.VK_L];
		
	}
	
	
	
	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

}
