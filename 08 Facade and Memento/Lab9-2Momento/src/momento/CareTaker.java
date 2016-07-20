package momento;

import java.util.ArrayList;

public class CareTaker {

	public ArrayList<Memento> savedState = new ArrayList<>();

	public void addMemento(Memento m) {
		savedState.add(m);
	}

	public Memento getMemento(int index) {
		return savedState.get(index);
	}
}
