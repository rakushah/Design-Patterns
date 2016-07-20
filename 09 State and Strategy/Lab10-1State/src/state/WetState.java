package state;

public class WetState implements State {
	GameSimulator gs;
	int maxSpeed = 20;
	int currentSpeed = 9;// default acceleration

	public WetState(GameSimulator gs) {
		this.gs = gs;
	}

	@Override
	public void turnLeft() {
		// 4
		System.out.println("Turning left on" + this.getClass().getSimpleName());
		currentSpeed = 4;
		System.out.println("Speed:" + currentSpeed);

	}

	@Override
	public void applyAcclerator() {
		// 9
		System.out.println("Accelerating on" + this.getClass().getSimpleName());
		System.out.println("Speed:" + currentSpeed);

		currentSpeed *= 2;

		if (currentSpeed > maxSpeed) {
			gs.setCurrentRoad(gs.getIcyRoad());
		}
	}

	@Override
	public void turnRight() {
		// 4
		System.out.println("Turning right on" + this.getClass().getSimpleName());
		currentSpeed = 4;
		System.out.println("Speed:" + currentSpeed);
	}

	@Override
	public void applyBreak() {
		// 7
		System.out.println("Applying brake on" + this.getClass().getSimpleName());
		currentSpeed = 7;
		System.out.println("Speed:" + currentSpeed);
	}

}
