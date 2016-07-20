package state;

public class GameSimulator {
	private State regularRoad;
	private State gravelRoad;
	private State wetRoad;
	private State icyRoad;
	private State currentRoad;

	public GameSimulator() {
		regularRoad = new RegularState(this);
		gravelRoad = new GravelState(this);
		wetRoad = new WetState(this);
		icyRoad = new IceState(this);

		currentRoad = regularRoad;
	}

	public void turnLeft() {
		currentRoad.turnLeft();

	}

	public void applyAcclerator() {
		currentRoad.applyAcclerator();

	}

	public void turnRight() {
		currentRoad.turnRight();

	}

	public void applyBreak() {
		currentRoad.applyBreak();

	}
	
	public void setCurrentRoad(State road){
		currentRoad = road;
	}

	public State getGravelRoad() {
		return gravelRoad;
	}

	public State getRegularRoad() {
		return regularRoad;
	}

	public State getWetRoad() {
		return wetRoad;
	}

	public State getIcyRoad() {
		return icyRoad;
	}

	public State getCurrentRoad() {
		return currentRoad;
	}
	
	public void completeRace(){
		System.out.println("Race completed");
	}


}
