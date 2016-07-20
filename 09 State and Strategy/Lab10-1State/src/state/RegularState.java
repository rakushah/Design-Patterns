package state;

public class RegularState implements State {

	GameSimulator gs;
	int maxSpeed = 20;
	int currentSpeed = 9;// default acceleration

	public RegularState(GameSimulator gs) {
		this.gs = gs;
	}

	@Override
	public void turnLeft() {
		// 5
		System.out.println("Turning left on" + this.getClass().getSimpleName());
		currentSpeed = 5;
		System.out.println("Speed:" + currentSpeed);
	}

	@Override
	public void applyAcclerator() {
		// 9
		System.out.println("Accelerating on" + this.getClass().getSimpleName());
		System.out.println("Speed:" + currentSpeed);

		currentSpeed += 9;
		if (currentSpeed > maxSpeed) {
			gs.setCurrentRoad(gs.getGravelRoad());
		}

	}

	@Override
	public void turnRight() {
		// 5
		System.out.println("Turning right on" + this.getClass().getSimpleName());
		currentSpeed = 5;
		System.out.println("Speed:" + currentSpeed);
	}

	@Override
	public void applyBreak() {
		// 8
		System.out.println("Applying brake on" + this.getClass().getSimpleName());
		currentSpeed = 8;
		System.out.println("Speed:" + currentSpeed);
	}

}
