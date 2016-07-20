package receiver;

public interface Shape {

	public void create(int dimn);
	
	public void scales(int scaleBy);
	
	public void move(int moveBy, Direction dic);
	
	public void remove();
	
	public void unscale(int scaleBy);
	
	
}
