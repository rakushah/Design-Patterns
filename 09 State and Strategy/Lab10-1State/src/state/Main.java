package state;

public class Main {
	public static void main(String[] args){
		GameSimulator race = new GameSimulator();
		race.applyAcclerator();
		race.turnLeft();
		race.turnRight();
		
		race.applyAcclerator();
		race.applyAcclerator();
		race.applyAcclerator();
		
		race.turnLeft();
		race.applyAcclerator();
		race.turnRight();
		
		race.applyAcclerator();
		race.applyAcclerator();
		race.applyAcclerator();
		race.applyAcclerator();
		
		race.turnLeft();
		race.turnRight();
		race.turnLeft();
		race.applyAcclerator();
		race.turnRight();
		race.applyAcclerator();
		race.applyAcclerator();
		race.applyAcclerator();
		race.applyAcclerator();
		race.applyAcclerator();
		race.applyAcclerator();
		race.applyAcclerator();
		
	}
}
