package org.bgj05.main;

import java.io.IOException;
import java.util.HashMap;
import org.isjaki.Isjaki;
import org.isjaki.audio.Waveform;
import org.isjaki.graphics.Texture2D;

public class Content {
	private static HashMap<String, Texture2D> textureMap =
								new HashMap<String, Texture2D>();
	private static HashMap<String, Waveform>  audioMap = 
								new HashMap<String, Waveform>();
	
	
	
	
	
	public static void init() {		
		//I guess this is how this works
		
		//load asteroids
		loadTexture("bad_asteroid.png", "/BGJ05/res/");
		//this.loadTexture(name, path)
		
		//this.loadWaveform("Name", "Path");
		
		
		
	}
	
	public static Texture2D getTexture(String name) {
		return textureMap.get(name);
	}
	
	public static Waveform getWaveform(String name) {
		return audioMap.get(name);
	}
	
	protected static void loadTexture(String name, String path) {
		if (textureMap.containsKey(name)) {
			System.out.println("Texture \"" + name + "\" already exists!");
			return; 
		}
		
		try { textureMap.put(name, Isjaki.loadTexture(path)); } 
		catch (IOException e) { e.printStackTrace(); }
	}
	
	protected static void loadWaveform(String name, String path) {
		if (textureMap.containsKey(name)) {
			System.out.println("Waveform \"" + name + "\" already exists!");
			return; 
		}
		
		try { audioMap.put(name, Isjaki.loadWaveform(path)); } 
		catch (IOException e) { e.printStackTrace(); }
	}
}
