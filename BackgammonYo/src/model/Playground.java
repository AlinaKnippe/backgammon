package model;

import java.util.ArrayList;
import java.util.LinkedList;

public class Playground {

	
	public int anzahlPlayer;
	public ArrayList<LinkedList<Steinchen>> field; 
	public LinkedList<Player> playerList;
	
	//Konstruktor fuer Playground
	public Playground(){
		
		anzahlPlayer = 2;
		
		//Spielfeldelemente in einer Array List (Zacken)
		field = new ArrayList<LinkedList<Steinchen>>(24);
		
		//Fuer jeden Spieler eine LinkedList
		playerList = new LinkedList<Player>();
		
		//Player zur LinkedList hinzufuegen
		for(int i=0; i<2; i++){
			playerList.add(new Player(i));
		}
		
	}
	

	public int getAnzPlayer(){
		return anzahlPlayer;
	}
	
	public Player getPlayer(int pID){
		return playerList.get(pID);
	}
	
	public ArrayList<LinkedList<Steinchen>> getField(){
		return field;
	}
	
	//Bestimmten Stein holen von einer bestimmten Position
	public Steinchen getSteinOnPosition(int pos){
		
		//LinkedList Laenge abfragen
		int linkedListSize = field.get(pos).size();
		
		if(field.get(pos) == null){
			return null;
		}else{
			//die Position in der LinkedList zurueckgeben
			return field.get(pos).get(linkedListSize-1);
			}
			
		}
	
	
	//Einen Stein auf eine bestimmte Position setzen
	public void setSteinOnPosition(Steinchen s, int pos){
		
		if(field.get(pos) == null){
			//Stein setzen
			field.get(pos).add(s);
			
			//neue Position des Steins
			s.setPos(pos);
		}
	}
	
}
