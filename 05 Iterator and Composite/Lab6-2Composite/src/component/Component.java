package component;

public abstract class Component {

	public void add(Component component){
		throw new UnsupportedOperationException();
	}
	public void remove(Component component){
		throw new UnsupportedOperationException();
	}
	public Component get(int componentIndex){
		throw new UnsupportedOperationException();
	}
	public String getComponentName(){
		throw new UnsupportedOperationException();
	}
	public String getLeafName(){
		throw new UnsupportedOperationException();
	}
	public void displayInfo() {
		
		throw new UnsupportedOperationException();
				
	}
}
