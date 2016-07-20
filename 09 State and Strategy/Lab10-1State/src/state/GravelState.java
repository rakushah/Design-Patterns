package state;

public class GravelState implements State {

	GameSimulator gs;
	int maxSpeed = 20;
	int currentSpeed = 7;// default acceleration

	public GravelState(GameSimulator gs) {
		this.gs = gs;
	}

	@Override
	public void turnLeft() {
		System.out.println("Turning left in " + this.getClass().getSimpleName());
		currentSpeed = 3;
		System.out.println("Speed:" + currentSpeed);
	}

	@Override
	public void turnRight() {
		System.out.println("Turning Right in " + this.getClass().getSimpleName());
		currentSpeed = 3;
		System.out.println("Speed:" + currentSpeed);

	}

	@Override
	public void applyBreak() {
		System.out.println("Applying Break in " + this.getClass().getSimpleName());
		currentSpeed = 6;
		System.out.println("Speed:" + currentSpeed);

	}

	@Override
	public void applyAcclerator() {
		System.out.println("Acclerating in " + this.getClass().getSimpleName());
		System.out.println("Speed:" + currentSpeed);

		currentSpeed *= 2;

		if (currentSpeed > maxSpeed) {
			gs.setCurrentRoad(gs.getWetRoad());
		}
	}

}
