package model;

import java.util.ArrayList;

public class Player {
	
	public int playerID;
	public ArrayList<Steinchen> steine = new ArrayList<Steinchen>();
	public Dice dice;
	public int startposition;
	
	//Konstruktor fuer Player
	public Player(int pID){
		
		playerID = pID;
		
		//Jeder Spieler bekommt 15 Steine
		for(int i=0; i<14; i++){
			steine.add(new Steinchen(this.playerID, i));
		} 
		
		dice = new Dice();
		
		//Startposition fuer die einzelnen Spieler initialisieren
		switch(playerID){
		case 0:
			this.startposition = 0;
		case 1:
			this.startposition = 12;
		}
		
	}

	
	
	public int getPlayerID() {
		return playerID;
	}

	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}

	//Gibt nur den einzelnen Stein zurueck, nicht die ArrayList mit Steinen
	
	public Steinchen getStein(int steinID) {
		return steine.get(steinID);
		
	}
	
	
	/*public int rolling(){
		return dice.doubleDice();
		
	}*/

	

}
