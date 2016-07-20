package leaf;

import component.Component;

public class Leaf extends Component{

	private String name;

	public Leaf(String name) {
		this.name = name;
	}

	public String getLeafName() {
		return name;
	}
	public void displayInfo() {

		System.out.println(name +"\n");

	}
}
