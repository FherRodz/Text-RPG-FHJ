package Game.Level.States;

public class State {
	
	//Possible game states
	public static final int START_STATE = -1;
	public static final int GETTING_READY = 0;
	public static final int PLAYING_STATE = 1;
	public static final int FIGHT_STATE = 2;
	public static final int INVENTORY_STATE = 3;
	public static final int PAUSE_STATE = 4;
	
	private int currentState = START_STATE;
	private int startState = START_STATE;

	
	//GETTER & SETTERS
	public int getCurrentState() {
		return currentState;
	}
	public void setCurrentState(int currentState) {
		this.currentState = currentState;
	}
	
	public int getStartState() {
		return startState;
	}
	public void setStartState(int startState) {
		this.startState = startState;
	}
		
}
