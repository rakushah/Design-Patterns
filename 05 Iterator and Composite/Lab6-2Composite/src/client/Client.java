package client;

import component.Component;

public class Client {
	Component componentList;

	// newcomponentList contains every leaf, component,
	// and any leaf saved in component

	public Client(Component newcomponentList) {

		componentList = newcomponentList;

	}

	// Calls the displayInfo() on every leaf
	// or component stored in componentList

	public void getComponentList() {

		componentList.displayInfo();

	}
}
