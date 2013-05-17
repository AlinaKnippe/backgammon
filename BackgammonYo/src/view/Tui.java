package view;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Logger;

import model.Steinchen;
import observer.IObserver;
import controller.IController;

public class Tui implements IObserver {
	
	//Fuer print Ausgaben
	private Logger logger = Logger.getLogger("view.Tui");
	
	private IController controller;
	
	
	public Tui (IController icontrol){
	
		super();
		
		this.controller = icontrol;
	}
	
	//Spielfeld erstellen und ausgeben
	public void updatePrintField(){
		
		ArrayList<LinkedList<Steinchen>> spielfeld = controller.getPlayground().getField();
		
		for(int i = 0; i < 24; i++){
			
			for(int j = 0; j < spielfeld.get(i).size(); j++){
				
				if(spielfeld.get(i).get(j) != null){
					
					print(spielfeld.get(i).get(j).getSteinchenID());
				}
			}
		}
	}
	
	public void println(String sg){
		logger.info(sg);
	}
	
	//ohne Absatz
	public void print(int i){
		logger.info("" + i);
	}
	
	

}
