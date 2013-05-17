package observer;

import java.awt.List;
import java.util.ArrayList;

public class Observable {
	
	private ArrayList<IObserver> subscribers = new ArrayList<IObserver>(2);
	
	public void addObserver(IObserver s){
		subscribers.add(s);
	}
	
	public void removeObserver(IObserver s){
		subscribers.remove(s);
	}
	
	public void removeAllObservers(IObserver s){
		subscribers.clear();
		
	}
	//neu
	public void notifyObserver(IObserver s){
		subscribers.notify();
	}
	
	public void notifyAllObserver(IObserver s){
		subscribers.notifyAll();
	}
	

}
