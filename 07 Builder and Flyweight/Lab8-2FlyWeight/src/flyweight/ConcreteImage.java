package flyweight;

public class ConcreteImage implements Image{
	private Map map; //only the intrinsic state

	public ConcreteImage(Map map){
		this.map = map;
	}

	@Override
	public void createMap(Map map, int xPos, int yPos) {
		// TODO Auto-generated method stub
		map.drawPoint(xPos, yPos);
	}
	
}
