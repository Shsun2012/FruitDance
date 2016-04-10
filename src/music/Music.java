package music;

import java.io.File;
import java.util.ArrayList;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;

import state.MenuState;
import sun.audio.*;


public class Music implements Runnable{
	
	private ArrayList<String> musicFiles;
	private int currentSongIndex;
	public static Clip clip;
	public Music(String... files) {
		musicFiles = new ArrayList<String>();
		for (String file : files) {
			musicFiles.add("resource/"+file+".wav");
		}
	}
	
	private void playSound(String fileName) {
		try {
			File soundFile = new File(fileName);
			
			AudioInputStream audioInputStream=AudioSystem.getAudioInputStream(getClass().getResource("/East of Eden.wav"));
			AudioFormat format = audioInputStream.getFormat();
			DataLine.Info  info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(audioInputStream);
			FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			gainControl.setValue(-10);
			clip.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		playSound(musicFiles.get(currentSongIndex));
	}

	public void stop(){
		clip.close();
	}
	
}
