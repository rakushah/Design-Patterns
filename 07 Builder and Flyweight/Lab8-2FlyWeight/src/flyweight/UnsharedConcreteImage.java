package flyweight;

public class UnsharedConcreteImage implements Image{
	private Map  map; //only the intrinsic state
	private int xPos; //extrinsic state 
	private int yPos; //extrinsic state 
	
	public UnsharedConcreteImage(Map map, int xPos, int yPos){
		this.map = map;
		this.xPos = xPos;
		this.yPos = yPos;
	}

	@Override
	public void createMap(Map map, int xPos, int yPos) {
		// TODO Auto-generated method stub
		map.drawPoint(xPos, yPos);
	}
}
