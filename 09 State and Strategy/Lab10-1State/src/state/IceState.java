package state;

public class IceState implements State {

	GameSimulator gs;
	int maxSpeed = 20;
	int currentSpeed = 3;// default acceleration

	public IceState(GameSimulator gs) {
		this.gs = gs;
	}

	@Override
	public void turnLeft() {
		// 1
		System.out.println("Turning left on" + this.getClass().getSimpleName());
		currentSpeed = 1;
		System.out.println("Speed:" + currentSpeed);

	}

	@Override
	public void applyAcclerator() {
		// 3
		System.out.println("Accelerating on" + this.getClass().getSimpleName());
		System.out.println("Speed:" + currentSpeed);

		currentSpeed *= 2;

		if (currentSpeed > maxSpeed) {
			gs.completeRace();
		}
	}

	@Override
	public void turnRight() {
		// 1
		System.out.println("Turning right on" + this.getClass().getSimpleName());
		currentSpeed = 1;
		System.out.println("Speed:" + currentSpeed);
	}

	@Override
	public void applyBreak() {
		// 2
		System.out.println("Applying brake on" + this.getClass().getSimpleName());

		currentSpeed = 2;
		System.out.println("Speed:" + currentSpeed);
	}

}
