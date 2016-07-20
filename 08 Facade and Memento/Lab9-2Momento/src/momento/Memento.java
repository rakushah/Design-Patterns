package momento;

public class Memento {

	private Person state;

	public Memento(Person stateToSave) {
		state = stateToSave;
	}

	public Person getSavedState() {
		return state;
	}

}
