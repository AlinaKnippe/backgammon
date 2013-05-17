package model;

public class Steinchen {
	public int playerID;
	public int pos;
	public int steinchenID;
	public int wegLaenge;
	
	public Steinchen(int plID, int sID){
		playerID = plID;
		steinchenID = sID;

	}

	public int getPlayerID() {
		return playerID;
	}

	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}

	public int getPos() {
		return pos;
	}

	public void setPos(int pos) {
		this.pos = pos;
	}

	public int getSteinchenID() {
		return steinchenID;
	}

	public void setSteinchenID(int steinchenID) {
		this.steinchenID = steinchenID;
	}

	public int getWegLaenge() {
		return wegLaenge;
	}

	public void setWegLaenge(int wegLaenge) {
		this.wegLaenge = wegLaenge;
	}
}


