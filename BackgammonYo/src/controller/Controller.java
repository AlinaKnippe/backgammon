package controller;

import model.Player;
import model.Playground;

public class Controller implements IController {
	
	
	public enum GAMESTATE{
		WAEHLE_STEIN, WUERFELN, SPIEL_ENDE
	}
	
	private GAMESTATE status;
	
	private Playground playfield;
	private Player playerID;
	private int zahl;
	private int zahl2;
	
	
	public Controller(){
		
		this.playfield = new Playground();
		
	}
	
	
	//public void start(){
		
		
	//}
	
	public Playground getPlayground(){
		return playfield;
	}

	

}
