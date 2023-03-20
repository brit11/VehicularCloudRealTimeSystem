
public class Checkpoint {
	String currentState;
	
	public Checkpoint(String currentState) {
		this.currentState = currentState;
	}
	
	public String getCurrentState() {
		return currentState;
	}
	
	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}
}
