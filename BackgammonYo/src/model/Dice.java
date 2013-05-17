package model;

import java.util.*;
//Dice1 Funktion, Dice2 Funk. Player.rolling anpassen
public class Dice {
	
	public int value1;
	public int value2;
	
	public ArrayList<Dice> dice = new ArrayList<Dice>();
	
	public Dice(){
		
		Random generator = new Random();	
		value1 = generator.nextInt(6) +1;
		value2 = generator.nextInt(6) +1;
		
		//dice = new Dice();
	}

	public int PlayerDice() {
		
		
	}
	
	public int doubleDice(){
		
		Random generator = new Random();
		int dice1 = generator.nextInt(6) +1;
		int dice2 = generator.nextInt(6) +1;
		

		
		for (int n=0; n<2; n++){
		

			int dice1 = generator.nextInt(6) +1;
			
			return dice1;
		}
	}
}
