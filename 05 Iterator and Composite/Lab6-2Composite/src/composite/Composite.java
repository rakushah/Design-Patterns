package composite;

import java.util.ArrayList;
import java.util.Iterator;

import component.Component;

public class Composite extends Component {

	ArrayList components = new ArrayList();
	String compositeName;

	public Composite(String name) {
		compositeName = name;
	}

	public void add(Component component) {
		components.add(component);
	}

	public void remove(Component component) {
		components.remove(component);
	}

	public Component get(int componentIndex) {
		return (Component) (components.get(componentIndex));
	}

	public String getComponentName() {
		return compositeName;
	}

	public void displayInfo() {

		System.out.println(compositeName +"\n");
		
		Iterator iterator = components.iterator();
		while(iterator.hasNext()){
			
			((Component)iterator.next()).displayInfo();
		}

	}
}
